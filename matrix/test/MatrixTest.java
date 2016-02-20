import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;
import org.junit.Ignore;
 

public class MatrixTest {
	Matrix matrix;
	Matrix matrix2;

	@Before
	public void setUp(){
		matrix = new Matrix(2,2);
		matrix2 = new Matrix(2,2);
	}

	@Test
	public void aditionTest() {
		matrix.addToPosition(0,0,1);
		matrix.addToPosition(0,1,1);
		matrix.addToPosition(1,0,1);
		matrix.addToPosition(1,1,1);

		matrix2.addToPosition(0,0,1);
		matrix2.addToPosition(0,1,2);
		matrix2.addToPosition(1,0,3);
		matrix2.addToPosition(1,1,4);

		Matrix result = matrix.add(matrix2);
		Matrix expected = new Matrix(2,2);
		int[] rowFirst = {2,3};
		int[] rowSecond = {4,5};
		expected.populateByRow(0, rowFirst);
		expected.populateByRow(1, rowSecond);

		assertEquals(true, result.isEqualTo(expected));
	}

	@Test
	public void aditionTestFor3by3() {
		Matrix matrix = new Matrix(3,3);

		int[] rowFirst = {1,1,1};
		int[] rowSecond = {1,1,1};
		int[] rowThird = {1,1,1};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);

		Matrix matrix2 = new Matrix(3,3);

		int[] rowFirstFor2ndMatrix = {1,2,3};
		int[] rowSecondFor2ndMatrix = {1,2,3};
		int[] rowThirdFor2ndMatrix = {1,2,3};
		matrix2.populateByRow(0, rowFirstFor2ndMatrix);
		matrix2.populateByRow(1, rowSecondFor2ndMatrix);
		matrix2.populateByRow(2, rowThirdFor2ndMatrix);

		Matrix expected = new Matrix(3,3);

		int[] resulrFirstRow = {2,3,4};
		int[] resulrSecondRow = {2,3,4};
		int[] resulrThirdRow = {2,3,4};

		expected.populateByRow(0, resulrFirstRow);
		expected.populateByRow(1, resulrSecondRow);
		expected.populateByRow(2, resulrThirdRow);

		Matrix result = matrix.add(matrix2);
		assertEquals(true, result.isEqualTo(expected));
	}

	// @Ignore("Test is ignored as a demonstration")
	@Test
	public void determinantTest() {
		Matrix matrix = new Matrix(3,3);
		int[] rowFirst = {1,1,1};
		int[] rowSecond = {2,1,1};
		int[] rowThird = {2,1,2};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);


		int determinant = matrix.determinant();
		assertEquals(-1,determinant);
	}
	@Test
	public void determinantTest1() {
		Matrix matrix = new Matrix(3,3);
		int[] rowFirst = {1,1,1};
		int[] rowSecond = {1,1,1};
		int[] rowThird = {1,1,1};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);


		int determinant = matrix.determinant();
		assertEquals(0,determinant);
	}
	@Test
	public void determinantTest2() {
		Matrix matrix = new Matrix(3,3);
		int[] rowFirst = {1,2,3};
		int[] rowSecond = {1,2,4};
		int[] rowThird = {2,3,4};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);


		int determinant = matrix.determinant();
		assertEquals(1,determinant);
	}
	@Test
	public void determinantTest4by4() {
		Matrix matrix = new Matrix(4,4);
		int[] rowFirst = {1,2,3,4};
		int[] rowSecond = {2,3,4,5};
		int[] rowThird = {2,3,4,7};
		int[] rowFourth = {2,3,2,3};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);
		matrix.populateByRow(3, rowFourth);


		int determinant = matrix.determinant();
		assertEquals(-4,determinant);
	}
	@Test
	public void determinantTest5by5() {
		Matrix matrix = new Matrix(5,5);
		int[] rowFirst = {1,2,3,4,3};
		int[] rowSecond = {2,3,4,5,4};
		int[] rowThird = {2,3,4,7,5};
		int[] rowFourth = {2,3,2,3,6};
		int[] rowFifth = {1,2,3,0,7};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);
		matrix.populateByRow(3, rowFourth);
		matrix.populateByRow(4,rowFifth);

		int determinant = matrix.determinant();
		assertEquals(-24,determinant);
	}
		
	@Test
	public void determinantTest10by10() {
		Matrix matrix = new Matrix(10,10);
		int[] rowFirst = {1,2,3,4,3,2,3,4,5,6};
		int[] rowSecond = {2,3,4,5,4,1,1,4,6,7};
		int[] rowThird = {2,3,4,7,5,0,0,4,5,6};
		int[] rowFourth = {2,3,2,3,6,9,6,7,4,2};
		int[] rowFifth = {1,2,3,0,7,6,4,3,2,1};
		int[] rowSixth = {1,2,3,2,3,4,5,3,4,5 };
		int[] rowSeventh = {1,2,3,4,5,6,7,8,9,2};
		int[] rowEighth = {2,3,4,2,3,5,6,0,0,1};
		int[] rowNineth = {1,1,1,2,3,6,5,4,5,8};
		int[] rowTenth = {2,3,4,5,3,1,2,1,3,2};

		matrix.populateByRow(0,rowFirst);
		matrix.populateByRow(1,rowSecond);
		matrix.populateByRow(2,rowThird);
		matrix.populateByRow(3, rowFourth);
		matrix.populateByRow(4,rowFifth);
		matrix.populateByRow(5,rowSixth);
		matrix.populateByRow(6,rowSeventh);
		matrix.populateByRow(7,rowEighth);
		matrix.populateByRow(8,rowNineth);
		matrix.populateByRow(9,rowTenth);

		int determinant = matrix.determinant();
		assertEquals(4464,determinant);
	}	

	
	@Test
	public void multiplyTest() {
		int[] rowFirst = {1,3};
		int[] rowSecond = {1,8};

		matrix.populateByRow(0, rowFirst);
		matrix.populateByRow(1, rowSecond);

		int[] rowFirstFor2ndMatrix = {1,2};
		int[] rowSecondFor2ndMatrix = {3,4};
		matrix2.populateByRow(0, rowFirstFor2ndMatrix);
		matrix2.populateByRow(1, rowSecondFor2ndMatrix);

		Matrix expected = new Matrix(2,2);
		int[] rowFirstForRes = {10,14};
		int[] rowSecondForRes = {25,34};

		expected.populateByRow(0, rowFirstForRes);
		expected.populateByRow(1, rowSecondForRes);

		Matrix result = matrix.multiply(matrix2);
		assertTrue(result.isEqualTo(expected));
	}
}
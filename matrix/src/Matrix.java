import java.util.Arrays;
public class Matrix {
	private int[][] matrix;
	private int row;
	private int column;

	public Matrix(int row, int column) {
		this.matrix = new int[row][column];
		this.row = row;
		this.column = column;
	}

	public void addToPosition(int rowPosition, int columnPosition, int value) {
		this.matrix[rowPosition][columnPosition] = value;
	}

	public void print(){
		for (int i = 0;i < this.row ;i++) {
			for (int j = 0;j < this.column ;j++) 
				System.out.println(this.matrix[i][j]+" "+i+" "+j);
		}
	}

	public Matrix add(Matrix toAddMatrix) {
		Matrix addedMatrix = new Matrix(this.row, this.column);
		for (int i = 0;i < this.row ;i++) {
			for (int j = 0;j < this.column ;j++ ) {
				int sum = this.matrix[i][j] + toAddMatrix.matrix[i][j];
				addedMatrix.addToPosition(i, j, sum);
			}
		}
		return addedMatrix;
	}

	private int getFromPosition(int rowPosition, int columnPosition) {
		return this.matrix[rowPosition][columnPosition];
	}

	public Matrix multiply(Matrix mulMatrix) {
		Matrix multipliedMatrix = new Matrix(this.row, this.column);
		for (int i = 0; i < this.row; i++ ) {
			for (int j = 0;j < this.column; j++ ) {
				int multiplied = 0;
				for (int k = 0; k < this.column ; k++)
					multiplied += this.matrix[i][k] * mulMatrix.matrix[k][j];
				multipliedMatrix.addToPosition(i,j,multiplied);
			}
		}
		return multipliedMatrix;
	}

	public Boolean isEqualTo(Matrix other) {
		return Arrays.deepEquals(this.matrix, other.matrix);
	}

	public void populateByRow(int rowPosition, int[] values) {
		int tillValuesLength = 0;
		for (int j = 0;j < this.column ;j++ )
			this.matrix[rowPosition][j] = values[tillValuesLength++];			
	}

	private Matrix subMatrixOf(int columnPosition) {
		Matrix subMatrix = new Matrix(this.row - 1, this.column - 1);
		int rowCounter = 0;
		int columnCounter = 0;
		
		for (int i = 0;i < this.row ;i++ ) {
			for (int j = 0;j < this.column ;j++ ) {
				if(i != 0 && j != columnPosition)
					subMatrix.addToPosition(rowCounter, columnCounter++, this.matrix[i][j]);
				if(this.column - 1 == columnCounter){
					rowCounter ++;
					columnCounter = 0;
				}
			}
		}
		return subMatrix;
	}

	public int determinant() {
		if(this.row == 1 && this.column == 1)
			return  this.matrix[0][0];
		int determinant = 0;
		for (int i = 0;i < this.column ;i++ )
			 determinant += Math.pow((-1), i) * this.matrix[0][i]  * this.subMatrixOf(i).determinant();

		return determinant;
	}

	public Boolean equals(Object other) {
		if(this == other) return true;
		if(!(other instanceof Matrix)) return false;
		Matrix another = (Matrix) other;
		return Arrays.deepEquals(matrix, another.matrix);
	}
}
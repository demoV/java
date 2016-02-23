public class WC {

	public int numberOfCharector(String content){
		return content.length();
	}

	public int numberOfLines(String content) {
		String[] splitedContent = content.split("\r\n");
		return splitedContent.length - 1;
	}
	public int numberOfWords(String content) {
		String[] splitedContent = content.split("\r\n| ");
		if(splitedContent[0] == "")
			return 0;
		return splitedContent.length;
	}

	public int[] getAllResult(String content){
		int[] result = new int[3];
		result[0] = numberOfLines(content);
		result[1] = numberOfWords(content);
		result[2] = numberOfCharector(content);
		return result; 
	}
	// private Boolean isPresent(String[] options, String option) {
	// 	for (int i=0 ;i<options.length ;i++ ) {
	// 		if(options[i] == option)
	// 			return true;	
	// 	}
	// 	return false;
	// }
	// public String[] getOptions(String[] args) {
	// 	int counter = 0;
	// 	String[] options = new String[3];
	// 	for (int i = 0; i< args.length ;i++ ) {
	// 		if(args[i].charAt(0) == '-' && !isPresent(options, args[i])){
	// 			options[counter ++] = args[i];
	// 		}
	// 	}
	// 	return options;
	// }
	
	// private int numberOfOptions(String[] options) {
	// 	int counter = 0;
	// 	for (int i = 0;i < options.length ;i++ ) {
	// 			if(options[i] != "")
	// 				counter ++;
	// 		}	
	// 	return counter;
	// }
	private String getAllCount(String content, String fileName) {
		int[] allCounts = getAllResult(content);
		String res = "";
		for (int i = 0; i < allCounts.length ;i++ ) {
			res += allCounts[i] + "\t";
		}
		return res + fileName;
	}

	private int countOf(String option, String content) {
		int[] allCounts = getAllResult(content);
		System.out.println((option.charAt(1) == 'l') + "  " + option);
		if(option.charAt(1) == 'l')
			return allCounts[0];
		if(option.charAt(1) == 'w')
			return allCounts[1];
		return allCounts[2];
	}

	private int[] countsOfGivenOptions(String[] options, String content) {
		int[] askedCount = new int[options.length];
		for (int i = 0;i < options.length ;i++ )
			askedCount[i] = countOf(options[i], content);
		return askedCount;
	}
	public int[] getCounts(String[] options, String content) {
		String[] defaultOptions = {"-l", "-w", "-c"};
		int[] allCounts;
		if(options.length == 0)
			allCounts = getAllResult(content);
		else
			allCounts = countsOfGivenOptions(options, content);
		return allCounts;			
	}
}
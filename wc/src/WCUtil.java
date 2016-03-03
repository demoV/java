
public class WCUtil {
	private Boolean isPresent(String[] options, String option) {
		for (int i=0 ;i<options.length ;i++ ) {
			if(options[i] == option)
				return true;	
		}
		return false;
	}
	public String[] getOptions(String[] args) {
		int counter = 0;
		int indexOfFirstFile = indexOfFirstFile(args);
		String[] options = new String[100];
		for (int i = 0; i< indexOfFirstFile ;i++ ) {
			if(args[i].charAt(0) == '-' && !isPresent(options, args[i])){
				options[counter ++] = args[i];
			}
		}
		return removeNonOptions(options);
	}
	
	private Boolean isIllegalOption(String option) {
		char sign = option.charAt(1);
		if(option.length() != 2 || (sign != 'l' && sign != 'w' && sign != 'c'))
			return true;
		return false;
	}
	public String getIllegalOption(String[] options) {
		for (int i = 0;i < options.length ;i++ ) {
			if(isIllegalOption(options[i]))
				throw new Error (illegalOptionError(options[i]));
		}
		return "";
	}
	private int numberOfOptions(String[] options) {
		int counter = 0;
		for (int i = 0;i < options.length ;i++ ) {
				if(options[i] != null)
					counter ++;
			}	
		return counter;
	}
	private String[] removeNonOptions(String[] options){
		int numberOfOptions = numberOfOptions(options);
		String[] optionsAfterRemove = new String[numberOfOptions];
		for (int i = 0;i < optionsAfterRemove.length ;i++ ) {
			optionsAfterRemove[i] = options[i];
		}
		return optionsAfterRemove;
	}
	public String illegalOptionError(String illegalOption) {
		return "wc: " + illegalOption + " illegal option";
	}

	private int indexOfFirstFile(String[] args) {
		for (int i = 0;i < args.length ;i++ ) {
			if(args[i].charAt(0) != '-')
				return i;
		}
		return args.length;
	}
	public String[] getAllFiles(String[] args) {
		int index = indexOfFirstFile(args);
		int numberOfFiles = args.length - index;
		int counter = 0;
		String[] files = new String[numberOfFiles];
		for (int i = index;i < args.length ;i++ )
			files[counter ++] = args[i];
		return files;
	}
	public String getPresentationFormat(Counts[] allCounts) {
		String presantation = "";
		for (int i = 0; i < allCounts.length; i++){
			for (int j = 0; j < allCounts[0].count.length; j++)
				presantation += allCounts[i].count[j] + "\t";
			presantation += allCounts[i].fileName + "\n";
		}
		return  presantation;
	}

}

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
		String[] options = new String[3];
		for (int i = 0; i< args.length ;i++ ) {
			if(args[i].charAt(0) == '-' && !isPresent(options, args[i])){
				options[counter ++] = args[i];
			}
		}
		return removeNonOptions(options);
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
}
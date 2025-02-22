public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	public static String pyramid(int rows) {
		String result = "";
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - 1 - i; j++) {
				result += " ";
			}
			//result += "*";
			//for asodfjsokadfj result += " *";
			//" * *\n* * *"
			//if (i != rows - 1) result += '\n';
			for (int j = 0; j <= i; j++) {
				result += "* ";
			}
			if (i != rows - 1) result += "\n";
			
		}
		return result;
	}
	 

	public static boolean hasLowercase (String letter){
		for ()
	}

}

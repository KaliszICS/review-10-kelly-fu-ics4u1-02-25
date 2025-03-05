public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	//1
	public static String pyramid (int rows){
		String drawing = "";
		for (int i = rows - 1; i >= 0; --i){
			drawing += " ".repeat(i) + '*';
			drawing += " *".repeat(rows - 1 -i);
			if (i != 0){
				drawing += "\n";
			}
		}
		return drawing;
	}

	//2
	public static String square(int length){
		if (length < 0){
			return "";
		}

		String drawing = "*".repeat(length);
		if (length > 1){
			for (int i = 0; i < length - 2; ++i){
			drawing += "\n*" + " ".repeat(length - 2) + '*';
			}
			drawing += '\n' + "*".repeat(length);
		}
		return drawing;
	}


	//3
	public static boolean hasLowercase(String word){
		for (int i = 0; i < word.length(); i++){
			if (Character.isLowerCase(word.charAt(i))){
				return true;
			}
		}
		return false;
	} 


}
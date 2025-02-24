public class PracticeProblem {

	public static void main(String args[]) {
	}
	
	//1
	public static String pyramid (int rows){
	String o ="";
	for (int i = 0; i < rows; i++){
	for (int j = rows - 1; j > 1; j--) {
		//System.out.print(" ");
		o = o+" ";
	}
	for (int j = 0; j <= i; j++){
		//System.out.print("* ");
		o = o+"* ";
	}
	//System.out.println();
	o = o+"\n";
	}
     return o;
}

	 
	//2
	public static void square(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
	}

	//3
	public static boolean hasLowercase (String word){
		for (int i = 0; i <= word.length(); i++){
			if (Character.isLowerCase(word.charAt(i))){
				return true;
			}
		}
		return false;
	}

}

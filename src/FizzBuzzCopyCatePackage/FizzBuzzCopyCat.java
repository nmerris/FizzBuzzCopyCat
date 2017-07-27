package FizzBuzzCopyCatePackage;

public class FizzBuzzCopyCat {
	/**
	 * this program displays numbers between 1 and 100
	 * if it's a multiple of 2, display 'Copy' instead of the number
	 * if it's a multiple of 3, display 'Fizz' instead of the number
	 * if it's a multiple of 5, display 'Buzz' instead of the number
	 * if it's a multiple of 10, display 'Cat' instead of the number
	 * any number that is a multiple of more than one case above,
	 * then output all corresponding words in series, instead of the number
	 * For example, 10 will output "CopyBuzzCat"
	 * For example, 6 will output "CopyFizz"
	 * 
	 * @author Nathan Merris
	 *
	 */
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			String output = ""; // start with empty String
			
			if(i % 2 == 0) { // multiple of 2
				output += "Copy";
			}
			if(i % 3 == 0) { // multiple of 3
				output += "Fizz";
			}
			if(i % 5 == 0) { // multiple of 5
				output += "Buzz";
			}
			if(i % 10 == 0) { // multiple of 10
				output += "Cat";
			}
			if(output == "") { // not a multiple of 2, 3, 5, or 10
				output += i;
			}
//			System.out.println(i + ": " + output);
			System.out.println(output);
		} // for

	} // main

}

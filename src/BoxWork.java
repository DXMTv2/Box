import java.util.Scanner;

public class BoxWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Make a scanner
		Scanner in=new Scanner(System.in);
		
		//Make variables
		String input;
		
		//Ask for a string
		System.out.println("Give me a string");
		
		//Read in String
		input=in.nextLine();
		
		//PART 1 Top Line
		//print *, every letter, *
		System.out.print("* ");
		for (int x=0;x<input.length();x++) {
			System.out.print(input.charAt(x)+" ");
		}
		System.out.println("*");
		
		//PART 2 MIDDLE
		//Loop fpr every letter in string
		for (int x=input.length()-1;x>=0;x--) {
			//print the letters starting at end
			System.out.print(input.charAt(x)+" ");
			//loop for every letter in string	
			for (int y=input.length()-1;y>=0;y--) {
				//print a star
				System.out.print("* ");
			}
		
		//print the letters starting at the beginning
		System.out.println(input.charAt(input.length()-1-x));
		}
		//PART 3 BOTTOM LINE
		//print *, every letter
		System.out.print("* ");
		for (int x=input.length()-1;x>=0;x--) {
			System.out.print(input.charAt(x)+" ");
		}
		System.out.println("* ");
	}

}

import java.util.Scanner;

public class BoxWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//By DLYAN & TYRIQUE (April 13th, Friday 2018)
		
		Scanner in=new Scanner(System.in);
		String input;
		System.out.println("Write in a word: ");
		input=in.nextLine();
		System.out.print("* ");
		for (int x=0;x<input.length();x++) {
			System.out.print(input.charAt(x)+" ");
		}
		System.out.println("*");
		for (int x=input.length()-1;x>=0;x--) {
			System.out.print(input.charAt(x)+" ");
			for (int y=input.length()-1;y>=0;y--) {
				System.out.print("* ");
			}
		System.out.println(input.charAt(input.length()-1-x));
		}
		System.out.print("* ");
		for (int x=input.length()-1;x>=0;x--) {
			System.out.print(input.charAt(x)+" ");
		}
		System.out.println("* ");
	}

}

import java.util.Scanner;

public class HelloWorld {
	
	public static void main(String[] args){
		Scanner name = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String nameS = name.next();		// convert input into string

		System.out.println("Hello, " + nameS + "\n");	// print input as string
	}		
}

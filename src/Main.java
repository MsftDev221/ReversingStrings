import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What would you like reversed?\n(default is : Hello, Java!)\n");
		String input = scanner.nextLine();
		scanner.close();
		
		char[] argumentCharacters = input.toCharArray();
		
		if (argumentCharacters.length == 0) {
			argumentCharacters = "Hello, Java!".toCharArray();
		}
		
		System.out.println(input + " becomes: ");
		
		for (int i = argumentCharacters.length - 1; i >= 0; i--) {
			System.out.print(argumentCharacters[i]);
		}
				
	}

}

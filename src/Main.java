import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What would you like reversed?\n(default is : Hello, Java!)");
		String input = scanner.nextLine();
		
		char[] argumentCharacters = input.toCharArray();
		
		if (argumentCharacters.length == 0) {
			argumentCharacters = "Hello, Java!".toCharArray();
		}
		
		String reversed = "";
		
		for (int i = argumentCharacters.length - 1; i >= 0; i--) {
			reversed += argumentCharacters[i];
		}
		
				
		System.out.println("\n" + input + " becomes: ");
		System.out.println(reversed);
	}

}

import java.util.Scanner;

public class Age {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Donnez votre age: ");
		int age = scanner.nextInt();
		
		int annee = 2015 - age;
		System.out.println("Votre annee de naissance est: " + annee );
		
	}
	
}

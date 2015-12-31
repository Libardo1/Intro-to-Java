import java.util.Scanner;

public class PGDC {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Calcul du plus grand  diviseur commun de deux nombres entiers positifs.");

        System.out.print("Entrez un nombre positif :  ");
        int num1 = scanner.nextInt();
        System.out.print("Entrez un nombre positif :  ");
        int num2 = scanner.nextInt();
        
        int a = num1;
        int b = num2;
        
        while (a != b) {
        	if (a > b) {
        		a -= b;
        	} else {
        		b -= a;
        	}
        }
        System.out.println("Le plus grand diviseur commun de " + num1 + " et " + num2 + " est " + a);
	}

}

import java.util.Scanner;

public class IMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double poids = 72;
		double taille = 1.9;
		
		System.out.print("Entrez votre poids: ");
		poids = scanner.nextDouble();
		System.out.print("Entrez votre taille: ");
		taille = scanner.nextDouble();
		
		double imc = poids / (taille * taille);
		
		System.out.println("Pour une taille de " + taille
							+ " m et un poids de " + poids
							+ " kg le IMC est de "+ imc);
		scanner.close();
	}

}

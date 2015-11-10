import java.util.Scanner;

public class Degre3 {
	
	private static Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		double x;
	
		System.out.print("Entrez a (int) : ");
		a = scanner.nextInt();
		System.out.print("Entrez b (int) : ");
		b = scanner.nextInt();
		System.out.print("Entrez c (int) : ");
		c = scanner.nextInt();
		System.out.print("Entrez x (double) : ");
		x = scanner.nextDouble();
		
		int ab = a + b;
		double total = (ab/2.) * x * x * x + ab * ab * x * x + ab + c; 
		
		System.out.println("La valeur du polynôme est : " + total);
	}

}

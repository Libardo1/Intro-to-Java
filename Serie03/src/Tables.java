
public class Tables {
	public static void main(String[] args) {
		System.out.println("Tables de Multiplication");
		for (int i = 2; i <= 10; i++) {
			System.out.println("\n Table de " + i + ":");
			for (int j = 1; j <=10; j++) {
				System.out.println("\n   " + i + " * " +  j + " = " + j*i);
			}
		}
	}

}

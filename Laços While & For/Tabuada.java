
public class Tabuada {
	public static void main(String[] args) {
		
		int i, j;
		
		for (i = 1; i <= 10; i++) {
			for (j = 1; j <= 10; j++) {
				int tabuada = j * i;
				System.out.println("\n" + i + " x " + j + " = " + tabuada);
			}
		}
		
		System.exit(0);
	}
}

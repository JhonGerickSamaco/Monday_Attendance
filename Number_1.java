import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		System.out.println("Enter 3 Numbers: ");
		Scanner ab = new Scanner(System.in);
		int x = ab.nextInt();
		int y = ab.nextInt();
		int z = ab.nextInt();
		
		double S = x + y + z;
		double A = S / 3;
		double P = x * y * z;
		
		System.out.println("SUM = " + S + "\n" + "AVERAGE = " + A + "\n" + "PRODUCT = " + P);	
	}
}

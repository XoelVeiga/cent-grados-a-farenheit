import java.util.Scanner;

public class CentigradosAFarenheit {

	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Pon la temperatura en grados centigrados");
		a = sc.nextDouble();
		b = 32 + (9 * a / 5);
		System.out.println("Esa temperatura en farenheit sería: " + b);
	}

}

import java.util.Scanner;
public class MaxTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double x,y;
		System.out.println("Enter 2 numbers");
		Scanner in = new Scanner(System.in);
		x = in.nextDouble();
		y = in.nextDouble();
		MaxClass Max = new MaxClass();
		
		System.out.println("Max is " + Max.Max(x, y));
	}
}

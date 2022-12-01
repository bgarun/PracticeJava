import java.util.Scanner;
public class EvenandOdd {
	public static void main(String[]args) {
		Scanner g=new Scanner(System.in);
		System.out.println("Enter Number");
		double n=g.nextDouble();
		if (n%2==0) {
			System.out.println("Entered number is Even");
		}
		else {
			System.out.println("Entered number is Odd");
		}
	}

}

import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
	  try {
		  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter A value");
	  int a =sc.nextInt();
System.out.println("Enter B value");
double b =sc.nextInt();
double res=a/b;
System.out.println("Result "+res);
	  }
	  catch (ArithmeticException ref){
		  System.out.println("B should not be Zero");
	  }
	  
	  finally {
		  System.out.println("Program completed");
	  }
	  }
	}

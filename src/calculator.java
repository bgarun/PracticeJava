import java.util.Scanner;
public class calculator {
	public static void main (String[]args) {
		Scanner c=new Scanner(System.in);
		System.out.println("enter your choice");
		System.out.println("1.Addition");
		System.out.println("2.substraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int choice= c.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("enter A value");
			int a= c.nextInt();
			System.out.println("enter B value");
			int b=c.nextInt();
			int result=a+b;
			System.out.println("The sum of values is "  +result);
		}break;
		case 2:{
			System.out.println("enter A value");
			int a= c.nextInt();
			System.out.println("enter B value");
			int b=c.nextInt();
			int result=a-b;
			System.out.println("The difference of values is "  +result);
		}break;
		case 3:{
			System.out.println("enter A value");
			int a= c.nextInt();
			System.out.println("enter B value");
			int b=c.nextInt();
			int result=a*b;
			System.out.println("The product of values is "  +result);
		}break;
		case 4:{
			System.out.println("enter A value");
			int a= c.nextInt();
			System.out.println("enter B value");
			int b=c.nextInt();
			int result=a/b;
			System.out.println("The of values is "  +result);
		}break;
		default:{
			System.out.println("invalid choice");
		}
		
		}
	}

}

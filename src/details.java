import java.util.Scanner;
public class details {
	public static void main(String[]args) {
		Scanner d=new Scanner(System.in);
		System.out.println("-----enter details-------");
		System.out.println("enter your name");
		String name= d.next();
		System.out.println("enter your phone number");
		long phone= d.nextLong();
		System.out.println("enter your address");
		String Address= d.next();
		System.out.println("Enter your Account number");
		String Acco= d.next();
		System.out.println("Enter IFSC code");
		String IFSC= d.next();
		System.out.println("Enter gender");
		char gender= d.next().charAt(1);
		System.out.println("enter status");
		boolean status=d.nextBoolean();
	System.out.println("Name: "+name);
	System.out.println("phone : "+phone);
	System.out.println("Address: "+Address);
	System.out.println("Account no: "+Acco);
	System.out.println("IFSC code: "+IFSC);
	System.out.println("Gender: "+gender);
	System.out.println("Status: "+status);
	
	}
		
		

}

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Name");
	String org=sc.nextLine();
	char ch;
	String rev="";
	for(int i=0;i<org.length();i++) {
		ch=org.charAt(i);
		rev=ch+rev;
	}
	System.out.println(rev);
	
	}
}

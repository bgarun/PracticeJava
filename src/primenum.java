import java.util.Scanner;
public class primenum {
public static void main(String[]args) {
	Scanner f=new Scanner(System.in);
	System.out.println("Enter Number");
	int n= f.nextInt();
	int i=1;
	int count=0;
	while(i<=n) {
		if (n%i==0) {
			count++;
		}
		i++;
	}
	if (count==2) {
		System.out.println("Given number is Prime");
	}
	else {
		System.out.println("Given number is not prime");
	}
}
}

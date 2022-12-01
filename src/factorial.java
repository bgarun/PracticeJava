
public class factorial {
	public static void main(String[] args) {
		int i;
		int n=5;
		int factorial=1;
		for(i=1;i<=n;i++) {
			factorial=factorial*i;
		}
		System.out.println("factorial of "+n+" is "+factorial);
	}
}

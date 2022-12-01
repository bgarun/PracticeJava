public class primenumber {

	public static void main(String[] args) {
		int i=1;
		int n=20;
		int x=0;
		while(i<=n) {
			if (n%i==0) {
				x++;
			}
			i++;
		}
		if(x==2){
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+" is not a prime number");
		}
		}
	}
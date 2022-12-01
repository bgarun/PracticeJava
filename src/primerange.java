
public class primerange {
	public static void main(String[] args) {
		int i=1;
		int n=20;
		int count=0;
		for(i=1;i<=n;i++) {
			while(n%i==0) {
				System.out.println(i);
			}
		}
		}
	}

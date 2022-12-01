
public class Arrays {

	public static void main(String[] args) {
		int[] a= {1,3,5,7,9};
		System.out.println(a.length);
		int res=0;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			res=res+a[i];
			System.out.println("cummulative "+res);
			
		}

	}

}

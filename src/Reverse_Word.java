
public class Reverse_Word {

	public static void main(String[] args) {
		String name="Welcome To Bengaluru";
		String [] s=name.split(" ");
		String ch;
		for(int i=s.length-1; i>=0;i--) {
			System.out.print(s[i]+" ");
		}

	}

}

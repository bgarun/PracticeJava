public class Switch {
	public static void main  (String[]args) {
		int choice= 8;
		switch(choice) {
		case 1,5: {
			System.out.println("go up");
		}break;
		case 2: {
			System.out.println("go down");
		}break;
		case 3: {
			System.out.println("left");
		}break;
		case 4: {
			System.out.println("Right");
		}break;
		default: {
			System.out.println("invalid input");
		}break;
		}
	}

}

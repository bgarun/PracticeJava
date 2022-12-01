
class BlockedException extends Throwable{
	
}


class Phone{
	void unlock(boolean pattern) throws BlockedException {
		if(pattern==true) {
			System.out.println("Phone unlocked");
		}
		else {
			System.out.println("you are not right person");
			throw new BlockedException();
		}
	}
}

public class Throw {
	public static void main(String[] args) {
		try {
			Phone p=new Phone();
			p.unlock(true);
		}
		catch(BlockedException ref) {
			ref.printStackTrace();
		}
	}

}

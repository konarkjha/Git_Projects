
public class Constructor {

	Constructor() {
		System.out.println("In the Constructor");
	}
	static void Static() {
		System.out.println("In static");
	}

	public static void main(String[] args) {
		Constructor obj=new Constructor();
		System.out.println("In Main");
		Static();
		
	}

}

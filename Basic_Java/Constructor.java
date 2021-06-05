package Basic_Java;

public class Constructor {
	int y=1;
	//Non-parameterized Constructor
	Constructor(){
		System.out.println("this is non-parameterized constructor");
	}
	
	Constructor(int y){
		System.out.println("this is parameterized constructor");
	}

	public static void main(String[] args) {		
		Constructor obj = new Constructor(5);
		System.out.println(obj.y);
		
		Constructor obje = new Constructor();
		System.out.println("constructors");
	}
}



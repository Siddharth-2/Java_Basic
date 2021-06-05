package Four_Principles_of_OOP;

public class ChildCar extends MainCar_Inheritance {
	
	String Tyre = "Off-Road";

	public static void main(String[] args) {
		ChildCar childcar = new ChildCar();
		childcar.Color = "grey";
		childcar.breakCar();
		System.out.println("Tyre Type: " + childcar.Tyre);
	}
	//overriding method
	void breakCar() {
		speed= speed-1;
		System.out.println("Break Speed: " + speed);
	}
}


 
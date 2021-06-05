package Four_Principles_of_OOP;

public class MainCar_Inheritance {
	
	protected int speed = 0;
	int maxspeed = 100;
	int minspeed = 0;
	String Engine = "S1";
	String Color = "Red";
	
	void accelrateSpeed() {
		speed = speed + 1;
		System.out.println("Accelrate Speed: " + speed);
	}
	void breakCar() {
		speed--;
		System.out.println("Break Speed: " + speed);
	}
	void stopCar() {
		speed = 0;
		System.out.println("Stop Speed: " + speed);
		
	}
		


	}


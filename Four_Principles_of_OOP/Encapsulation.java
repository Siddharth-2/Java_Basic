package Four_Principles_of_OOP;

public class Encapsulation {
	
	int speed = 5;
	String color = "black";
	
	public static void main(String[] args) {
		Encapsulation car = new Encapsulation();
		car.color = "Red";
		System.out.println("Car current Speed: " + car.speed);
		car.accelrateSpeed();
		car.accelrateSpeed();
		car.breakCar();
		car.stopCar();

	}
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

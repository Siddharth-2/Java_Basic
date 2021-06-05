package Four_Principles_of_OOP;

public class HyundaiCar extends AbstractCar{
	int speed = 0;
	@Override
	void accerelarateCar() {
		speed = speed + 2;
		System.out.println("Accelrate Speed: " + speed);
	}

	@Override
	void stopCar() {
		speed = 0;
		System.out.println("Car Stopped");
		
	}

	@Override
	void startCar() {
		speed = 0;
		System.out.println("Car Started");
	}

}

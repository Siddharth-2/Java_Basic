package Four_Principles_of_OOP;

public class AbstractionCar {

	int fuel= 20;
	int maxFuelCapacity = 25;
	
	public static void main(String[] args) {
		AbstractionCar car = new AbstractionCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.fuelCar();
		car.runcar();
	}
	void fuelCar() {
		if(maxFuelCapacity>fuel) {
			fuel += 1;
			System.out.println("Fuel: " + fuel);
		}else {
			System.out.println("Fuel Capacity Reached." + fuel);
		}
	}
	
	void runcar() {
		for(int i = fuel;i>0;i--) {
			if(i>1) {
				fuel--;
				System.out.println("Fuel: " + fuel);
			}else {
				System.out.println("Please Fuel up Car.");
			}
		}
	}
}

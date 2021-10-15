package ch08.sec05.ex05;

public class DriverExample {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		// vehicle.checkFare();
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}
}

package Q7_04_Parking_Lot;

public class ParkingLot {
	/***
	 * Level >> ParkingSpot >> Vehicle
	 */
	private Level[] levels;
	private final int NUM_LEVELS = 5;
	
	public ParkingLot() {
		// 5 levels and 30 spots on each level
		levels = new Level[NUM_LEVELS];
		for (int i = 0; i < NUM_LEVELS; i++) {
			levels[i] = new Level(i, 30);
		}
	}
	
	/* Park the vehicle in a spot (or multiple spots). Return false if failed. */
	public boolean parkVehicle(Vehicle vehicle) {
		// user only needs to know to park vehicles in a parking lot,
		// not necessarily a specific parking spot => abstract
		for (int i = 0; i < levels.length; i++) {
			if (levels[i].parkVehicle(vehicle)) {
				return true;
			}
		}
		return false;
	}
	
	public void print() {
		// print current state of the parking lot
		for (int i = 0; i < levels.length; i++) {
			System.out.print("Level" + i + ": ");
			levels[i].print();
			System.out.println("");
		}
		System.out.println("");
	}
}

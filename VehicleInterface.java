public interface VehicleInterface {

	default String getName() {
		return "Vehicle";
	}
	
	int getAge();
	
	int getRemainingLife();
}
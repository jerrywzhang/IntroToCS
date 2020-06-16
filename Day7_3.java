class Day7_3 {
	public static void main(String[] args) {
//		VehicleInterface v = new VehicleInterface(); // cannot be done
		VehicleInterface v = new CarImplementsVehicle(); // can be done
	}
}

public class EV extends Car {
	private int numMotors;
	
	public EV() {
		super();
	}
	
	public EV(String name, String model, int age, int numMotors) {
		super(name, model, age);
		this.numMotors = numMotors;
	}
	
	@Override // optional
	public int getRemainingLife() {
		return 10*numMotors - this.getAge(); // made up calculation
	}
	
	public int getMotors() {
		return numMotors;
	}
	
	// talk about how the private instance vars from Car aren't inherited, need to use getAge()
	// need to add constructors
}
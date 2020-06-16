public class Gas extends Car {
	private String engine;
	
	public Gas() {
		super();
	}
	
	public Gas(String name, String model, int age, String engine) {
		super(name, model, age);
		this.engine = engine;
	}
	
	@Override // optional
	public int getRemainingLife() {
		return super.getRemainingLife() + 1; // partial overriding
	}
	
	public String getEngine() {
		return this.engine;
	}
}
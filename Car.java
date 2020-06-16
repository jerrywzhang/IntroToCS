public class Car {
	
	private String name;
	private String model;
	private int age;

	//constructor
	public Car() {
		name = "";
		model = "";
		age = 0;
	}

	//constructor
	public Car(String name, String model, int age) {
		this.name = name; // to not use this, the param needs to be named something else
		this.model = model;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getRemainingLife() { // in years
		return 15 - age;
	}
}
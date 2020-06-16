public abstract class Vehicle {
	private String name;
	private int age;

	//constructor
	public Vehicle() {
		name = "";
		age = 0;
	}

	//constructor
	public Vehicle(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public abstract int getRemainingLife();
}
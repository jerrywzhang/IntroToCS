class Day6_2 {
	public static void main(String[] args) {
		Zombie x = new Zombie("Steve");
		x.bite();
		x.bite(x);
		
		FastZombie y = new FastZombie("Joe");
		y.bite();
		y.bite(y);
		y.bite(x);
		
		Object witch = new FastZombie("Witch"); // object can be replaced with Zombie as well
        FastZombie jerry = (FastZombie) witch; // doesn't call a constructor
        jerry.bite((FastZombie) witch);
        jerry.bite((Zombie) witch);
        // jerry.bite(witch) wouldn't work - compile time error: FastZombie doesn't have a bite(Object)
        ((Zombie) witch).bite(jerry); // this one's the most confusing.
        // witch: static type zombie, dynamic type fastzombie.
        // during compile, checks static type
        // during runtime, checks dynamic type
        // so it calls bite(FastZombie f) in FastZombie
        ((FastZombie) witch).bite(jerry); // same as above, except different static type which doesn't affect runtime
	}
}

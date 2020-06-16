public class FastZombie extends Zombie{

    public FastZombie(String name) {
        super(name);
    }

    public void run() {
        System.out.println(
                name + " will get you soon");
    }
    
    // add the following bite() method for demoing super in subclass
    public void bite() {
    	System.out.println("Chomp");
    }

    public void bite(FastZombie f) {
        super.bite((Zombie) f);
        super.bite(f);
        System.out.println("#FasterThan" + f.name);
    }
}


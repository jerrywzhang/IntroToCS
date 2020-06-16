public class Zombie{

    protected String name;

    public Zombie(String name) {
        this.name = name;
        System.out.println(name + " wants BRAINS!");
    }

    public void bite() {
        System.out.println("Nom nom nom!");
    }

    public void bite(Zombie z) {
        System.out.println(z.name + ", is that you?");
        // add the following for demo of super in subclass
        bite();
    }

    public void bite(FastZombie z) {
        System.out.println("Not... Possible...");
    }
}

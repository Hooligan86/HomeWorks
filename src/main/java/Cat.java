public class Cat extends Animal {
    private static int catCounter = 0;

    public Cat(String name) {
        super(name);
        catCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println("Котики не могут бежать больше чем 200м");
        } else {
            System.out.println(this.getName() + " пробежал " + distance + "м");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Котики не умеют плавать :(");
    }

    public static int getCounter() {
        return catCounter;
    }

    public static void setCounter(int catCounter) {
        Cat.catCounter = catCounter;
    }
}

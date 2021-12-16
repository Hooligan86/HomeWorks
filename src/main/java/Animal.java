public abstract class Animal {
    private static int counter = 0;

    private String name;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public abstract void run(int distance);

    public abstract void swim(int distance);

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Animal.counter = counter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

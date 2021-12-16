public class Dog extends Animal{
    private static int dogCounter = 0;

    public Dog(String name) {
        super(name);
        dogCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println("Собачки не могут бежать больше чем 500м");
        } else {
            System.out.println(this.getName() + " пробежал " + distance + "м");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println("Собачки не плавают больше чем 10м");
        } else {
            System.out.println(this.getName() + " проплыл " + distance + "м");
        }
    }

    public static int getCounter() {
        return dogCounter;
    }

    public static void setCounter(int dogCounter) {
        Dog.dogCounter = dogCounter;
    }
}

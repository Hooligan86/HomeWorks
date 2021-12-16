public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик");
        Cat cat2 = new Cat("Пушок");
        Dog dog = new Dog("Бобик");
        System.out.println(Animal.getCounter());
        System.out.println(Cat.getCounter());
        System.out.println(Dog.getCounter());

        cat2.swim(500);
        dog.swim(4);

    }
}

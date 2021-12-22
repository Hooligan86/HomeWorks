public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cat[] cats = {new Cat("Барсик", 20), new Cat("Пушок", 25)};
        Plate plate = new Plate(60);

        while(plate.getCapacity() > 0 || (cats[0].getMaxSatiety() == cats[0].getSatiety() && cats[1].getMaxSatiety() == cats[1].getSatiety())){
            cats[0].eat(plate);
            cats[1].eat(plate);
//            Thread.sleep(3000);
        }
        System.out.println("Тарелка пустая :(");
        for (Cat cat : cats) {
            cat.printInfo();
        }
    }
}

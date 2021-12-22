import java.util.Random;

public class Cat {
    private String name;
    private int satiety;
    private int maxSatiety;
    private int countOfFood;

    public Cat(String name, int maxSatiety) {
        this.name = name;
        this.maxSatiety = maxSatiety;
        this.satiety = 0;
    }

    public void eat(Plate plate) {
        countOfFood = new Random().nextInt(3) + 1;
        if(maxSatiety == satiety){
            System.out.println("Кот " + name +" наелся");
            return;
        }
        if(maxSatiety - countOfFood < 0){
            countOfFood = maxSatiety - countOfFood;
        }
        if (plate.decreaseFood(countOfFood)) {
            satiety += countOfFood;
        }

    }

    public void printInfo() {
        System.out.printf("Кот %s наелся на %s из %s%n", name, satiety, maxSatiety);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public int getMaxSatiety() {
        return maxSatiety;
    }

    public void setMaxSatiety(int maxSatiety) {
        this.maxSatiety = maxSatiety;
    }

    public int getCountOfFood() {
        return countOfFood;
    }

    public void setCountOfFood(int countOfFood) {
        this.countOfFood = countOfFood;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                ", maxSatiety=" + maxSatiety +
                ", countOfFood=" + countOfFood +
                '}';
    }
}

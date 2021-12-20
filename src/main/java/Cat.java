import java.util.Random;

public class Cat {
    private String name;
    private int satiety;
    private boolean ifSatiety;
    private int countOfFood;

    public Cat(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int isSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public void eat(Plate plate) {
        countOfFood = new Random().nextInt(4) + 1;
        if (plate.decreaseFood(countOfFood)) {

        }

    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}

public class Plate {
    private int capacity;

    public Plate(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void addFood(int food) {
        capacity += food;
    }

    public boolean decreaseFood(int countOfFood){
        if(capacity == 0){
            System.out.println("Миска пустая :(");
            return false;
        }
        if(countOfFood > capacity){
            System.out.println("Недостаточно еды в миске");
            return false;
        }
        capacity -= countOfFood;
        return true;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "capacity=" + capacity +
                '}';
    }
}

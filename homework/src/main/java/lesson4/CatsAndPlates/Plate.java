package lesson4.CatsAndPlates;

public class Plate {
    int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void increaseFood(int extra) {
        food += extra;
    }
}

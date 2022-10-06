package lesson4.CatsAndPlates;

public class Cat {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate p) {
        if (!satiety && getAppetite() < p.food) {
            p.decreaseFood(appetite);
            this.satiety = true;
            System.out.println("Кот " + getName() + " поел");
        } else {
            System.out.println("Кот " + getName() + " не поел!");
        }
    }
}
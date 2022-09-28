package lesson4.Animals;

public class Dog extends Animal {
    public static int count;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 500)
            super.run(distance);
        else
            System.out.println("Максимальное значение 500 м !");
    }

    @Override
    public void swim(int distance) {
        if (distance <= 10)
            super.swim(distance);
        else
            System.out.println("Максимальное значение 10 м !");
    }
}

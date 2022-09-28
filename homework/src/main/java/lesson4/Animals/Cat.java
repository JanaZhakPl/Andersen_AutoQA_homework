package lesson4.Animals;

public class Cat extends Animal {
    public static int count;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200)
            super.run(distance);
        else
            System.out.println("Максимальное значение 200 м !");
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать");
    }
}

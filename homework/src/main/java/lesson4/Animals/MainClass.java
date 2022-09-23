package lesson4.Animals;

public class MainClass {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Kotenok");
        cat1.run(150);
        cat1.swim(150);
        Dog dog1 = new Dog("Druzhok");
        Dog dog2 = new Dog("Sava");
        dog1.run(200);
        dog2.run(10);
        dog2.swim(20);
        System.out.println("Создано " + Animal.count + " животных: " + Cat.count + " котов, " + Dog.count + " собак");
    }
}

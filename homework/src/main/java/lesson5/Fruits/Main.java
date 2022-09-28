package lesson5.Fruits;

public class Main {
    public static void main(String[] args) {

        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple()); //picking apples in box
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange()); //picking apples in box
        System.out.println("A box of apples weighs " + boxWithApple.getWeight()); //weight box with apples
        System.out.println("A box of oranges weight " + boxWithOranges.getWeight()); //weight box with apples
        System.out.println(boxWithApple.compare(boxWithOranges));

        boxWithOranges.addFruit(new Orange());
        System.out.println("A box of apples weighs " + boxWithApple.getWeight()); //weight box with apples
        System.out.println("A box of oranges weight " + boxWithOranges.getWeight()); //weight box with apples
        System.out.println(boxWithApple.compare(boxWithOranges));

        Box<Orange> anotherBoxWithOranges = new Box<>();
        System.out.println(boxWithOranges.getBox());
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);
        System.out.println(boxWithOranges.getBox());
        System.out.println(anotherBoxWithOranges.getBox());
    }

}


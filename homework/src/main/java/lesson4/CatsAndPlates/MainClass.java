package lesson4.CatsAndPlates;

public class MainClass {

    public static void main(String[] args) {

        Cat[] allCats = new Cat[3];
        allCats[0] = new Cat("Cat1", 35);
        allCats[1] = new Cat("Cat2", 40);
        allCats[2] = new Cat("Cat3", 30);

        Plate plate = new Plate(100);
        plate.info();
        for (Cat allCat : allCats) {
            if (!allCat.satiety && allCat.getAppetite() < plate.food) {
                allCat.eat(plate);
                allCat.satiety = true;
                System.out.println("Коn " + allCat.getName() + " поел");
            } else {
                System.out.println("Кот " + allCat.getName() + " не поел!");
            }
        }

        plate.info();
        System.out.println("Сколько eды добавить в тарелку?");
        plate.increaseFood(5);
        plate.info();
    }
}

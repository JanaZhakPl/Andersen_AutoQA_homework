package lesson5.Fruits;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    ArrayList<T> box;

        @SafeVarargs
        public Box(T... someFruit) {
        box = new ArrayList<>(Arrays.asList(someFruit));
    }

    public ArrayList<T> getBox() {
        return box;
    }

    public void addFruit(T someFruit) {
        box.add(someFruit);
    }

    public float getWeight() {
        float totalWeight = 0.0f;
        for (T t : box) {
            totalWeight = totalWeight + t.getWeight();
        }
        return totalWeight;
    }

    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return Math.abs(getWeight() - boxWithSomething.getWeight()) < 0.0001f;
    }

    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }
}


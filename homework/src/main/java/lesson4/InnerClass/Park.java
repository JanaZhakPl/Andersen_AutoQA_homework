package lesson4.InnerClass;

import java.util.ArrayList;
import java.util.List;

public class Park {
    List<Attraction> attractions = new ArrayList<>();

    public static class Attraction {
        private String name;
        private String graphic;
        private double price;

        @Override
        public String toString() {
            return "Attraction{" +
                    "name='" + name + '\'' +
                    ", graphic='" + graphic + '\'' +
                    ", price=" + price +
                    '}';
        }

        public Attraction(String name, String graphic, double price) {
            this.name = name;
            this.graphic = graphic;
            this.price = price;
        }
    }

    public void addAttraction(String name, String graphic, int price) {
        attractions.add(new Attraction(name, graphic, price));
    }

    public void showInfo() {
        attractions.forEach(System.out::println);
    }
}


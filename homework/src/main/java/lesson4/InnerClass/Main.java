package lesson4.InnerClass;

import lesson4.InnerClass.Park;

/**
 * Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
 * времени их работы и стоимости.
 */
public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        park.addAttraction("centrifuge", "12:00 - 16:00", 10);
        park.addAttraction("carousel", "12:00 - 20:00", 8);

        park.showInfo();

        Payment payment = new Payment();

        payment.addProduct("Book", 40, 1);
        payment.addProduct("Notebook", 25, 5);
        payment.addProduct("Pen", 10,10 );

        payment.showProducts();
    }
}

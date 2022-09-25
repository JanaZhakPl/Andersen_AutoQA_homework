package lesson4.Payment;

public class Main {

    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.addProduct("Book", 40, 1);
        payment.addProduct("Notebook", 25, 5);
        payment.addProduct("Pen", 10,10 );

        payment.showProducts();
    }
}


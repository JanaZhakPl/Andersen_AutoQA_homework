package lesson4.Park;

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
    }
}

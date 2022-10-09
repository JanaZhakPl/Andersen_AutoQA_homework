package lesson8.phonebook;


public class Main {
    public static void main(String[] args) {
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("123456", "Ivanov");
        phonebook.add("235689", "Leonidov");
        phonebook.add("3251523", "Petrov");
        phonebook.add("45547575", "Petrov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
    }
}

package lesson8.phonebook;

import java.util.*;

public class PhoneBook {
    static Map<String, String> phoneBook = new HashMap<>();

    public void add(String contact, String lastName) {
        phoneBook.put(contact, lastName);
    }

    public void get(String lastName) {
        if (phoneBook.containsValue(lastName)) {
            for (Map.Entry<String, String> user : phoneBook.entrySet()) {
                if (user.getValue().equals(lastName)) {
                    System.out.println(user.getValue() + " : " + user.getKey());
                }
            }
        } else {
            System.out.println("There is no any user " + lastName + " in the phonebook!");
        }
    }
}



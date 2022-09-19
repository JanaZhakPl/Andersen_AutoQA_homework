package lesson3;

public class Main {
    public static void main(String[] args) {
        Employee[] list = new Employee[5];
        list[0] = new Employee("Иванов Иван Иванович", "Engineer", "ivivan@mailbox.com", "892312312", 10000, 40);
        list[1] = new Employee("Петров Петр Петрович", "Manager", "petr@mailbox.com", "289231231", 10000, 20);
        list[2] = new Employee("Сергеев Сергей Сергеевич", "SEO", "sergej@mailbox.com", "128923123", 30000, 31);
        list[3] = new Employee("Андреев Андрей Андреевич", "Engineer", "andrej@mailbox.com", "312892312", 11000, 48);
        list[4] = new Employee("Иванов Петр Сергеевич", "Security", "petr@mailbox.com", "231289231", 6000, 50);

        for (Employee employee : list)
            if (employee.getAge() > 40)
                System.out.println(employee);
    }
}

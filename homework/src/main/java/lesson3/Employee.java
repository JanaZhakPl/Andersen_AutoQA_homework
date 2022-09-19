package lesson3;

public class Employee {

    private String name;
    private String position;
    private String email;
    private String contact;
    private double salary;
    private int age;


    public Employee(String name, String position, String email, String contact, double salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.contact = contact;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", email='" + email + '\'' +
                ", contact='" + contact + '\'' +
                ", salary='" + salary + '\'' +
                ", age=" + age +
                '}';
    }
}

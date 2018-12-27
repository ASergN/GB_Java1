package Lesson_4;


public class Employee {
    private String surenameName;
    private String position;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String surenameName, String position, String phoneNumber, int salary, int age) {
        this.surenameName = surenameName;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public String getSurenameName() {
        return surenameName;
    }

    public String getPosition() {
        return position;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

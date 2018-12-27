package Lesson_4;

/*
    1. Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст.
    2. Конструктор класса должен заполнять эти поля при создании объекта.
    3. Внутри класса сотрудник написать методы, которые возвращают значение каждого поля.
    4. Вывести про помощи методов из пункта 3. ФИО и должность.
    5. Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 45 лет.
    6. * Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.
    7. * Написать методы, вычисляющие средний возраст и среднюю зарплату сотрудников, результаты работы методов вывести в консоль.
 */

public class Less_4 {
    public static void main(String[] args) {

        Employee employee = new Employee("Alexeev Alexey", "Direktor", "8-921-1230000", 100000, 52);
        System.out.println("Выводим ФИО и должность");
        System.out.println(employee.getSurenameName() + ": " + employee.getPosition());

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alexeev Roman", "Tech. direktor", "8-921-1230001", 80000, 47);
        employees[1] = new Employee("Sergeev Sergei", "Developer", "8-921-1230002", 70000, 30);
        employees[2] = new Employee("Ivanova Alena", "Booker", "8-921-1230003", 60000, 55);
        employees[3] = new Employee("Ivanova Galina", "Junior", "8-921-1230004", 40000, 20);
        employees[4] = new Employee("Fedorov Fedor", "courier", "8-921-1230005", 25000, 23);

        System.out.println();
        System.out.println("Выводим информацию о сотрудниках старше 40 лет");
        for (int i=0; i<employees.length; i++){
            if (employees[i].getAge() > 40)
                printInfo(employees[i]);
        }

        System.out.println();
        System.out.println("Выводим информацию о всех сотрудниках до увеличения зарплаты");
        for (int i=0; i<employees.length; i++){
            printInfo(employees[i]);
        }

        increaseSalary(employees);

        System.out.println();
        System.out.println("Выводим информацию о всех сотрудниках после увеличения зарплаты");
        for (int i=0; i<employees.length; i++){
            printInfo(employees[i]);
        }

        System.out.println();
        System.out.println("Средний возраст сотрудников: " + averageAge(employees));
        System.out.println("Средняя зарплата сотрудников: " + averageSalary(employees));
    }
        // Метод выводит полную информацию о сотруднике
    private static void printInfo(Employee employee){
        System.out.println(employee.getSurenameName() + ": " + employee.getPosition() + ", phone: " + employee.getPhoneNumber() + ", salary: " + employee.getSalary() + ", age: " + employee.getAge());
    }

        // Метод увеличивает зарплату сотрудников старше 45 лет
    private static void increaseSalary(Employee[] employees){
        for (int i=0; i<employees.length; i++){
            if (employees[i].getAge() > 45)
                employees[i].setSalary(employees[i].getSalary()+5000);
        }
    }

        // Метод вычисляет средний возраст сотрудников
    private static double averageAge(Employee[] employees){
        double averageAge = 0;
        for (int i=0; i<employees.length; i++)
            averageAge += employees[i].getAge();
        return (double)averageAge/employees.length;
    }

        // Метод вычисляет среднюю зарплату сотрудников
    private static double averageSalary(Employee[] employees){
        double averageSalary = 0;
        for (int i=0; i<employees.length; i++)
            averageSalary += employees[i].getSalary();
        return (double)averageSalary/employees.length;
    }
}

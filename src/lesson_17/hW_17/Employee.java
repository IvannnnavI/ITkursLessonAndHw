package lesson_17.hW_17;
/*
Написать класс Employee (Работник)
У него должны быть поля имя, возраст, зарплата
Инкапсулировать класс.
Написать метод info() выводящий информацию о работнике.
 */

public class Employee {
    private String name;
    private int age;
    private double salary;


    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Ошибка!! Имя не может быть пустым или равно null! ");
        } else {
            this.name = name;
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 18) {
            this.age = age;
        } else {
            System.out.println("Замечание: Возраст работника меньше 18 лет. Проверьте корректность данных.");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 15.56) {
            this.salary = salary;
        } else {
            System.out.println("Замечание: Зарплата рабочего слишком низкая!");
        }
    }

    public void info() {

        System.out.println("Имя: " + name + ";  Возраст: " + age + " лет; Зарплата: " + salary + " евро/час");
    }

}

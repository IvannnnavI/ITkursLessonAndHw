package lesson_42.hw;
/*
Task 1 Легкий
Дан список сотрудников (Employee) с полями name, department, salary. Используя Stream API, сгруппируйте сотрудников по отделам

Task 3 Продвинутый
Опционально
Дан список Employee. Вычислите среднюю зарплату сотрудников в каждом отделе и найдите отдел с максимальной средней зарплатой.
 */

import java.util.*;
import java.util.stream.Collectors;

public class Hw_42_Task1_3 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Иван", "Разработка", 50000),
                new Employee("Сергей", "Разработка", 60000),
                new Employee("Игорь", "HR", 20000),
                new Employee("Ольга", "HR", 30000),
                new Employee("Алексей", "Маркетинг", 45000)

        );
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        employeesByDepartment.forEach((department, empList) -> {
            System.out.println(department + ":");
            empList.forEach(employee -> System.out.println(employee.getName() + " - " + employee.getSalary()));
        });

        System.out.println("================================================================================");
        // Вычисляем среднюю зарплату для каждого отдела
        Map<String, Double> averageSalaries = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

        // Находим отдел с максимальной средней зарплатой
        String departmentWithMaxAverageSalary = averageSalaries.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("Отдел не найден");


        averageSalaries.forEach((department, average) -> System.out.println(department + ": " + average));
        System.out.println("Отдел с максимальной средней зарплатой: " + departmentWithMaxAverageSalary);
    }


}

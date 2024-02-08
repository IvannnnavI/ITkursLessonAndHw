package lesson_17.hW_17;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee = new Employee("Геннадий", 50, 15);
        System.out.println("============================================>");
        String empName = employee.getName();
        int empAge = employee.getAge();
        double empSalary = employee.getSalary();
        System.out.println(empName+ " : " + empAge + " : " + empSalary);
        System.out.println("=========================================>");

        employee.setName("lop");
        employee.setAge(68);
        employee.setSalary(16);
        employee.info();

        System.out.println("=========================================>");
        employee.setName("Johan");
        employee.setAge(30);
        employee.setSalary(18.8);
        employee.info();










    }
}

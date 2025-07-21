package Pactice;

public class Student {

    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee employee1 = new Employee();
        System.out.println(employee.carPrice);
        employee.carPrice = 200;
        System.out.println(employee1.carPrice);
        System.out.println(employee.getCarPrice());
    }
}

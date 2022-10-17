public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Muhammed YILMAZ", 2000, 40, 2018);
        System.out.println(employee);
        System.out.println("Tax: " + employee.tax() + "\nBonus: " + employee.bonus() +
                "\nraiseSalary:" + employee.raiseSalary());
    }
}

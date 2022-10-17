public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    // Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    // Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    // Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    public double tax() {
        return salary > 1000 ? (salary * 3 / 100) : 0;
    }

    // bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise
    // fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    public int bonus() {
        if (workHours > 40) {
            int bonus = (workHours - 40) * 30;
            return bonus;
        }
        return 0;
    }

    // raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır.
    // Şuan ki yılı 2021 olarak alın.
    public double raiseSalary() {
        if (2021 - this.hireYear > 19) {
            return (this.salary + bonus() - tax()) * 1.15;
        } else if (2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return (this.salary + bonus() - tax()) * 1.10;
        } else if (2021 - this.hireYear < 10) {
            return (this.salary + bonus() - tax()) * 1.05;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name: '" + name + '\'' +
                ", salary: " + salary +
                ", workHours: " + workHours +
                ", hireYear: " + hireYear +
                '}';
    }
}

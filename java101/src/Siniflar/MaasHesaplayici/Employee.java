package Siniflar.MaasHesaplayici;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int currentYear = 2021;
        int yearsWorked = currentYear - hireYear;
        double raisePercentage;

        if (yearsWorked < 10) {
            raisePercentage = 0.05;
        } else if (yearsWorked < 20) {
            raisePercentage = 0.1;
        } else {
            raisePercentage = 0.15;
        }

        return salary * raisePercentage;
    }

    public String toString() {
        double totalSalary = salary + bonus() - tax() + raiseSalary();

        return "Adı: " + name + "\n" +
                "Maaşı: " + salary + "\n" +
                "Çalışma Saati: " + workHours + "\n" +
                "Başlangıç Yılı: " + hireYear + "\n" +
                "Vergi: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Maaş Artışı: " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş: " + (salary - tax() + bonus()) + "\n" +
                "Toplam Maaş: " + totalSalary;
    }

}


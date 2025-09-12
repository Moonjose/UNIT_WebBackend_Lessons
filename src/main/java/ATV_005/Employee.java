package ATV_005;

import java.time.LocalDate;
import java.time.Period;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Employee {
    enum Department {
        RH,
        IT,
        Gestao,
        Financeiro
    }

    protected String name;
    protected int age;
    protected double salary;
    protected boolean active = true;
    protected LocalDate admissionDate;
    protected Department department;
    private double maxSalary = 10_000;

    public Employee(String name, int age, double salary, LocalDate admissionDate, Department department) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.admissionDate = admissionDate;
        this.department = department;
    }

    public void raiseSalary(double percent) {
        salary = salary + (salary * (percent/100));
        if (salary > maxSalary) {
            salary = maxSalary;
        }
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        System.out.println("Salário de " + name + " aumentado: " + nf.format(salary));
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return String.format(
                "Nome: %s | Idade: %d | Salário: %s | Ativo: %b | Admissão: %s",
                name, age, nf.format(salary), active, admissionDate
        );
    }

    public void dismiss() {
        System.out.println(name + " foi demitido(a)");
        active = false;
    }

    public String timeHired() {
        Period period = Period.between(admissionDate, LocalDate.now());
        return String.format("%s está na empresa há %d anos, %d meses e %d dias", name, period.getYears(), period.getMonths(), period.getDays());
    }
}

package ATV_005;

import java.time.LocalDate;

public class AdministrativeEmployee extends Employee {
    public AdministrativeEmployee(String name, int age, double salary, LocalDate admissionDate, Department department) {
        super(name, age, salary, admissionDate, department);
    }
}

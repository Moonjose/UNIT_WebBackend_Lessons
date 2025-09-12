package ATV_005;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        AdministrativeEmployee admEmployee = new AdministrativeEmployee("Maria", 28, 2900, LocalDate.of(2022, 5, 30), Employee.Department.Gestao);
        TechEmployee techEmployee = new TechEmployee("Jose", 24, 2250, LocalDate.of(2025, 3, 17), Employee.Department.IT);

        System.out.println(admEmployee);
        System.out.println(techEmployee);

        admEmployee.raiseSalary(15);
        techEmployee.raiseSalary(35);

        System.out.println(admEmployee.timeHired());
        System.out.println(techEmployee.timeHired());

        admEmployee.dismiss();
        System.out.println(admEmployee);
    }
}

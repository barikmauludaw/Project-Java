import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(2023, 5, 20);

        SalariedEmployee salariedEmployee = new SalariedEmployee("John Doe", "1234567890", birthDate, 5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Jane Smith", "0987654321", birthDate, 20, 45);
        CommissionEmployee commissionEmployee = new CommissionEmployee("Michael Johnson", "5678901234", birthDate, 10000, 0.1);
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Sarah Williams", "3456789012", birthDate, 8000, 0.08, 2000);

        System.out.println("Employees diproses secara polimorfisme:\n");
        System.out.println(salariedEmployee);
        System.out.println("Earnings: $" + salariedEmployee.earnings());
        System.out.println();

        System.out.println(hourlyEmployee);
        System.out.println("Earnings: $" + hourlyEmployee.earnings());
        System.out.println();

        System.out.println(commissionEmployee);
        System.out.println("Earnings: $" + commissionEmployee.earnings());
        System.out.println();

        System.out.println(basePlusCommissionEmployee);
        System.out.println("Earnings: $" + basePlusCommissionEmployee.earnings());
        
        Employee[] employees = new Employee[4];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;

for (Employee currentEmployee : employees) {
System.out.println(currentEmployee);
if (currentEmployee instanceof BasePlusCommissionEmployee) {
BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
employee.setBaseSalary(1.10 * employee.getBaseSalary());
System.out.printf( "Gaji pokok setelah dinaikkan 10%% : $%,.2f\n", employee.getBaseSalary());
}
System.out.printf("pendapatan: $%,.2f\n\n", currentEmployee.earnings());
}
for (int j = 0; j < employees.length; j++) {
System.out.printf("Employee %d = %s\n", j, employees[j].getClass().getName());
}
}
}
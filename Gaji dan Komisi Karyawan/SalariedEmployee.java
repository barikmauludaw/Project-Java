import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary; // gaji/bulan

    public SalariedEmployee(String name, String noKTP, LocalDate birthDate, double salary) {
        super(name, noKTP, birthDate);
        setMonthlySalary(salary);
    }

    public void setMonthlySalary(double salary) {
        monthlySalary = salary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double earnings() {
        double earnings = getMonthlySalary();
        if (isBirthday()) {
            earnings += 100000; // tambahan gaji 100.000 jika ulang tahun
        }
        return earnings;
    }

    public String toString() {
        return String.format("Salaried Employee:\n%s\nMonthly Salary: %.2f", super.toString(), getMonthlySalary());
    }

    private boolean isBirthday() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = getBirthDate();
        return birthDate.getMonth() == currentDate.getMonth() && birthDate.getDayOfMonth() == currentDate.getDayOfMonth();
    }
}

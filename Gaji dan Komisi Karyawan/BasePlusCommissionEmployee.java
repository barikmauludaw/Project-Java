import java.time.LocalDate;

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary; // gaji pokok tiap minggu

    public BasePlusCommissionEmployee(String name, String noKTP, LocalDate birthDate, double sales, double rate, double salary) {
        super(name, noKTP, birthDate, sales, rate);
        setBaseSalary(salary);
    }

    public void setBaseSalary(double salary) {
        baseSalary = salary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings() {
        double earnings = getBaseSalary() + super.earnings();
        if (isBirthday()) {
            earnings += 100000; // tambahan gaji 100.000 jika ulang tahun
        }
        return earnings;
    }

    public String toString() {
        return String.format("Base Plus Commission Employee:\n%s\nBase Salary: %.2f", super.toString(), getBaseSalary());
    }

    private boolean isBirthday() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = getBirthDate();
        return birthDate.getMonth() == currentDate.getMonth() && birthDate.getDayOfMonth() == currentDate.getDayOfMonth();
    }
}

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double wage; // upah per jam
    private double hours; // jumlah jam tiap minggu

    public HourlyEmployee(String name, String noKTP, LocalDate birthDate, double hourlyWage, double hoursWorked) {
        super(name, noKTP, birthDate);
        setWage(hourlyWage);
        setHours(hoursWorked);
    }

    public void setWage(double hourlyWage) {
        wage = hourlyWage;
    }

    public double getWage() {
        return wage;
    }

    public void setHours(double hoursWorked) {
        hours = hoursWorked;
    }

    public double getHours() {
        return hours;
    }

    public double earnings() {
        double earnings = 0.0;
        if (getHours() <= 40) {
            earnings = getWage() * getHours();
        } else {
            earnings = 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
        }
        if (isBirthday()) {
            earnings += 100000; // tambahan gaji 100.000 jika ulang tahun
        }
        return earnings;
    }

    public String toString() {
        return String.format("Hourly Employee:\n%s\nHourly Wage: %.2f\nHours Worked: %.2f", super.toString(), getWage(), getHours());
    }

    private boolean isBirthday() {
        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = getBirthDate();
        return birthDate.getMonth() == currentDate.getMonth() && birthDate.getDayOfMonth() == currentDate.getDayOfMonth();
    }
}

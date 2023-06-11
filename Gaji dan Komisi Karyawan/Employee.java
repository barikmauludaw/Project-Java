import java.time.LocalDate;

public abstract class Employee {
    private String name;
    private String noKTP;
    private LocalDate birthDate; // tambahan atribut tanggal lahir

    public Employee(String name, String noKTP, LocalDate birthDate) {
        this.name = name;
        this.noKTP = noKTP;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getNoKTP() {
        return noKTP;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String toString() {
        return String.format("Name: %s\nNo. KTP: %s\nBirth Date: %s", getName(), getNoKTP(), getBirthDate());
    }

    public abstract double earnings(); // pendapatan
}

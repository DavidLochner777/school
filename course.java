package School;

public class course {
    private String department;
    private int number;
    private int credit_hours;
    public course(String department, int number, int credit_hours) {
        this.department = department;
        this.number = number;
        this.credit_hours = credit_hours;
    }
    public String toString() {
        return department + number + " has " + credit_hours + " credit hours";
    }
}

package HW7;

public final class Month {

    private final String name;
    private final int days;
    private final int workingDays;

    public Month(String name, int days, int workingDays) {
        this.name = name;
        this.days = days;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkingDays() {
        return workingDays;
    }
}

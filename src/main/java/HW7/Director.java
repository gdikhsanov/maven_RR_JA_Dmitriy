package HW7;

public final class Director extends Manager implements IEmployee {

    private static final int BONUS_COEFFICIENT = 9;


    public Director(String name, int age, String sex, int baseSalary, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, baseSalary, salaryPerDay, numberOfSubordinates);
    }

    @Override
    public int getSalary() {
        return (super.getBaseSalary() * (100 + getNumberOfSubordinates() * getBonusCoefficient())) / 100;
    }
    public int getBonusCoefficient() {
        return BONUS_COEFFICIENT;
    }


}

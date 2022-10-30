package HW7;

public class Manager extends BaseEmployee implements IEmployee, IManager{

    private static final int BONUS_COEFFICIENT = 3;

    private int numberOfSubordinates;

    public Manager(String name, int age, String sex, int baseSalary, int salaryPerDay, int numberOfSubordinates) {
        super(name, age, sex, baseSalary, salaryPerDay);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

//    @Override
//    public String getName(){
//       return super.getName();
//    }

    @Override
    public int getSalary() {

        return (super.getBaseSalary() * (100 + getNumberOfSubordinates() * getBonusCoefficient())) / 100; // исправил на 3%
    }
    public int getBonusCoefficient() {
        return BONUS_COEFFICIENT;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int salaryTotal = 0;

        for (int i = 0; i < monthArray.length; i++) {

            if (MonthUtils.monthValidation(monthArray[i])) { // true?
                salaryTotal += (monthArray[i].getWorkingDays() * super.getSalaryPerDay() * (100 + this.numberOfSubordinates * 100 / 100)) / 100; // умножаем на рабочие дни
            } else return 0;
        }
        return salaryTotal;
    }

}

package HW7;

public final class Worker extends BaseEmployee implements IEmployee{

    public Worker(String name, int age, String sex, int baseSalary) {
        super(name, age, sex, baseSalary);
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }

    @Override
    public final int getBaseSalary() { //8.1.2 финальность метода излишняя т.к. класс final HW8.2.5
        return super.getBaseSalary();
    }

//        Переписываем, но без подчиненных т.к. в employee 2 метода getSalary HW7.4 Но getSalary(оба?) стал(и) абстрактный 8.1.1
//    @Override
//    public int getSalary(Month[] monthArray){
//        int salaryTotal = 0;
//
//        for (int i = 0; i < monthArray.length; i++) {
//
//            if (MonthUtils.monthValidation(monthArray[i])) { // true?
//                salaryTotal += (monthArray[i].getWorkingDays() * super.getSalaryPerDay()); // умножаем на рабочие дни
//            } else return 0;
//        }
//        return salaryTotal;
//    }
}

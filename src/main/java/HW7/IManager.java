package HW7;

public interface IManager {

    public String getName();

    public int getNumberOfSubordinates(); //for Manager & Director

    public void setNumberOfSubordinates(int numberOfSubordinates);//for Manager & Director implementation in Main


    public abstract int getBaseSalary(); //for EmployeeUtils

    public abstract int getSalary(Month[] monthArray);//for Manager & Director method 2

    public abstract int getSalary();//for Manager & Director method 1 & for EmployeeUtils to count max Add

}

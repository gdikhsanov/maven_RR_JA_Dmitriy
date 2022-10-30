package HW7;

public interface IEmployee {

    public int getSalary(); // lkz babaseEmployee и для Worker

   public int getBaseSalary();

    public void setBaseSalary(int baseSalary);

    public String getName();

    public void setName(String name);

    public int getAge();

    public void setAge(int age);

    public String getSex();

    public void setSex(String sex);


//    public abstract int getSalary(Month[] monthArray); // для зп за отработанное время для воркера
}

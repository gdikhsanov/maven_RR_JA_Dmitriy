package HW7;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EmployeeUtilsTest {
//массив менеджеров и директоров через IManager для отработки методов с подчиненными

    IManager[] m0 = new IManager[0];

    IManager[] mHappy = {
            new Manager("Bob", 30, "M", 5000, 200, 4),
            new Manager("Roy", 30, "M", 6000, 250, 5),
            new Director("Jack", 30, "M", 9000, 300, 10),
            new Director("Many", 30, "M", 5000, 150, 3),
            new Director("Patrik", 30, "M", 12000, 500, 15),
    };

    IManager[] mNegative = {
            new Manager("Bob", 30, "M", 0, 0, 0),
            new Manager("Roy", 30, "M", 0, 0, 0),
            new Director("123" , 41, "B", 0, 0, 0)
    };

    //массив смешанный черрез IEmployee для отработки поиска по имени для любого сотрудника, включая воркера

    IEmployee[] e0 = new IEmployee[0];

    IEmployee[] eHappy = {
            new Manager("Bob", 30, "M", 5000, 200, 4),
            new Worker("Roy", 30, "M", 6000),
            new Worker("Jack", 30, "M", 9000),
            new Director("Many", 30, "M", 5000, 150, 3),
            new Director("Patrik", 30, "M", 12000, 500, 15),
    };

    IEmployee[] eNegative = {
            new Manager("Bob", 30, "M", 0, 0, 3),
            new Worker("Roy", 30, "M", 0),
            new Director("123" , 41, "B", 0, 0, 2)
    };

    @Test
    public void testGetEmployeeMinSubordinates() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(EmployeeUtils.getEmployeeMinSubordinates(mHappy), 3,"1");
        softAssert.assertEquals(EmployeeUtils.getEmployeeMinSubordinates(m0), -1, "2");    //fail
        softAssert.assertEquals(EmployeeUtils.getEmployeeMinSubordinates(null), -1,"3");
        softAssert.assertEquals(EmployeeUtils.getEmployeeMinSubordinates(mNegative), 0, "4"); //fail
        softAssert.assertAll();
    }

    @Test
    public void testGetEmployeeMaxSubordinates() {
        Assert.assertEquals(EmployeeUtils.getEmployeeMaxSubordinates(mHappy), 15);
        Assert.assertEquals(EmployeeUtils.getEmployeeMaxSubordinates(m0), -1);
        Assert.assertEquals(EmployeeUtils.getEmployeeMaxSubordinates(null), -1);
        Assert.assertEquals(EmployeeUtils.getEmployeeMaxSubordinates(mNegative), 0);
    }

    @Test
    public void testGetEmployeeMaxOverpay() {
        Assert.assertEquals(EmployeeUtils.getEmployeeMaxOverpay(mHappy), 16200);
        Assert.assertEquals(EmployeeUtils.getEmployeeMaxOverpay(m0), -1);
    }

    @Test
    public void testGetEmployeeMinOverpay() {
        Assert.assertEquals(EmployeeUtils.getEmployeeMinOverpay(mHappy), 600);
        Assert.assertEquals(EmployeeUtils.getEmployeeMinOverpay(m0), -1);
    }

    @Test
    public void testGetEmployeeByName() {
        Assert.assertEquals(EmployeeUtils.getEmployeeByName(eHappy, "Roy"), eHappy[1]);
        Assert.assertEquals(EmployeeUtils.getEmployeeByName(eHappy, "Вася"), null);
    }
}
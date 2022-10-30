package HW7;

public class EmployeeUtils {

    //1_1 //Если ищем первого попавшегося сотрудника
    public static IEmployee getEmployeeByName(IEmployee[] employeeArray, String name) {

        IEmployee result = null;

        for (IEmployee i : employeeArray) {

            if (i.getName() != null && i.getName().equalsIgnoreCase(name)) {

                result = i;
                break;
            }
        }
        return result;
    }

//        //1_2 //Если ищем несколько сотрудников
//
////        public static String getEmployeeByName(Employee[] employeeArray, String name) {
////
////            StringBuilder fountEmployees = new StringBuilder();
////
////        for (Employee i : employeeArray) {
////
////            if (i.getName() != null && i.getName().equalsIgnoreCase(name)) {
////
////                fountEmployees.append(i.getName() + "\t" + i.getSex() + "\t" + i.getAge() + "\t" + i.getSalary() + "\n");
////            }
////        }
////        return fountEmployees.toString();
//
//    }
//
//    //2
//
//    public static IEmployee getEmployeeByPeaceOfName(IEmployee[] employeeArray, String name) {
//
//        IEmployee result = null;
//
//        for (IEmployee i : employeeArray) {
//            if (i.getName() != null && i.getName().matches(".*" + name + ".*")) {
//                result = i;
//                break;
//            }
//        }
//        return result; // объект(типа Employee)
//    }
//
//    //3
//
//    public static int getSalaryTotal(IEmployee[] employeeArray) {
//
//        int salaryTotal = 0;
//
////        for (int i = 0; i < employeeArray.length; i++) {
////            salaryTotal += employeeArray[i].getSalary();
////        }
//
//        for (IEmployee i : employeeArray) {
//            salaryTotal += i.getSalary();
//        }
//        return salaryTotal;
//    }
//
//    //4
//
//    public static int getSalaryMin(IEmployee[] employeeArray) {
//
//        int salaryMin = Integer.MAX_VALUE;
//
//        for (IEmployee i : employeeArray) {
//            salaryMin = Math.min(i.getSalary(), salaryMin);
//        }
//        return salaryMin;
//    }
//
//    //6
//
//    public static int getSalaryMax(IEmployee[] employeeArray) {
//
//        int salaryMax = Integer.MIN_VALUE;
//
//        for (IEmployee i : employeeArray) {
//            salaryMax = Math.max(i.getSalary(), salaryMax);
//        }
//        return salaryMax;
//    }

    //HW_7_6_1
    public static int getEmployeeMinSubordinates(IManager[] managerArray) {
        if (managerArray == null || managerArray.length == 0) {
            return -1;
        }

        int subMin = managerArray[0].getNumberOfSubordinates();

        for (int i = 0; i < managerArray.length; i++) {

            if (managerArray[i].getNumberOfSubordinates() < subMin) {
                subMin = managerArray[i].getNumberOfSubordinates();
            }
        }
        return subMin;
    }

    //HW_7_6_2
    public static int getEmployeeMaxSubordinates(IManager[] managerArray) {
        if (managerArray == null || managerArray.length == 0) {
            return -1;
        }

        int subMax = managerArray[0].getNumberOfSubordinates();

        for (int i = 0; i < managerArray.length; i++) {

            if (managerArray[i].getNumberOfSubordinates() > subMax) {
                subMax = managerArray[i].getNumberOfSubordinates();
            }
        }
        return subMax;
    }


    //HW_7_6_3
    public static int getEmployeeMaxOverpay(IManager[] managerArray) {

        if (managerArray == null || managerArray.length == 0) {
            return -1;
        }

        int overMax = managerArray[0].getSalary() - managerArray[0].getBaseSalary();

        for (int i = 1; i < managerArray.length; i++) {

            if (managerArray[i].getSalary() - managerArray[i].getBaseSalary() > overMax) {
                overMax = managerArray[i].getSalary() - managerArray[i].getBaseSalary();
            }
        }
        return overMax;
    }

    //HW_7_6_4
    public static int getEmployeeMinOverpay(IManager[] managerArray) {
        if (managerArray == null || managerArray.length == 0) {
            return -1;
        }

        int overMin = managerArray[0].getSalary() - managerArray[0].getBaseSalary();

        for (int i = 1; i < managerArray.length; i++) {

            if (managerArray[i].getSalary() - managerArray[i].getBaseSalary() < overMin) {
                overMin = managerArray[i].getSalary() - managerArray[i].getBaseSalary();
            }
        }
        return overMin;
    }
}

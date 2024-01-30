import java.util.*;

class Employee{
    private String Employee_id;
    public String Employee_name;
    protected String Employee_department;

    public void setEmployee_id(String employee_id) {
        Employee_id = employee_id;
    }

    public String getEmployee_id() {
        return Employee_id;
    }

}

public class Lab4P1{

    public static void main(String[] args){
        Employee E1 = new Employee();
        E1.Employee_name="HArsh";

        E1.Employee_department="Mathematics";

        //E1.Employee_id="Dep1001";
        //System.out.println(E1.Employee_id);

        System.out.println(E1.Employee_name);

        E1.setEmployee_id("IMH/10011/22");
        System.out.println(E1.getEmployee_id());

        System.out.println(E1.Employee_department);

    }
}
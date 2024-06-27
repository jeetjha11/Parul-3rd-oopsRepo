class Employee
{
    String name;
}

//class EmployeeManager
//{
//    Employee[]employees;
//
//    public EmployeeManager(int size)
//    {
//        this.employees=new Employee[size];
//    }
//}
public class Test {

    public static void main(String[] args) {
        Employee [] employees=new Employee[10];
        int index=0;
        Employee employee1=new Employee();
        employee1.name="Rahul";
        employees[index]=employee1;
        index++;

        Employee employee2=new Employee();
        employee2.name="Sita";
        employees[index]=employee2;
        index++;

        Employee employee23=new Employee();
        employee23.name="Sita";
        employees[index]=employee23;

        int employeeCount= employees.length;
        System.out.println(employeeCount);
        for(int i=0;i<employees.length;i++)
        {
            if (employees[i] != null) {
                System.out.println("Name: " + employees[i].name);
            }        }

    }


}

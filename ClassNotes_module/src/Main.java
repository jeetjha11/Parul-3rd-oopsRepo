
class Employee
{
    String empName;
    String empId;
    int empAge;
    String empGender;
    String empDesignation;
    String empPhone;
    String email;

    public void displayEmployeeDetails()
    {
        System.out.println("Name: "+ empName+ "\n" +
                            "Email"+ email+ "\n" +
                            "Phone Number: "+ empPhone+ "\n" +
                            "Designation: "+ empDesignation+ "\n" +
                            "Id: "+ empId+ "\n" +
                            "Age: "+ empAge+ "\n" +
                            "Gender: "+ empGender);
    }

    public  void executingTask()
    {
        System.out.println("Employee which name is: "+empName+ " Is Working");
    }

}

public class Main {

    public static int fibonacciIterative(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        System.out.print(a+ " "+ b+" ");
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c+" ");
        }
        return b;
    }
    public static void main(String[] args) {

        int n = 10; // Change n for different values
        System.out.println("The " + n + "th Fibonacci number (iterative): " + fibonacciIterative(n));



    }
}

public class Student {
    String name;
    String roll_number;
    String email;
    int age;
    String gender;
    String phoneNumber;


    public void displayStudentData()
    {
        System.out.println("Name: "+ name+ "\n"+
                           "Email: "+ email+ "\n"+
                           "Gender: "+ gender+ "\n" +
                           "Phone Number: "+ phoneNumber +"\n" +
                           "Roll Number: "+ roll_number);
    }

    public static void main(String[] args) {
        Student rahul=new Student();
        rahul.name="Rahul";
        rahul.email="rahul@gmail.com";
        rahul.phoneNumber="312313123";
        rahul.gender="Male";
        rahul.roll_number="1010";
        rahul.displayStudentData();

        Student Manisha=new Student();
        Manisha.name="Manisha";
        Manisha.email="manisha@gmai.com";
        Manisha.gender="Femail";
        Manisha.phoneNumber="12312313";
        Manisha.roll_number="10122";

        Manisha.displayStudentData();


    }
}

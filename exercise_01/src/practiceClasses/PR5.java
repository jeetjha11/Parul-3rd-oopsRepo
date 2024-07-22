package practiceClasses;

class Calculator
{

    public  Calculator()
    {
        System.out.println("Default Constructor");
    }
    public  Calculator(String name)
    {

    }
    public  Calculator(String name,int age)
    {

    }
    public  Calculator(float amount,int age)
    {

    }

    public void add(int a,int b){
        System.out.println("Sum of two number is:"+ (a+b));
    }
    public void add(float a,float b){
        System.out.println("Sum of two float number is:"+ (a+b));
    }
    public void add(int a,int b,int c){
        System.out.println("Sum of three number is:"+ (a+b+c));
    }
    public void add(int a,int b,int c,int d){
        System.out.println("Sum of four number is:"+ (a+b+c+d));
    }

}


public class PR5 {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.add(1,2);
        calculator.add(1,2,3);
        calculator.add(1,2,3,4);
        calculator.add(1.2f,3.5f);
    }



}

class Calculator1{
    public void add(int a,int b)
    {
        System.out.println("Sum is: "+ (a+b));
    }

    public void bitwiseAnd(int a,int b)
    {
        System.out.println("Bitwise And Result: "+ (a&b));
    }
}
public class Calc {
    public static void main(String[] args) {
        Calculator1 calculator1=new Calculator1();
        calculator1.add(1,2);

    }
}

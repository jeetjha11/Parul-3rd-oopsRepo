package practiceClasses;

class Bike
{
    public void display()
    {
        int a=500;
        int b=450;
        float f=(float)  b/(a*100);
        System.out.println(f);
    }
    public void display(String name)
    {

    }
    public void display(int age)
    {

    }
    public void display(String name,int age)
    {

    }
}
class Point
{

    String abc;
    public void display()
    {

    }

}


public class PR2 {
    public static void main(String[] args) {
        Bike bike=new Bike();
        bike.display();
        int a=4;

        bike.display("name",12);

        Point p=new Point();
        Point p1=new Point();
        System.out.println(p.abc);
        System.out.println(p);
        p.display();
        p1.display();



        Point arr[]=new Point[10];

        for (int i=0;i<arr.length;i++)
        {

            arr[i]= new Point();
        }

        for (Point point:arr)
        {
            System.out.print(point+"  ");
        }

    }


}

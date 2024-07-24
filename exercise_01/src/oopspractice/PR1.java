package oopspractice;

class Library
{
    String type;
    boolean isOpen;
    int numberOfBook;
    int numberOfBench;
    String nameOfLibrary;
    String locationOfLibrary;
    String openTime;
    String closeTime;
    int numberOfMembers;


    public void issueBook()
    {
        System.out.println("logic for issue book");
    }
    public void displayLibraryDetails()
    {
        System.out.println("Name of the library: "+ nameOfLibrary+" \n" +
                            "Number of Book"+numberOfBook);
    }
    public boolean isOpenLibrary()
    {
        return isOpen;
    }
}





class Fan
{
    // properties of the Fan object
    String name;
    String model;
    String color;
    int blade;

    // behaviour of the fan object
    public void speed()
    {
        System.out.println("Speed of the fan is: 23rpm");
    }

    public void display()
    {
        System.out.println("NAME:"+name+"\n" +
                            "Color"+color+"\n"+
                            "Model: "+model);
    }
}





public class PR1 {
    public static void main(String[] args) {

    }
}

package stringQuestion;

import java.util.Scanner;

// custom class syntax


class Library
{
    String name;
    String locationOfLibrary;
    int numberOfBook;
    int numberOfStaff;


    public void displayLibraryDetails()
    {
        System.out.println(" Name of the Library: "+name+ "\n" +
                            "Location of Library: "+locationOfLibrary+"\n" +
                            "Number Of Book: "+ numberOfBook);
    }
}






class People{
    // properties or instance variable
    String name;
    String email;
    String age;
    // defining the behaviour for people class
    public void canTalk()
    {
        System.out.println("People can talk");
    }
}







public class FindVowels {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String value=scanner.nextLine().toLowerCase();


        Library library=new Library();
        library.name="World Book";
        library.locationOfLibrary="Gujarat";
        library.numberOfBook=3;

        Library library1=new Library();
        library1.name="World Book 1";
        library1.locationOfLibrary="Gujarat 1";
        library1.numberOfBook=4;

        library.displayLibraryDetails();
        System.out.println();
        library1.displayLibraryDetails();

        // Systax for defining the object
        People people=new People();
        System.out.println(people.name="fsfs");


//        for(char c:value.toCharArray())
//        {
//
//        }

        for (int i=0;i<value.length();i++)
        {
//            char c=value.charAt(i);
//            String temp=new String(String.valueOf(c));
//            if(value.contains(temp))
//            {
//                System.out.print(value.charAt(i)+" ");
//            }



            if(value.charAt(i)=='a' || value.charAt(i)=='e' || value.charAt(i)=='i' || value.charAt(i)=='o' || value.charAt(i)=='u')
            {
                System.out.print(value.charAt(i)+" ");
            }
        }











    }
}

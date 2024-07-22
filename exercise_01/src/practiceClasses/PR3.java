package practiceClasses;

public class PR3 {

    public static void main(String[] args) {
        String s="abc";
        String b="abcd";
        char[] arr=s.toCharArray();
        for (char c:arr)
        {
            System.out.println(c);
        }
        System.out.println(s.charAt(2));
        System.out.println(s.length());

        System.out.println(s.equals(b));
        System.out.println(s==b);
        s.concat("aaa");
        System.out.println(s);

        String b1="bbb";
        String c="bbb";

        System.out.println(b1==c);
    }
}

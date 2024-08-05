package oopspractice;

class OuterClass {
    int outerField = 10;

    static class StaticNestedClass {
        // Access to outerField is not allowed
    }

    class InnerClass {
        public void printOuterField() {
            System.out.println(outerField); // Access to outerField is allowed
        }
    }
}

class Main {
    public static void main(String args[]) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();


    }
}
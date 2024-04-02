package method;

public class Overloading2 {
    public static void main(String[] args) {
        myMethod(1, 1.2);
        myMethod(1.2, 1);

        String[] names2 = {"1", "2", "3"};
        for(int i = 0; i <= names2.length; i++) {
            System.out.println(i);
        }

        String test = "03";
        System.out.println(Integer.valueOf(test) > 2);

//        test.replace("l", "");

        System.out.println(test);

    }


    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }

    public static void myMethod(double a, int b) {
        System.out.println("int a, double b");
    }

}

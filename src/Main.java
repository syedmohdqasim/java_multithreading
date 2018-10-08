public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
//        Printer printer = new Printer(1);
//        Printer printer2 = new Printer(0);
//        printer.start();
//        printer2.start();

        GCD gcd = new GCD();
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {2,4,6,8,10};

        int i = gcd.generalizedGCD(5, arr);
        System.out.println(i);
        i = gcd.generalizedGCD(5, arr2);
        System.out.println(i);
    }
}

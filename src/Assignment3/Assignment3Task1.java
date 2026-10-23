package Assignment3;
// Write a Calculator class with four static overloaded add() methods: add(int,int), add(double,double),
//add(int,double), and add(double,int). All return double. Write a main method that calls all four and confirms the
//results. Then add a static formatResult(double value, int decimals) method that returns the formatted string.

public class Assignment3Task1 {

        public static double add(int a, int b) {
            return a + b;
        }

        public static double add(double a, double b) {
            return a + b;
        }

        public static double add(int a, double b) {
            return a + b;
        }

        public static double add(double a, int b) {
            return a + b;
        }

        public static String formatResult(double value, int decimals) {
            return String.format("%." + decimals + "f", value);
        }

        public static void main(String[] args) {

            System.out.println(add(5, 10));
            System.out.println(add(5.5, 10.2));
            System.out.println(add(5, 10.5));
            System.out.println(add(5.5, 10));

            System.out.println(formatResult(15.6789, 2));
        }


}

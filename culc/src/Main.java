//////Essa almutiri


import java.util.ArrayList;
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double> results = new ArrayList<>();
            double list_num = 0;
            int ch;

            do {
                System.out.println("\nCalculator Menu:");
                System.out.println("Enter 1 to addition the numbers");
                System.out.println("Enter 2 to subtraction the numbers");
                System.out.println("Enter 3 to multiplication the numbers");
                System.out.println("Enter 4 to division the numbers");
                System.out.println("Enter 5 to modulus the numbers");
                System.out.println("Enter 6 to find minimum number");
                System.out.println("Enter 7 to find maximum number");
                System.out.println("Enter 8 to find the average of numbers");
                System.out.println("Enter 9 to print the last result in calculator");
                System.out.println("Enter 10 to print the list of all results in calculator");
                System.out.println("Enter 0 to exit");


                ch = scanner.nextInt();
                switch (ch) {
                    case 1:
                        list_num = Addition();
                        results.add(list_num);
                        break;
                    case 2:
                        list_num = Subtraction();
                        results.add(list_num);
                        break;
                    case 3:
                        list_num = multi();
                        results.add(list_num);
                        break;
                    case 4:
                        list_num = division();
                        if (list_num != 0) {
                            results.add(list_num);
                        }
                        break;
                    case 5:
                        list_num = modulus();
                        results.add(list_num);
                        break;
                    case 6:
                        list_num = minimum();
                        results.add(list_num);
                        break;
                    case 7:
                        list_num = maximum();
                        results.add(list_num);
                        break;
                    case 8:
                        list_num = Average();
                        results.add(list_num);
                        break;
                    case 9:
                        System.out.println("Last result: " + results.getLast());
                        break;
                    case 10:
                        System.out.println(results);;
                        break;
                    case 0:
                        System.out.println("Exiting the calculator. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid ch. Please try again.");
                }
            } while (ch != 0);


        }



        public static double Addition() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = num1+num2;
            System.out.println("Result: " + result);
            return result;
        }


        public static double Subtraction() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = num1-num2;
            System.out.println("Result: " + result);
            return result;
        }

        public static double multi() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = num1*num2;
            System.out.println("Result: " + result);
            return result;
        }

        public static double division() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            if (num2 != 0) {
                double result = num1 / num2;
                System.out.println("Result: " + result);
                return result;
            }else  {
                System.out.println("Error: Division by zero is not allowed.");
                return Double.NaN ;}

        }

        public static double modulus() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = num1 % num2;
            System.out.println("Result: " + result);
            return result;
        }


        public static double minimum() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = Math.min(num1, num2);
            System.out.println("Minimum: " + result);
            return result;
        }

        public static double maximum() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = Math.max(num1, num2);
            System.out.println("Maximum: " + result);
            return result;
        }


        public static double Average() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter first number: ");
            double num1 = in.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = in.nextDouble();
            double result = (num1 + num2) / 2;
            System.out.println("Average: " + result);
            return result;
        }




}
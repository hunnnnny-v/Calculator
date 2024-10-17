import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Calculator cal = new Calculator();
//        System.out.println("Addition is : "  + cal.add());
//        System.out.println("Division is : "  + cal.divide());
//        System.out.println("Multiplication is : "  + cal.multiply());
//        System.out.println("Subtraction is : "  + cal.subtract());
//
//        Scanner sc  = new Scanner(System.in);
//        int options= sc.nextInt();
//        int num1=sc.nextInt();
//        int num2=sc.nextInt();

//        Calculator cal= new Calculator();
        while (true)
        {

            System.out.println("1. Please Enter 1 for addition");
            System.out.println("2.Please Enter 2 for subtraction");
            System.out.println("3.Please Enter 3 for multiplication");
            System.out.println("4.Please Enter 4 for division");
            System.out.println("5. To terminate , Enter 5");
            System.out.print("Input: ");
            Scanner sc  = new Scanner(System.in);
            int options= sc.nextInt();
            switch (options)
            {
                case 1:
                    System.out.print("Please enter 1 number for addition");
                    double num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("Please enter 2 number for addition");
                    double num2=sc.nextDouble();
                    double sum = cal.add(num1,num2);
                    System.out.println("Summation of num1 and num2 is : " + sum);

                    break;
                case 2:
                    System.out.print("Please enter 1 number for subtraction :");
                    num1 = sc.nextDouble();
                    System.out.println();
                    System.out.print("Please enter 2 number for subtraction :");
                     num2=sc.nextDouble();
                    double minus = cal.subtract(num1,num2);
                    System.out.println("Subtraction of num1 and num2 is : " + minus);
                    break;
                case 3:
                    System.out.print("Please enter 1 number for multiplication :");
                     num1=sc.nextDouble();
                    System.out.println();
                    System.out.print("Please enter 2 number for multiplication : ");
                     num2=sc.nextDouble();
                     double multiply=cal.multiply(num1,num2);
                    System.out.println("Multiplication of num1 and num2 is : " + multiply);
                    break;
                case 4:
                    System.out.print("Please enter 1 number division");
                     num1=sc.nextDouble();
                    System.out.print("Please enter 2 number for division");
                     num2=sc.nextDouble();
                    double divide = cal.divide(num1,num2);
                    System.out.println("Division of num1 and num2 is : " + divide);
                    break;
                case 5:
                    System.out.println("Exiting");

                    break;
                default:
                    System.out.println("Please enter valid input");
                    break;

            }
        }
    }

}
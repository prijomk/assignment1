import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        String u_name = "Prijom123";
        String pass = "123Prijom";
        String iu, ip;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your UserName:\n");
        iu = sc.nextLine();
        System.out.println("Please Enter Your Password:\n");
        ip = sc.nextLine();
        if (iu.equals(u_name) && ip.equals(pass)){
            System.out.println("WELCOME " + iu);
            System.out.println("Choose:\n1) Calculator \n2) Greatest Number \n3) Result Generator \n4) Guessing Game\n");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    //Calculator
                    double n1, n2, result;
                    System.out.print("Enter n1: ");
                    n1 = sc.nextDouble();
                    System.out.print("Enter n2: ");
                    n2 = sc.nextDouble();
                    System.out.println("1) Addition");
                    System.out.println("2) Subtraction");
                    System.out.println("3) Multiplication");
                    System.out.println("4) Division");

                    int ch = sc.nextInt();
                    switch (ch){
                        case 1:
                            result = n1 + n2;
                            System.out.println("The sum is " + result);
                            break;
                        case 2:
                            result = n1 - n2;
                            System.out.println("The difference is " + result);
                            break;
                        case 3:
                            result = n1 * n2;
                            System.out.println("The product is " + result);
                            break;
                        case 4:
                            if (n2 != 0) {
                                result = n1 / n2;
                                System.out.println("The division is " + result);
                            } else {
                                System.out.println("Error: Division by zero is not allowed.");
                            }
                            break;
                        default:
                            System.out.println("Invalid operation.");
                            }
                case 2:
                    System.out.print("First Number");
                    double num1 = sc.nextDouble();

                    System.out.print("Second Number");
                    double num2 = sc.nextDouble();

                    if (num1 > num2) {
                        System.out.println("Greater: "+ num1);
                    } else if (num2 > num1) {
                        System.out.println("Greater: "+ num2);
                    } else {
                        System.out.println("Equal");
                    }
                case 3:
                    System.out.print("Enter Math's Marks");
                    double m1 = sc.nextDouble();

                    System.out.print("Enter the Science Marks");
                    double m2 = sc.nextDouble();

                    double tmarks = m1 + m2;
                    double percen = (tmarks / 200) * 100;

                    System.out.println("Total Marks: " + tmarks);
                    System.out.println("Percentage: " + percen + "%");

                case 4:
                    int a = 5;
                    int b = 8;

                    System.out.print("Guess a number between 1 and 10: ");
                    int guess = sc.nextInt();

                    if (guess == a || guess == b) {
                        System.out.println("Congratulations!");
                    } else {
                        System.out.println("Better Luck Next Time");
                    }

            }
        }
        else {
            System.out.println("Invalid Username or Password");
        }
    }
}

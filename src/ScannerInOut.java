import java.nio.BufferOverflowException;
import java.util.Scanner;

/**
 * Testing of the Scanner class
 * @version 08.27.2025
 * @author 26lee
 *
 */
public class ScannerInOut extends Object {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        int age;
        double gpa;
        while(true) {
            try {
                System.out.print("Enter your name: ");
                name = in.nextLine();
                if (!(name.matches("[a-z-A-Z\\s]+") && !name.trim().isEmpty())) {
                    System.out.println("Invalid name.");
                }
                else{
                    break;
                }
            }
            catch (Exception e) {
                //User enters exception catch if bad data
                System.out.println(e.getMessage());
                //Flush the return key ASCII code from input buffer
                //ASCII 10 or 13
                in.next();
            }
        }
        while(true) {
            try {
                System.out.print("Enter your age: ");
                age = Integer.parseInt(in.nextLine().trim().replaceAll("[^0-9]",""));

                if(age < 0 || age > 999) {
                    System.out.println("Invalid age");
                }

                else {
                    break;
                }

            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                in.nextLine();
            }
        }
        while(true) {
            try {
                System.out.print("Enter your gpa: ");
                gpa = in.nextDouble();
                if(gpa < 0 || gpa > 4) {
                    System.out.println("Invalid gpa");
                }
                else {
                    break;
                }
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                in.next();
            }
        }
        System.out.println("Hello " + name + ", " + age + " years old, " + gpa + "GPA.");
    }
}
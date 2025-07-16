package daily_class_for_java.thirddayclass;

import java.util.Scanner;

public class ScannerClassss {
    public static void main(String[] args) {
        // Importing the Scanner class
        Scanner scanner = new Scanner(System.in);


        // Prompting user for input
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        // Displaying the input
        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        short shortValue = scanner.nextShort();
        // Displaying the short value
        System.out.println("You entered the short value: " + shortValue);
        // Prompting user for a double value

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        // Displaying the double value
        System.out.println("You entered the double value: " + doubleValue);
        // Prompting user for a float value
        System.out.print("Enter a float value: ");
        float floatValue = scanner.nextFloat();
        // Displaying the float value
        System.out.println("You entered the float value: " + floatValue);
        // Prompting user for a long value
        System.out.print("Enter a long value: ");
        long longValue = scanner.nextLong();
        // Displaying the long value
        System.out.println("You entered the long value: " + longValue);
        // Prompting user for a byte value
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();
        // Displaying the byte value
        System.out.println("You entered the byte value: " + byteValue);
        // Prompting user for a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        // Displaying the boolean value
        System.out.println("You entered the boolean value: " + booleanValue);
        // Prompting user for a character
        System.out.print("Enter a character: ");
        char charValue = scanner.next().charAt(0);
        // Displaying the character
        System.out.println("You entered the character: " + charValue);



        // Closing the scanner
        scanner.close();
    }
}

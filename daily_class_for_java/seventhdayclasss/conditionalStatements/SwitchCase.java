package daily_class_for_java.seventhdayclasss.conditionalStatements;

public class SwitchCase {

    // == is used for comparison in switch case

    // switch case Syntax :
    // switch(variable) {
    //     case value1:
    //         // code to be executed if variable == value1
    //         break;
    //     case value2:
    //         // code to be executed if variable == value2
    //         break;
    //     // more cases...
    //     default:
    //         // code to be executed if variable doesn't match any case
    // }

    // default key
    //break statement is used to exit the switch case block
    public static void main(String[] args) {
        // Example of switch case
       /* int i = 5;
        switch (i){
            case 1:   // i==1
                System.out.println(" it is first statement");
                break;
            case 2:  // i==2
                System.out.println(" it is second statement");
                break;
            case 3:   // i==3
                System.out.println(" it is third statement");
                break;
            default: // if i is not equal to 1, 2, or 3
                System.err.println("given number is not 1, 2, or 3");
                break;
        }  */

        // Example for common case
        int day = 9;
        switch (day) {
            case 1: // Monday
            case 2: // Tuesday
            case 3: // Wednesday
                System.out.println("It's a weekday.");
                break;
            case 4: // Thursday
            case 5: // Friday
                System.out.println("It's almost the weekend.");
                break;
            case 6: // Saturday
            case 7: // Sunday
                System.out.println("It's the weekend!");
                break;
            default:
                System.err.println("Invalid day number.");
        }
    }

    //Practice Questions: By using switch case
     //  input 5
    //output: it is odd number

    //  input 10
    //output: it is even number


    //Enter a value
    // Enter b value
    // Enter your operation symbol (+, -, *, /, %)
    //output :   // a + b = result
    // output :   // a - b = result
    // output :   // a * b = result
    // output :   // a / b = result
    // output :   // a % b = result
}

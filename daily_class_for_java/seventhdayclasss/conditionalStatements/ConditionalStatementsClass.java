package daily_class_for_java.seventhdayclasss.conditionalStatements;

import java.util.Scanner;

public class ConditionalStatementsClass {
    public static void main(String[] args) {
//        int a = 11;
//        if(a==10) {
//            System.out.println("a is equal to 10");
//        }else {
//            System.out.println("a is not equal to 10");
//        }

        //pass or fail
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
//        if(marks >= 35) {
//            System.out.println("You have passed the exam.");
//        } else {
//            System.out.println("You have failed the exam.");
//        }
        if(marks>= 90) {
            System.out.println("You have got A+ grade.");
        } else if(marks >= 80 && marks < 90) {
            System.out.println("You have got A grade.");
        } else if(marks >= 70 && marks < 80) {
            System.out.println("You have got B grade.");
        } else if(marks >= 60 && marks < 70) {
            System.out.println("You have got C grade.");
        } else if(marks >= 50 && marks < 60) {
            System.out.println("You have got D grade.");
        } else if(marks >= 35 && marks < 50) {
            System.out.println("You have got E grade.");
        } else {
            System.out.println("You have failed the exam.");
        }

            }




}

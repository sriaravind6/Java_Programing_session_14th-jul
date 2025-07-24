package daily_class_for_java.sixthdayclass;

import java.util.Scanner;

public class Operatorss {

    static int a=10;
    static int b;

    void addition(int a, int b) {
        this.a = a;this.b= b;
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    void subtraction(int a, int b) {
        this.a = a;this.b= b;
        int diff = a - b;
        System.out.println("Subtraction: " + diff);
    }
    void multiplication(int a, int b) {
        this.a = a;this.b= b;
        int product = a * b;
        System.out.println("Multiplication: " + product);
    }

    public static void main(String[] args) {
        Operatorss ops = new Operatorss();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a value:");
//        a= sc.nextInt();
//        System.out.println("Enter b value:");
//        b = sc.nextInt();
//        ops.addition(20,40);
//        ops.subtraction(50,30);
//        ops.multiplication(2,3);

//        a= 3;
//        b= 10;
//        System.out.println(b/a+ " Quotient");
//        System.out.println(b%a + " Remainder");
//        int a = 10;
//        a=a+1;
//        System.out.println("Incremented value of a: " + a);
//        a= a+1;
//        System.out.println("Incremented value of a: " + a);
//        a=a+1;
//        System.out.println("Incremented value of a: " + a);
//        a= a+1;
//        System.out.println("Incremented value of a: " + a);
//        a=a+1;
//        System.out.println("Incremented value of a: " + a);
//        a= a+1;
//        System.out.println("Incremented value of a: " + a);
//        a--;
//        System.out.println("Incremented value of a: " + a);
//        a--;
//        System.out.println("Incremented value of a: " + a);
//        a--;
//        System.out.println("Incremented value of a: " + a);
//        System.out.println("Incremented value of a: " + a);
//        System.out.println(++a); //10+1 ==> 11 pre-increment  a=a+1
//        ++a; //11+1 ==> 12 post-increment a =a-1
//        System.out.println("Incremented value of a: " + a);

//        System.out.println("Incremented value of a: " + a);
//        System.out.println(--a); //10-1 ==> 11 pre-dec  a=a+1
//        a--; //9-1 ==> 8 post-dec a =a-1
//        System.out.println("Incremented value of a: " + a);

        a= 20;
        b= 20;

//        System.out.println(a==b); //F
//        System.out.println(a!=b); //T
//        System.out.println(a>b); //F
//        System.out.println(a<b); //T
//        System.out.println(a>=b); //F
//        System.out.println(a<=b);//T

//        System.out.println(a>b);
//        System.out.println(a>=b);
//        System.out.println(a>b || a==b); //T
//        System.out.println(a==1 || b==20); //T


//        a=a+5;
        a += 5;// a = a + 5
        System.out.println(a);
        a-= 5; // a = a - 5
        System.out.println(a);
        a *= 5; // a = a * 5
        System.out.println(a);
        a /= 5; // a = a / 5
        System.out.println(a);
        a %= 5; // a = a % 5
        System.out.println(a);
    }
}

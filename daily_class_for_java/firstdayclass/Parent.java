package daily_class_for_java.firstdayclass;

public class Parent {

    public void method1() {
        System.out.println("This is parent method1"); // set of actions
    }

    public void method2() {
        System.out.println("This is parent method2"); // set of actions
    }

    public void method3() {
        System.out.println("This is parent method3"); // set of actions
    }

    public static void main(String[] args) {
        // Creating an object of the class
        Parent class1Obj = new Parent();
        // Calling methods using the object
        class1Obj.method1();
        class1Obj.method2();
        class1Obj.method3();
    }
}

package daily_class_for_java.firstdayclass;

public class First_Day_JavaClass {
    public void method1() {
        System.out.println("This is method1"); // set of actions
    }
    private void method2() {
        System.out.println("This is method2"); // set of actions
    }
    private void method3() {
        System.out.println("This is method3"); // set of actions
    }
    public static void main(String[] args){
        // class reference obj = new class reference();
        // Creating an object of the class
        //new is the keyword to create an object
        First_Day_JavaClass class1Obj = new First_Day_JavaClass();
        // Calling methods using the object
        class1Obj.method1();
        class1Obj.method2();
        class1Obj.method3();
    }

}
package daily_class_for_java.seconddayclass;

public class Class_2 {
    public void method1() {
        System.out.println("This is method1 from Class_2"); // set of actions
    }

    public static void main(String[] args) {
        Class_2 obj = new Class_2();
        obj.method1();
        Class_1 obj1 = new Class_1();
        obj1.method1(); // Calling method1 from Class_1
        obj1.method2();
        obj1.method3();
    }
}

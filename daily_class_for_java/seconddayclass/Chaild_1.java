package daily_class_for_java.seconddayclass;

import daily_class_for_java.firstdayclass.Parent;

public class Chaild_1 extends Parent {
    public void childMethod1() {
        System.out.println("This is child method1 from Class_2"); // set of actions
    }

    public static void main(String[] args) {
        Chaild_1 obj = new Chaild_1();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.childMethod1(); // Calling child method
    }
}

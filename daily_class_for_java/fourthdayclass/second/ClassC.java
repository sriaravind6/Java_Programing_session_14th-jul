package daily_class_for_java.fourthdayclass.second;

import daily_class_for_java.fourthdayclass.first.ClassA;

public class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassC classA = new ClassC();
        classA.methodA();
        ClassA.methodE();
        classA.methodC();// This will work because methodC is protected and ClassC extends ClassA
    }
}

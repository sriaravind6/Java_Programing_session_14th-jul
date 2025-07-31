package daily_class_for_java.eightdayclass.Superr;

public class ChildClass extends ParentClass {
//    public ChildClass(int a) {
//        super(a); // calling parent class constructor
//        System.out.println("Child class constructor called");
//    }

    public ChildClass() {
        super(10);
        // calling parent class default constructor
        System.out.println("Child class default constructor called");
//        super(10); // this will call the parent class default constructor

    }

    public static void main(String[] args) {
        ChildClass child = new ChildClass();
    }


}

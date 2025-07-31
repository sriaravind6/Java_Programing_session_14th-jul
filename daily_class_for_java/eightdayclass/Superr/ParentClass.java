package daily_class_for_java.eightdayclass.Superr;

public class ParentClass {
    public ParentClass(int a) {
        System.out.println("Parent class constructor called");
    }

    public ParentClass() {
         // calling parent class constructor

        this(10);
        System.out.println("Parent class default constructor called");

        }
}

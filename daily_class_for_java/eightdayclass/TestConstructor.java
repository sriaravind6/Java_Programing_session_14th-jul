package daily_class_for_java.eightdayclass;

public class TestConstructor {
    public TestConstructor(){
        System.out.println(" Aravind constructor called");
        System.out.println(" Aravind constructor called");
        System.out.println(" Aravind constructor called");
        System.out.println(" Aravind constructor called");
    }
    public void method(int a ,int b){
        System.out.println("Method with two parameters called, values: " + a + ", " + b);
        System.out.println(" Sum of a and b: " + (a + b));
    }

    public static void main(String[] args) {
        TestConstructor testConstructor = new TestConstructor();

         Sample sample = new Sample("Aravind",10);

        testConstructor.method(10, 20);

    }
}

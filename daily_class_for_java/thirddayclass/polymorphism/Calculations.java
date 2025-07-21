package daily_class_for_java.thirddayclass.polymorphism;

public class Calculations {
    public void add(int a, String b) {
        System.out.println("Adding int and String: " + a + " and " + b);
    }
    public void add(String b,int a) {
        System.out.println("Adding String and int: " + b + " and " + a);
    }

    public static void main(String[] args) {
        Calculations calc = new Calculations();
        calc.add(10, "20");
        calc.add("30", 40);
    }
}

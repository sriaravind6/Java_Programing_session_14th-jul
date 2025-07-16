package daily_class_for_java.thirddayclass;

public class DataTypesClasss {

    int x = 10;
    byte y = 20;
    short z = 30;
    long a = 10564549494889L;
    float b = 50.5f;
    double c = 60.5;
    char d = 'A';
    boolean e = true;
    String f = "Hello, World!";
    public void displayDataTypes() {
        System.out.println("Integer: " + x);
        System.out.println("Byte: " + y);
        System.out.println("Short: " + z);
        System.out.println("Long: " + a);
        System.out.println("Float: " + b);
        System.out.println("Double: " + c);
        System.out.println("Character: " + d);
        System.out.println("Boolean: " + e);
        System.out.println("String: " + f);
    }
    public static void main(String[] args) {
        DataTypesClasss dataTypesObj = new DataTypesClasss();
        dataTypesObj.displayDataTypes();
    }
}

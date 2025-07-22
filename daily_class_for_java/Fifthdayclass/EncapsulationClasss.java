package daily_class_for_java.Fifthdayclass;

public class EncapsulationClasss extends supper {

    private int age;
    int a;

    // Getter method for age
    public int getAge() {
        return age;
    }
    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    private int cartItemes;
    private int itemValue;

    public void setcartItemes(int cartItemes) {
        this.cartItemes = cartItemes;
    }
    public void setitemValue(int itemValue) {
        this.itemValue = itemValue;
    }
    public int getcartItems() {
        return cartItemes;
    }
    public int getitemValue() {
        return itemValue;
    }

    public void cartValue(int cartItemes, int itemValue) {
        setcartItemes(cartItemes);
        setitemValue(itemValue);
        int totalValue = getcartItems() * getitemValue();
        System.out.println("Total value of items in the cart: " + totalValue);
    }

    public void exmple(int a) {
        super.a=a;

    }
}

package daily_class_for_java.fourthdayclass.abstractClasss;

public class Customer {
    public static void main(String[] args) {
        Mobile nokia = new Nokia();
        nokia.call();
        nokia.contactList();
        nokia.message();

        Mobile samsung = new Samsung();
        samsung.contactList();
        samsung.camera();



        Mobile apple = new UpdatedApple();
        apple.call();
        apple.contactList();
        apple.message();
        apple.browseInternet();
        apple.camera();
    }
}

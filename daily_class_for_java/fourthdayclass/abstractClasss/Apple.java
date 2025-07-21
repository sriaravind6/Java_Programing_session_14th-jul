package daily_class_for_java.fourthdayclass.abstractClasss;

public class Apple extends MobileThirdPartyVendor{
    @Override
    public void contactList() {
        System.out.println(" contactList function code from Apple");
    }
    @Override
    public void call() {
       System.out.println("call function code from Apple");
    }

    @Override
    public void message() {
        System.out.println("mess function code from Apple");
    }
    @Override
    public void browseInternet() {
        System.out.println("browser internet function code from Apple");
    }
    @Override
    public void camera() {
        System.out.println("camera function code from Apple");
    }
}

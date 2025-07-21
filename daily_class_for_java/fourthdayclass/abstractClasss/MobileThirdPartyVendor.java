package daily_class_for_java.fourthdayclass.abstractClasss;

public abstract class MobileThirdPartyVendor implements Mobile {
    @Override
    public void call() {
        System.out.println("common call function code from third-party vendor mobile");
    }

    @Override
    public void message() {
        System.out.println("common message function code from third-party vendor mobile");
    }

    // Abstract methods to be implemented by subclasses
    public abstract void contactList();

    public void browseInternet(){
        System.out.println("common browserInternet function code from third-party vendor mobile");
    }

    public void camera(){
        System.out.println("common camera function code from third-party vendor mobile");
    }
}

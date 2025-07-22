package daily_class_for_java.Fifthdayclass;

public class UserClasss extends EncapsulationClasss {
    public static void main(String[] args) {
        UserClasss user = new UserClasss();

        user.setAge(25);
        int userAge = user.getAge();
        System.out.println("User's age is: " + userAge);

        user.setAge(30);
        System.out.println(user.getAge());

        user.setAge(45);
        System.out.println(user.getAge());

        user.cartValue(2,300);
        user.cartValue(6,200);


    }


}

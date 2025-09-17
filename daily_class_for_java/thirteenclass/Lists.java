package daily_class_for_java.thirteenclass;

import java.util.*;

public class Lists {
    public static void main(String[] args) {
//        int[] arr = new int[4];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4]= 50;

//        System.out.println(Arrays.toString(arr));

        List list = new ArrayList();
        List list1 = new LinkedList();
//        List list2 = new Vector();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("aravind");
        list.add(40.5);
        list.add(true);
        list.add(50);
        list.add(60);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Object o : list){
            System.out.println(o);
        }
        System.out.println(list);
        System.out.println(list.reversed());

        //prime number programe
        int n = 37;
        int count=0;
        for (int i = 1; i <=n ; i++) {

            count++;
        }
    }
}

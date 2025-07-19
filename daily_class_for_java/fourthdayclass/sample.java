package daily_class_for_java.fourthdayclass;

import java.util.ArrayList;

public class sample {
    public static void main(String[] args) {
        var arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            var list = new ArrayList<String>();
            list.add("Hello");
            var str = "Hello fgdfg fgdgdgdgd fdfsf";
            var str2 = str.split(" ");
            for (String s : str2) {
                System.out.println(s);
            }

        }
        var var = 10;
    }
}

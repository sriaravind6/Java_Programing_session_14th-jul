package daily_class_for_java.ElevenDayClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Collections.sort;


public class Arrayyys {
    public static void main(String[] args) {
        int[] arr = {4,6,2,7,1,8};

        // arr = {1,2,4,6,7,8};
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
        arr[1] = 1000;
        System.out.println(Arrays.toString(Arrays.stream(arr)
                .sorted()
                .toArray()));
        List <Object> names = new ArrayList();
        names.add("Java");
        names.add(1);
        names.add(0.1);

        names.forEach(E -> System.out.print(E+"  "));
        }

        //array ===> length / single data type
    // arr[10] ===> arr[5] = 1000; =0 0 0






    }


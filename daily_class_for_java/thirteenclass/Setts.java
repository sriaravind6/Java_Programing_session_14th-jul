package daily_class_for_java.thirteenclass;

import java.util.*;

public class Setts {
    public static void main(String[] args) {
        /** set = { 2,3,"dsfsdf",'c',4.56788}
         * no indexes
         * no duplicates
         * unordered
         * faster than list
         * implementations: HashSet, LinkedHashSet, TreeSet
         */
//        Set set = new HashSet();
//        set.add(40);
//        set.add(20);
//        set.add(30);
//        set.add(10);
//        set.add("aravind");
//        set.add(40.5);
//        set.add(true);
//        System.out.println(set);
//
//        Set set = new LinkedHashSet();
//        set.add(40);
//        set.add(20);
//        set.add(30);
//        set.add(10);
//        set.add("aravind");
//        set.add(40.5);
//        set.add(true);
//        System.out.println(set);
//        Set set = new TreeSet();
//        set.add(40);
//        set.add(20);
//        set.add(30);
//        set.add(10);
//        set.add("aravind");
//        set.add(40.5);
//        set.add(true);
//        System.out.println(set);
        Set<Integer> set = new TreeSet<>();
        set.add(40);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(50);
        set.add(60);
        set.add(7);
//        for(Integer i : set){
//            System.out.println(i);
//        }
//        set.forEach(e-> {System.out.println(e);
//            System.out.println("Above value Multiple with X 2 ==> "+ (e*2));});
//        set.stream().map(e-> e*2).forEach(e-> System.out.println("Stream value ==> "+e));
//        set.contains(40);
//        set.iterator().hasNext();
        set.stream().filter(e -> e < 40).toList().forEach(e-> System.out.println(e));
        List list = new ArrayList(set);
        for(Integer i : set){
            if(i==40){
                System.out.println(i);
                list.add(i);
            }
        }
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

    }
}

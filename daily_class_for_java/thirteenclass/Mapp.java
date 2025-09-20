package daily_class_for_java.thirteenclass;
import java.util.*;

public class Mapp {
    public static void main(String[] args) {
//        set = {2,4,6,flgknlk,eehgd,ghl}
//        list = [2,4,6,flgknlk,eehgd,ghl]
//        map = {"Key = Value", "Key = Value", "Key = Value", "Key = Value"}
//        map = {1= "aravind", 2="kumar"}
         Map map = new HashMap();
         map.put("Aravind", 1);
         map.put(1,"Aravind");
        map.put("Aravind", 100);
        map.put(2,"Aravind");
        map.put("Aravind_","Aravind_");
        System.out.println(map);
//        for (int i = 0; i < map.size() ; i++) {
//            System.out.println(map.get(i));
//        }
//
//        for(Object o : map.keySet()){
//            System.out.println(map.get(o));
//        }
        System.out.println(map.keySet());
        System.out.println(map.values());

    }
}

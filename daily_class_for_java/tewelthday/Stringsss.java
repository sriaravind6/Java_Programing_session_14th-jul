package daily_class_for_java.tewelthday;

public class Stringsss {
    public static void main(String[] args) {
        String[] array ={"java", "python", "c++", "javascript", "php", "ruby", "swift", "kotlin", "go", "rust"};
        String str= "Aravind Swamy";
//        str.charAt(1); ==> Char
//        str.length();   ==> int
//        str.toString();
//        str.toLowerCase();  ==> String
//        str.toUpperCase();  //==> String
//        str.indexOf(' ');   ===> int
//        str.indexOf("amy");  ===>
//        str.lastIndexOf('a');
//        str.lastIndexOf("amy");
        str = str.replace(' ', 'z');
//        str.replace(" ", "bm");
//        str.substring(0, 5);
//        str.substring(5,7);
//        str.substring(8);
//        String[] s = str.split(" ");
//        System.out.println(str);
//        str = str + "fgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg";
//        str.equals("Aravind Swamyfgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
//        str.equalsIgnoreCase("aravind swamyfgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
//        str.concat("fgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
//        str.contains("Aravind");
//        str.startsWith("Aravind");
//        str.endsWith("swamyfgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
//        str.trim(); // remove space from start and end
//        str.isEmpty(); // check if string is empty
//        str.isBlank();
//        str.valueOf(1000); // convert int to string
//        str = String.valueOf(1000); // convert int to string
//        System.out.println(str);
        String ss = "AraVind";
//        System.out.println(Character.isUpperCase(ss.charAt(3)));
//        String xs= ss.replace(ss.charAt(3),Character.toLowerCase(ss.charAt(3)));
//        System.out.println(xs);

//        for (int i = 0; i <ss.length() ; i++) {
////            System.out.println(ss.charAt(i));
//            char ch = ss.charAt(i);
//            if(Character.isUpperCase(ch)){
//                System.out.println("given character is UpperCase: " + ch);
//            }
//            else{
//                System.out.println("given character is LowerCase: " + ch);
//            }
//        }
//        String dummy ="";
//        for (int i = ss.length()-1; i >=0 ; i--) {
//            dummy = dummy + ss.charAt(i);
//        }
//        System.out.println(dummy);
//        String dummy ="";
//        for (int i = 0; i <ss.length() ; i++) {
//            dummy = ss.charAt(i)+ dummy;
//        }
//        System.out.println(dummy);


        String spacee = "H e l l o";
        System.out.println(spacee.length());
        System.out.println(spacee.indexOf(' '));
        System.out.println(spacee.lastIndexOf(' '));

//        String s1 ="123456734890";
//        if (s1.length()==10) {
//            System.out.println("Valid");
//        } else {
//            System.out.println("Invalid");
//        }
//
        System.out.println(spacee.replace(' ', '$'));
        String s1 = "H E L L O";
        String xxx ="";
        for (int i = 0; i <s1.length() ; i++) {
            if (s1.charAt(i)==' '&& i==5) {
               xxx = xxx + '$';
            }
            xxx=xxx+ s1.charAt(i);
        }
        System.out.println(xxx);

//        JAYA    ARAV
//        AJYA    RAVA
    }



}

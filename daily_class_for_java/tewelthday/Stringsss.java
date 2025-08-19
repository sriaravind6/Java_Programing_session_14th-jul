package daily_class_for_java.tewelthday;

public class Stringsss {
    public static void main(String[] args) {
        String[] array ={"java", "python", "c++", "javascript", "php", "ruby", "swift", "kotlin", "go", "rust"};
        String str= "Aravind Swamy";
//        str.charAt(1);
//        str.length();
//        str.toString();
//        str.toLowerCase();
//        str.toUpperCase();
//        str.indexOf('a');
//        str.indexOf("amy");
//        str.lastIndexOf('a');
//        str.lastIndexOf("amy");
        str = str.replace(' ', 'z');
//        str.replace(" ", "bm");
//        str.substring(0, 5);
//        str.substring(5,7);
//        str.substring(8);
        String[] s = str.split(" ");
        System.out.println(str);
        str = str + "fgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg";
        str.equals("Aravind Swamyfgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
        str.equalsIgnoreCase("aravind swamyfgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
        str.concat("fgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
        str.contains("Aravind");
        str.startsWith("Aravind");
        str.endsWith("swamyfgkdgmnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfgnfg");
        str.trim(); // remove space from start and end
        str.isEmpty(); // check if string is empty
        str.isBlank();
        str.valueOf(1000); // convert int to string
        str = String.valueOf(1000); // convert int to string
        System.out.println(str);

//        JAYA    ARAV
//        AJYA    RAVA



    }



}

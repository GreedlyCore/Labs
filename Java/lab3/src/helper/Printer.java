package lab3.src.helper;

public class Printer {

    public static void print(Object... objs) {
        for (Object obj : objs) {
            // auto call ToString method here
            System.out.print(obj + " ");
        }
        System.out.print(", \n");

    }
    public static void printLine() {
        for (int i = 0 ; i < 18; i++) {
            System.out.print("-");
        }
        System.out.print("\n"); 

    }

    public static String setSpaces(String... strings) {
        String s = "";
        for (String str : strings) {
            s += str + " ";
        }
        //s += ", \n";
        return s;
    }

}

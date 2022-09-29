package lecture;

import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

import static java.lang.Math.pow;

public class secondLecture {
    public static void main(String[] args) {
        System.out.println(sqrt(PI));
        System.out.println(PI);
        System.out.println(pow(sqrt(PI), 2));

        int x = 10;
        int delta = x > 0 ? x : Math.abs(x);

        if (x > 0) {
            delta = x;

        } else {
            delta = Math.abs(x);
        }

        // condition ? A:B;

        // Primitive; и
        int y = 100;
        switch (y) {
            case 1:
                foo();
                break;

            case 2 + 2:
                x--;
                break;
            case 3, 5:
                y += 1;
                break;
            default:
                System.out.println("noo");
                ;

        }
        // THE SAME CODE
        switch (y) {
            case 1 -> foo();

            case 2 + 2 -> x--;

            case 3, 5 -> y += 1;

            default -> System.out.println("noo");

        }

        int z = switch (x) {
            case 1 -> 1;
            case 2 -> x * x;
            case 3 -> x * x * x;
            default -> 10;

        };

        // yield - иелд

        int k = switch (x) {
            case 1 -> 1;
            case 2, 3 -> {
                int result = x * x;
                yield result;
            }

            default -> 10;

        };

        squareTable();
        // RandomBlocks();

        compareReferenceTypes();
    }

    public static void foo() {
        System.out.println();
    }

    public static void squareTable() {
        for (int i = 0, j = 0; i < 10 && j < 10; ++i, ++j) {
            System.out.printf("%d * %d = %d", i, j, i * j);
        }
    }

    public static void exitAllCycles() {
        // break labels;
        String str = "some string";
        full: for (char c : str.toCharArray()) {
            for (int i = 0; i < 10; i++) {
                if (c == (char) i) {
                    break full;
                }
            }
        }
    }

    public static void print(String... args) {
        for (String string : args) {
            System.out.print(string + " ");
        }
    }

    public static void checkingVARARGS() {

        print("This", "is", "me!!!!");

    }

    // public static void RandomBlocks(){
    // int x = 6;
    // {
    // int x = 10;
    // System.out.println("i am 10: " + Integer.toString(x));

    // }

    // x++;
    // System.out.println(x);

    // }

    public static void compareReferenceTypes() {
        String name1 = new String("Name");
        String name2 = new String("Name");

        // String is ummutable - при любом изменении строки возвращаем новую
        String name3 = "Name";
        String name4 = "Name";

        // new - cmd for выделения куска памяти
        // give me a new участок of memory
        System.out.println(name1 == name2);
        System.out.println(name3 == name4);

    }

    public static void beginArray() {
        int[] x = { 5, 2 };
        int count = x.length; // property

        // sort
        // search
        // copy

    }

    public static void beginMatrix() {
        int[][] matrix = { { 5, 2 }, {}, { 1, 2, 3 }, { 4, 6, 8, 9 } };

        int[][] box = new int[6][8];
        int[][] box2 = new int[6][]; // можно потом смотреть

        int[][][] gigaBox = new int[2][6][3];

        // box - смотрит на 6 массивов ссылочеых переменных, которые смотрят уже на свои
        // ссылочные
        // sort
        // search
        // copy

    }
}

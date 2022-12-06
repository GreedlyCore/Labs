
public class Interesting {
    
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i++);
        System.out.println(i);


        // Post-increment & Pre-increment
        // post will be applied after smth new operation
        // i++ will be 2 after ++i;
        System.out.println(i++ + ++i);
    }
}

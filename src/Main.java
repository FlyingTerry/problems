import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        String s = "demo2";
        switch (s) {
            case "demo1":
                System.out.println("demo1");
            case "demo2":
                System.out.println("demo2");
                break;
            default:
                System.out.println("demo3");
        }
    }
}

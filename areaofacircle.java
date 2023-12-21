import java.util.Scanner;
public class areaofacircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = scanner.nextInt();
        double pi = 3.14;
        int s = (int)(pi * radius * radius);
        System.out.println(s);

    }
}

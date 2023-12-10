import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age < 20 || age > 60)
            System.out.println("можно не работать");
    }
}
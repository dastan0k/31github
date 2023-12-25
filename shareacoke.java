import java.util.Scanner;
public class shareacoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); // количество банок в ящике
        int b = scanner.nextInt(); // количество людей в кабинете
        System.out.println(a*1.0/b);

    }
}

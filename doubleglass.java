import java.util.Scanner;
public class doubleglass {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean a = scanner.nextBoolean();

        if (a == true){
            System.out.println((int) Math.ceil(glass));
        } else if (a == false) {
            System.out.println((int) Math.floor(glass));
        }

    }
}

import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        while (scanner.hasNextInt()){
            int oddmax = scanner.nextInt();
            if ((oddmax>max) && (oddmax%2 == 0)){
                max = oddmax;
            }
        }
        System.out.println(max);

    }
}

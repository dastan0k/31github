import java.util.Scanner;
public class minimum {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            if (number<min){
                min = number;
            }

        }
        System.out.println(min);

    }
}

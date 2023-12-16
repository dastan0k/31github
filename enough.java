import java.util.Scanner;
public class enough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            String word = scanner.nextLine();

            if (word.equals("enough")){
                break;

            }
            System.out.println(word);
        }
    }
}

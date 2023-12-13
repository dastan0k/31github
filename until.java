import java.util.Scanner;
public class until {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean isEnter = false;
        while (!isEnter){
            if(scanner.hasNextInt()){
                int number = scanner.nextInt();
                sum =sum + number;
            } else if(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.equals("ENTER")){
                    isEnter=true;
                }
            }
        } System.out.println(sum);

    }
}

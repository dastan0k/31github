import java.util.Scanner;
public class maxmass {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        array = new int[n];

        for(int i = 0; i<n; i++){
            array [i] = console.nextInt();
        }

        int max = array[0];

        for (int i=1; i<n; i++){
            if (array[i]>max){
                max=array[i];
            }
        }System.out.println(max);
    }
}

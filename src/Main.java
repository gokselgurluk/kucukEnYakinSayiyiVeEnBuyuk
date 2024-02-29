import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Scanner inpput = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = inpput.nextInt();


                int[] list = {15,12,788,1,-1,-778,2,0};
                Arrays.sort(list);
                 for (int num : list) {
                     System.out.print(num + " ");

                    }
        System.out.println();

                int min = list[0];
                int max = list[0];

                for (int i : list) {
                    if (number > i) {
                        min = i;
                    }
                }
                    for (int y = list.length - 1; y >= 0; y--) {

                    if (number < list[y]) {
                        max = list[y];
                    }
                }

                System.out.println("Girilen sayıdan küçük en yakın sayı: " + min);
                System.out.println("Girilen sayıdan büyük en yakın sayı: " + max);

    }

}
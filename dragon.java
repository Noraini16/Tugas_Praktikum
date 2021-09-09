import java.util.*;
import java.util.Arrays;


class dragon {
    public static int [] bacaaAngkaaDariCommandLine() {
        Scanner s = new Scanner(System.in);

        int count = s.nextInt();
        s.nextLine();
        System.out.println("Masukkan diameter atau tinggi dipisah dengan spasi: ");
        int [] numbers = new int[count];
        Scanner numScanner = new Scanner(s.nextLine());
        for (int i = 0; i < count; i++) {
            if (numScanner.hasNextInt()) {
                numbers[i] = numScanner.nextInt();
            } else {
                System.out.println("Angka yang anda masukan kurang");
                break;
            }
        }

        return numbers;
    }


    public static void main(String[] args) {
        System.out.println("Ada berapa dragon?");
        int[] array_dragon = bacaaAngkaaDariCommandLine();
        Arrays.toString(array_dragon);
        System.out.println("Ada berapa knight?");
        int[] array_knight = bacaaAngkaaDariCommandLine();
        Arrays.toString(array_knight);

        Arrays.sort(array_dragon);
        Arrays.sort(array_knight);
        int knight = 0;
        int remaining_dragon = array_dragon.length;

        for (int i = 0; i < array_dragon.length; i++) {
            for (int j = 0; j < array_knight.length; j++){
                if (array_dragon[i]==array_knight[j] || array_knight[j]>array_dragon[i]) {
                    knight += array_knight[j];
                    remaining_dragon -= 1;
                    break;
                }
            }
        }
        if (remaining_dragon == 0){
            System.out.println(knight);
        }
        else {
            System.out.println("knight fall");
        }
    }
}
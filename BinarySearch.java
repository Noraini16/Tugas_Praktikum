
import java.util.*;

public class BinarySearch {
    public static int binary_search(int array [], int element, int start, int end) {
    int mid = (start+end)/2;
    if (start>end) {
        return -1;
    }
    
    if (element == array[mid]) {
        return mid;
    }

    if (element < array[mid]) {
        return binary_search(array, element, start, mid-1);
    }
    else {
        return binary_search(array, element, mid+1, end);
    }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan panjang array yang anda ingin gunakan: ");
        int banyak_angka;
        banyak_angka=sc.nextInt();  
        int[] array = new int[banyak_angka];
        System.out.println("Masukkan array angka: ");  
        for(int i=0; i<banyak_angka; i++)  
            {  
            array[i]=sc.nextInt();  
            }
        int panjang = array.length;
        System.out.print("Berapa angka yang ingin anda cari: ");
        int angka_yang_dicari = sc.nextInt();
        
        int result = binary_search(array,angka_yang_dicari,0,panjang);
        if (result == -1)
            System.out.println("Angka tidak ditemukan");
        else
            System.out.println("Angka ditemukan pada index ke- " + result);
    }
}


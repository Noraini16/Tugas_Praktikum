
package tugasprak;
import java.util.*;

public class prima {
    public static void main(String[] args) {
        Scanner inputData = new Scanner (System.in);
        System.out.print("Masukkan Bilangan : ");
        int bilangan = inputData.nextInt();
        int n = 0 ; 
        for (int i=1;i<= bilangan ; i++){
            if (bilangan%i==0)
                n=n+1;}
            if (n==2)
                System.out.println("Bilangan Prima");
            else 
                System.out.println("Bilangan Bukan Prima ");
        
        
        
    }
    
}

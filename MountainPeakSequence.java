//Mountain Peak Sequence
package mountainpeaksequence;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.NoSuchElementException ;

public class MountainPeakSequence {
    
    static void mountainPeak(){
        int flag = 0;
        do{
            try{
                Scanner s = new Scanner(System.in);         
                int N = s.nextInt();
                if (N>2){
                    BigInteger two = new BigInteger("2");
                    BigInteger modulo = new BigInteger("1000000007");
                    System.out.println(two.modPow(BigInteger.valueOf(N-1), modulo).subtract(two.mod(modulo)).mod(modulo));
                }
                else
                    System.out.println("O");
            s.close();
            }
            catch(InputMismatchException e){
                System.out.print("Kindly Enter a Number : ");
                flag = 1;
            }
            catch(NoSuchElementException e){
                System.out.print("");
                break;
            }
        }while(flag == 1);
    }
    
    public static void main(String[] args) {
        mountainPeak();       
    }    
}

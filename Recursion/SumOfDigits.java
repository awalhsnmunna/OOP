import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int ans = sumOfDigits(N);
        System.out.println(ans);
    }
  
    static int sumOfDigits(int N){

        if(N==0){ 
            return 0;
        }
        int digit = N%10;
        N = N/10;

        return digit+sumOfDigits(N);
    }
}

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int ans = productOfNum(N);
        System.out.println(ans);
    }

    static int productOfNum(int N){

        if(N<1){
            return 1 ;
        }
        int digit = N%10;
        N = N/10;

        return digit*productOfNum(N);
    }
}

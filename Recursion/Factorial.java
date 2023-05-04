import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int ans = Fact(N);
        System.out.println(ans);
    }
  
    static int Fact(int N){
        
        if(N==1){
            return 1;
        }
        return N * Fact(N-1);
    }
}

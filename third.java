import java.util.*;
public class Main{

    public static int findMax(int arr[]){
        int max;
        max=arr[0];

        for(int i=0; i< arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int arr[] = new int [size];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int max= findMax(arr);
        System.out.println(max);
    }
}

import java.util.Scanner;

public class Main {
    public static int trying(int arr[]){
        int max= arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            //System.out.print(arr[i]+" ");
        }
        return max;
    }

    public static void main (String[] args){
        Scanner input=new Scanner(System.in);
        int[] array=new int[5];

        for (int i = 0; i < array.length ; i++) {
            array[i]= input.nextInt();
        }
        int max= trying(array);
        System.out.println(max);
    }
}

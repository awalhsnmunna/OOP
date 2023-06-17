
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {5,4,3,2,1};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int[] mergeSort(int[] arr){

        if(arr.length==1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second){

        int[] ans = new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j< second.length){

            if(first[i]<second[j]){
                ans[k]=first[i];
                i++;
            }
            else{
                ans[k]=second[j];
                j++;
            }
            k++;
        }

        while(i<first.length){
            ans[k]=first[i];
            i++;
            k++;
        }

        while(j<second.length){
            ans[k]=first[j];
            j++;
            k++;
        }

        return ans;
    }
}

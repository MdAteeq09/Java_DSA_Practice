import java.util.*;
public class sorting {

    public static void BubblSort(int arr[]) {
        for(int turns = 0; turns < arr.length-1; turns++) {
            for(int j=0; j < arr.length-1-turns; j++){
                if(arr[j] >  arr[j+1]) {

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static void SelctionSort(int arr[]) {
        for(int turn = 0; turn < arr.length; turn++) {
            int minPos = turn;
            for(int j= turn+1; j < arr.length; j++) {

                if(arr[minPos] < arr[j]) {
                    minPos = j;

                }

            }

            int temp = arr[turn];
            arr[turn] = arr[minPos];
            arr[minPos] = temp;

        }
    }

    public static void InsertionSort(int arr[]) {
        for(int i=1; i<arr.length; i++){
            int curr = arr[i];
            int perv = i-1;

            while (perv >=0 && arr[perv] > curr) {
                arr[perv+1] = arr[perv];
                perv--;
            }
            arr[perv+1] = curr;

        }
    }

    public static void CountingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            largest = Math.max(largest , arr[i]);
        }

        int count[] = new int[largest+1];

        for(int i=0; i < arr.length; i++){
            count [arr[i]]++;
        }

        int j = 0;

        for(int i=count.length-1; i>=0; i--) {

            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.err.println();

    }

    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        CountingSort(arr);
        printArr(arr);//
    }
    
}

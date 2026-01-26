import java.util.*;

public class QuadSort{
    public static int[] randomArray(int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = randomArray(100);
        int[] arr2 = randomArray(1000);
        int[] arr3 = randomArray(10000);
        int[] arr4 = randomArray(100000);
        int[] arr5 = randomArray(1000000);
        System.out.println(Arrays.toString(bubbleSort(arr3)));
        System.out.println(Arrays.toString(selectionSort(arr3)));
    }

    public static int[] bubbleSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j > 0; j--){
                break;
            }
        }

        return arr;
    }

    public static int[] mergeSort(int[] arr){
        return arr;
    }
}

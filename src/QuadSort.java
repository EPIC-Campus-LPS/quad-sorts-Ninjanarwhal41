import java.util.*;

public class QuadSort{
    public static void main(String[] args){
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
            for (int key = i+1; key > 0; key--){
                if (arr[key] > arr[key-1]){
                    int temp = arr[key];
                    arr[key] = arr[key-1];
                    arr[key-1] = temp;
                }
            }
        }

        return arr;
    }

    public static int[] mergeSort(int[] arr, int left, int right){
        if(left == right){
            return arr;
        }
        if (left < right){
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            int size1 = mid - left + 1;
            int size2 = right - mid;

            int[] arrL = new int[size1];
            int[] arrR = new int[size2];

            for (int i = 0; i < size1; i++){
                arrL[i] = arr[left + i];
            }
            for (int j = 0; j < size2; j++){
                arrR[j] = arr[mid + 1 + j]
            }
        }
        return arr;
    }
}

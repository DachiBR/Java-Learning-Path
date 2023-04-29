/* 
Bubble Sort Algorithm
1. In Bubble sort algorithm we compare the first two elements of an array and swap them if required.
2. If we want to sort the elements of array in ascending order and if the first element is greater than second then, we need to swap the elements.
3. If the first element is smaller than second, we don’t need to swap the elements. This process go on until last and second last element is compared and swapped. 
*/

/*
If we have the array as {50,20,60,90,40}
and we apply bubble sort to sort the array,
then the resultant array after each iteration will be as follows:

               Original array: {50, 20, 60, 90, 40}

Array after first iteration          20  ->   50   ->   60   ->   40   ->   90
Array after second iteration         20  ->   50   ->   40   ->   60   ->   90
Array after third iteration          20  ->   40   ->   50   ->   60   ->   90
Array after fourth iteration         20  ->   40   ->   50   ->   60   ->   90
           
               Sorted array is  20  40  50  60 90
*/

public class BubbleSort {
    public static void main(String [] arguments) {
        int arr[] = {50, 20, 60, 90, 40};
        int length = arr.length;

        for (int i=0; i<length;i++){
            for(int j=1;j<length-i;j++) {
                if(arr[j-1] > arr[j]){
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.print("Sorted Array:");
        for(int i=0; i<length;i++){
            System.out.print( arr[i] +" ");
        }
    }
}

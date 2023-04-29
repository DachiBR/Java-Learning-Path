/*
Merge Sort in Java is a divide and conquer-based sorting algorithm. In this sorting algorithm the unsorted array keeps on dividing into two halves until the array is either empty or contains only one element, which is the base case of Merge Sort, and then the halves are combined/Merged in sorted order producing a sorted array. It is one of the most popular and efficient sorting techniques.

Merge Sort Algorithm:
1. Declare Array, left, right and mid variables
2. Find mid by formula mid = (left+right)/2
3. Call MergeSort for the left to mid
4. Call MergeSort for mid+1 to right
5. Continue step 2, 3, and 4 while the left is less than the right
6. Then Call the Merge function

Advantages of Merge Sort Algorithm:

Merge sort is an efficient sorting algorithm in Java, with an average and worst-case time complexity of O(n log n).
Merge sort has a simple and elegant recursive implementation, making it easy to understand and implement in Java.
Merge sort uses the divide and conquer technique, which reduces the problem into smaller subproblems until they can be solved directly.
Merge sort has a space complexity of O(n), making it suitable for sorting large datasets without running out of memory.
Merge sort is a stable sorting algorithm, which preserves the relative order of equal elements in the input array.
Merge sort is suitable for sorting complex data structures such as arrays of objects or strings.

*/

public class MergeSort {
    public static void main(String [] arguments) {

        int[] array={8,2,5,3,4,7,6,1};

        mergeSort(array);

        System.out.print("Sorted Array is:");

        for(int i=0;i<array.length;i++){
            System.out.print(" " + array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {

        int length = array.length;
        if(length <= 1) return; //base case

        int middle = length /2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        int i=0; //left array
        int j=0; //right array

        for(;i<length;i++){
            if(i < middle){
                leftArray[i]=array[i];
            } else {
                rightArray[j]=array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array); 
    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {

        int leftSize = array.length /2;
        int rightSize = array.length -leftSize;
        int i=0, l=0, r=0; //indices

        //check the conditions for merging
        while(l < leftSize && r < rightSize ){
            if(leftArray[l] < rightArray[r]){
                array[i] =leftArray[l];
                i++;
                l++;
            } else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        while( l < leftSize){
            array[i] =leftArray[l];
            i++;
            l++;
        }
        while( r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}

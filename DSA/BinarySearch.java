
public class BinarySearch {


    public static int binarySearch(int[] arr, int target) {
        int start = 0; // start index of array is 0
        int end = arr.length - 1; //end index of array is length of array - 1

        int mid = start + (end - start) / 2; //mid index of array is start index + (end index - start index) / 2

        while (start <= end) { // run loop until start is less than or equal to end;
            if (target > arr[mid]) { // if target greater than mid start will be mid + 1
                start = mid + 1;
            } else if (target < mid) { // if target is less than mid end is mid - 1
                end = mid - 1;
            } else {
                return mid; // if target is equal to mid return mid
            }
        }
        return -1; // // if target is not found return -1
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 9, 12, 65, 78, 90, 100 };
        int target = 12;
        int result = binarySearch(arr, target);
        System.out.println(result);
        
    }
    
}

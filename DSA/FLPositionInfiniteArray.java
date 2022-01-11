public class FLPositionInfiniteArray {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        int target = 10;
        System.out.println(findRange(arr, target));


    }
    
    static int findRange(int[] arr, int target) {
        int start = 0, end = 1; // first range we will search for is of box of size 2
        while (target > arr[end]) { // if target is greater than the last element of the box, we will increase the box size by 2
            int newStart = end + 1; // new start will be the end of the previous box + 1
            end = end + (end - start + 1) * 2; // end will be the end of the previous box + the size of the box
            start = newStart;// start will be the new start
        }
        return binarySearch( arr, target, start, end); // call binary search on the box

    }

    public static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid ]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}

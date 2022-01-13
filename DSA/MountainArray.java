public interface MountainArray {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 1 };
        int target = 3;
        int result = search(arr, target);
        System.out.println(result);

    }
    
    public static int search(int[] arr, int target) {
        int peak = peakInMountainArray(arr);
        int firstTry = agnosticBinarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;

        }
        return agnosticBinarySearch(arr, target, peak, arr.length - 1);
    }

    public static int peakInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) { // while start is less than or equal to end
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) { // if the element at mid is less than the element at mid + 1, we know that the peak is on the left side of mid
                start = mid + 1;
            } else { // if the element at mid is greater than the element at mid + 1, we know that the peak is on the right side of mid

                end = mid - 1; // we need to move the end pointer to the left side of mid
            }
        }
        return start; // return the index of the peak
    }
    
    public static int agnosticBinarySearch(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;


            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }

    
}

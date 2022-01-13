public class AgnosticBS {
    public static int agnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
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
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr ={ 7, 5,4,3,2,1 };
        int target = 3;
        int result = agnosticBS(arr, target);
        System.out.println("Index position of element is : " + result);
    }
}
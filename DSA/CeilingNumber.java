public class CeilingNumber {
    public static int ceilingNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("Element found at index: " + mid);
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
        System.out.println("Element greater than "+target + "is" + arr[start]);
        return start;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 7, 9, 10 };

        int target = 8;
        int ans = ceilingNumber(arr, target);
        System.out.println("At index " + ans);
    }
}

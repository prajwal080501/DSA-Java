 class PeakMountain{

    public static int peakInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){ // while start is less than or equal to end
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]){ // if the element at mid is less than the element at mid + 1, we know that the peak is on the left side of mid
                start = mid + 1;
            }else{ // if the element at mid is greater than the element at mid + 1, we know that the peak is on the right side of mid

                end = mid - 1; // we need to move the end pointer to the left side of mid
            }
        }
        return start; // return the index of the peak
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0};
        int result = peakInMountainArray(arr);
        System.out.println(result);
    }
}
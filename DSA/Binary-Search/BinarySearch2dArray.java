public class BinarySearch2dArray {

    public static int[] search(int[][] arr, int target){
        int r = 0; // row index of the array
        int c = arr.length-1; // column index of the array
        // arr.lenght-1 is the last index of the array

        while(r < arr.length && c>= 0){ // while r is less than the length of the array and c is greater than or equal to 0
            if(arr[r][c] == target){ // if the value at the row r and column c is equal to the target
                return new int[]{r,c}; // return the row r and column c
            }
            if(arr[r][c] < target){  // if the value at the row r and column c is less than the target
                r++; // increment row
            }
            else{
                c--; // decrement column
            }
        }
        return new int[]{-1,-1}; // return -1 -1 if target is not found
    }

    public static void main(String[] args) {
        int[][] arr = {
        //   0   1  2  3
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int target = 50;
        int[] result = search(arr,target);
        System.out.println(result[0] + " " + result[1]);
    }
}


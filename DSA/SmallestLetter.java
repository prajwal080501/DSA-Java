public class SmallestLetter {

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return letters[start % letters.length];
    }
    
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f' };
        char target = 'f';
        char result = nextGreatestLetter(arr, target);
        System.out.println(result);
    }

    
}

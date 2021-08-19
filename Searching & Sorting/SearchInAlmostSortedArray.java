
public class SearchInAlmostSortedArray {
    private static int search(int[] arr, int start, int end, int x){
        int mid =-1;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if (x == arr[mid]) return mid;
            else if (mid < end && x == arr[mid + 1]) return mid + 1;
            else if (mid > start && x == arr[mid - 1]) return mid - 1;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x) return search(arr, start, mid - 2, x);

            // Else the element can only be present
            // in right subarray
            return search(arr, mid + 2, end, x);
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {10, 20, 40, 30, 50};
        int n = arr.length;
        int x = 100;

        int result = search(arr, 0, n - 1, x);
        if(result == -1)
            System.out.println("Element is not present in array");
        else
            System.out.println("Element is present at index " + result);
    }
}

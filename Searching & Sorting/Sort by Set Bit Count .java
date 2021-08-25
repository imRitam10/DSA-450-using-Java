class Compute  { 
    static void sortBySetBitCount(Integer arr[], int n){ 
        // Your code goes here
         Arrays.sort(arr, (a, b) -> -Integer.compare(Integer.bitCount(a), Integer.bitCount(b)));
    } 
}

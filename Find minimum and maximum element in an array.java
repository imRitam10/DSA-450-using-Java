class Compute {
    static pair getMinMax(long a[], long n) {
    
        Arrays.sort(a);
       return new pair(a[0],a[(int)(n-1)]);
        
    }
}
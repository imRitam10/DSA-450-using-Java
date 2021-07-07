class Solution
{
    //Function to merge the arrays.
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int a = 0 , b = 0 ;
        int c =(int) (n)-1;
        long temp;
        while(a <= c && b < m){
            if (arr1[a] < arr2[b]) a++;
            else {
                temp = arr2[b];
                arr2[b] = arr1[c];
                arr1[c] = temp;
                b++;
                c--;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }
}
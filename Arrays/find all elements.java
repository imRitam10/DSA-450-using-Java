
/*
    Given an array of size n and a number k, find all elements that appear more than n/k times
 */
 

import java.util.*;


public class FindAllElements {
        public static void solution(int a[], int n, int k){
            int x = n / k;

            HashMap<Integer, Integer> hM = new HashMap<>();

            for (int i = 0; i < n; i++){
                if (!hM.containsKey(a[i])) hM.put(a[i], 1);
                else{
                    int count = hM.get(a[i]);
                    hM.put(a[i], count + 1);
                }
            }
            // Checking the Frequency, if it is more than n/k
            for (Map.Entry m : hM.entrySet()){
                Integer temp = (Integer)m.getValue();
                if (temp > x) System.out.println(m.getKey());
            }
        }
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            int k = sc.nextInt();
            solution(a, n, k);
        }
}

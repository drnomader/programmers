import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        
        if (arr1.length != arr2.length) {
            return Integer.compare(arr1.length, arr2.length);
        } else {
            int arr1Sum = sumArray(arr1);
            int arr2Sum = sumArray(arr2);
            return Integer.compare(arr1Sum, arr2Sum);
        }
    }
    
    private int sumArray(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}
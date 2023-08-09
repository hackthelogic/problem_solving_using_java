/*
 * Problem Name: Palindromic Array
 * Difficulaty Level : School
 * problem no: 06
 * description of problem:
 * Given a Integer array A[] of n elements. Your task is to complete the function PalinArray. Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
 * Input:
 * N = 5
 * A[] = {111, 222, 333, 444, 555}
 * Output: 1
 */

public class PalindromicArray {
    public static int palinArray(int[] a, int n){
        for(int i = 0; i < n; i++){
            int copy = a[i];
            int rev = 0;
            while(a[i]>0){
                rev = rev * 10 + a[i] % 10;
                a[i] = a[i] / 10;
            }
            if(copy != rev)
                return 0;
        }
        return 1;
    }

    public static void main(String[] args){
        int[] arr = {111,222,333,444,555};// TO change the array value to check the multiple test cases
        int result = palinArray(arr,arr.length);
        System.out.println(result);
    }
}

/*
 * Problem Name: Sum of Array of Elements
 * Difficulaty Level : School
 * problem no: 03
 * description of problem:
 * Given an integer array arr of size n, you need to sum the elements of arr.
 * Input:
 * n = 3
 * arr[] = {3 2 1}
 * Output: 6
 */

public class SumofArrayofElement {
    public static int sumElement(int arr[], int n)
    {
        int result = 0;
        for(int i=0;i<n;i++){
            result += arr[i];
            //System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};// Change the array value to check the multiple test cases
        int result = sumElement(arr, arr.length);
        System.out.println(result);
    }
}

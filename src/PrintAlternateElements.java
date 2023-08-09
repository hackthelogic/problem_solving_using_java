/*
 * Problem Name: Print alternate elements of an array
 * Difficulaty Level : School
 * problem no: 04
 * description of problem:
 * You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).
 * Input:
 * N = 4
 * A[] = {1, 2, 3, 4}
 * Output: 1 3
 */

public class PrintAlternateElements {
    public static void printElements(int arr[], int n)
    {
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            i++;
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        printElements(arr, arr.length);
    }
}

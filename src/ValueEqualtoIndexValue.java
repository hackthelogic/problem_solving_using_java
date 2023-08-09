/*
 * Problem Name: Value Equal to Index Value
 * Difficulaty Level : School
 * problem no: 02
 * description of problem:
 * Given an array Arr of N positive integers. Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
 * Note: There can be more than one element in the array which have the same value as its index. You need to include every such element's index. Follows 1-based indexing of the array.
 * Input:
 * N = 5
 * Arr[] = {15, 2, 45, 12, 7}
 * Output: 2
 * Explanation: Only Arr[2] = 2 exists here.
 */


import java.util.ArrayList;

public class ValueEqualtoIndexValue {
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(arr[i] == i+1)
                result.add(i+1);
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr = {11,2,54,4,5};// to change the array values to
        ArrayList<Integer> res = valueEqualToIndex(arr, arr.length);
        for(Integer x : res){
            System.out.print(x+" ");
        }
    }
}

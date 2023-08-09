/*
 * Problem Name: Sum of Series
 * Difficulaty Level : School
 * problem no: 01
 * description of problem:
 * Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
 * Input:
 * N = 1
 * Output: 1
 * Explanation: For n = 1, sum will be 1.
 */


public class SumofSeries {
    public static long sumofseries(int n){
        return (long) n*(n+1)/2;
    }
    public static void main(String[] args) {
       long result = sumofseries(5);// Change arguments to check the multiple test cases
        System.out.println(result);
    }
}
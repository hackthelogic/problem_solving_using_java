/*
 * Problem Name: Print 1 to N without using loops
 * Difficulaty Level : School
 * problem no: 05
 * description of problem:
 * Print numbers from 1 to N without the help of loops.
 * Input:
 * N = 10
 * Output: 1 2 3 4 5 6 7 8 9 10
 */

public class Print1toN {
    public static void main(String[] args){
        printElements(10);
    }

    public static void printElements(int N){
        if(N>0){
            printElements(N-1);
            System.out.print(N + " ");
        }
    }
}

package fib;

public class Solution {


    public static void fib(int a, int b, int n){
        int prev = a;
        int next = b;

        System.out.print(prev+ " ");
        System.out.print(next + " ");

        int current = 0;

        for(int i = 0; i < n; i++){
            current = prev + next;
            System.out.print(current + " ");
            prev = next;
            next = current;
        }
        System.out.println();
    }


}

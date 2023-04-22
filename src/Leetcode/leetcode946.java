package Leetcode;

import java.util.Stack;

public class leetcode946 {
    public static boolean validateStackSequences(int[] push, int[] pop) {
        Stack<Integer> st = new Stack<>();
        int n = push.length;
        int j=0;
        for(int i=0;i<n;i++){
            st.push(push[i]);
            while(!(st.isEmpty()) && st.peek()==pop[j]){
                st.pop();
                j++;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        int[] p = {1,2,3,4,5};
        int[] q = {4,5,3,2,1};
        System.out.println(validateStackSequences(p,q));
    }
}

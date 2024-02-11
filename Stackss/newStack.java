//Stack is LAST IN FIRST OUT - meaning the last element that is inserted in the stack will be popped out first. Stack is like Array 

import java.util.Stack;

public class newStack {
    //initialization of Stack
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(4);
        st.push(7);
        System.out.println(st);

    }
}

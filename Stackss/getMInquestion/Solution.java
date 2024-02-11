import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        minStack news = new minStack();
        news.push(10);
        news.push(20);
        System.out.println(news.getMin());
        news.push(-3);
        System.out.println(news.getMin());
        news.pop();
        System.out.println(news.getMin());

    }   
    static class minStack{
        Stack<Integer> st = new Stack<>();
        public void push(int val){
            st.push(val);
        }
        public int pop(){
            return st.pop();

        }
        public int top(){
            return st.peek();
        }

        public Stack display(){
            return st;
        }

        public Stack<Integer> getMin() {
            Stack<Integer> minStack = new Stack<>();
            
            for (int i = 0; i < st.size(); i++) {
                if (minStack.empty() || st.elementAt(i) < minStack.peek()) {
                    minStack.push(st.elementAt(i));
                } else {
                    minStack.push(minStack.peek());
                }
            }
            return minStack;
        }
        
    }
}

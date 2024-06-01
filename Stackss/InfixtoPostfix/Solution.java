import java.util.Stack;

public class Solution {

    public static void main(String[] args) {
        String s = "A*(B+C)/D";
        System.out.println(infixToPostfix(s));
    }
    public static String infixToPostfix(String exp) {
        // Your code here
        Stack<Character> st = new Stack<>();
        String res = "";
        
        for(Character c : exp.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                res+=c;
            }
            else if(c == '(') st.push(c);
            else if(c == ')'){
                while(!st.empty() && st.peek() != '('){
                     res+=st.pop();
                }
                st.pop();
            }
            else{
                while(!st.empty() && precedence(c) <= precedence(st.peek())){
                    res += st.pop();
                }
                st.push(c);
            }
        }
        
        while(!st.empty()){
            res+=st.pop();
        }
        
        return res;
        
    }
    
    public static int precedence(Character ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
}

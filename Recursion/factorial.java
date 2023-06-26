
class factorial {

    static int fact(int n){
        if(n == 0){
            return 1; //base case
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        // recurision is a function call itself to solve a smaller problem. Recursion is the method where the solution to a problem depends on the solutions to smaller instances of the same problem.
        int n = 5;
        System.out.println(fact(n));
    }
}

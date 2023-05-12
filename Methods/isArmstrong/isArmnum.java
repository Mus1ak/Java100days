public class isArmnum {
    //armstrong is basically if we have a number and if we cube every number individually and sum it..if it comes exactly the same as the number itself then it is armstrong number.
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmStrongnum(i)) {
                System.out.println(i);
            }
        }
    }
    static boolean isArmStrongnum(int num){
        int original = num;
        int sum=0;
        while(num>0){
            int rem = num%10;
            int cube = rem*rem*rem;
            sum+=cube;
            num/=10;
        }
        if(sum == original){
            return true;
        }else{
            return false;
        }
    }
}

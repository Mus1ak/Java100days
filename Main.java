import java.sql.Array;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int arrivalTime[] = {0, 1, 2,3,4};
        int executionTime[] = {0,8,4,2,9};
        int serviceTime[] = new int[5];
        System.out.println(Arrays.toString(arrivalTime));
        System.out.println(Arrays.toString(executionTime));
        serviceTime[0] = 0;
        for (int i = 0; i < serviceTime.length; i++) {
            serviceTime[i] = executionTime[i]+executionTime[i];
        }
        System.out.println(Arrays.toString(serviceTime));
    }
}

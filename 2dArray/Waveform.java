
public class Waveform {
    public static void main(String[] args) {
        int[][] arr = {{10,20,30,40},{50,60,70,80},{90,100,110, 120}};
        int rows = 3;
        int col = 4;
        WaveArray(arr, rows, col);
    }

    public static void WaveArray(int[][] arr, int rows, int col){
        for (int i = 0; i < rows; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] +" ");
                }
            }
            else{
                for (int j = col-1; j >= 0; j--) {
                    System.out.print(arr[i][j] +" ");
                }
            }
            System.out.println();
        }
    }
}

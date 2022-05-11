import java.util.Scanner;
public class Task1
{
    public static void main(String[] args){

        int arr[][] = new int[10][10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0;i < 10;i++) {
            for (int j = 0;j< 10;j++) {
                arr[i][j] = (i+1) * (j+1);
            }
        }

        for (int i = 0;i < 10;i++) {
            for (int j = 0;j< 10;j++) {
                System.out.println(arr[i][0] + " * " + arr[0][j] + " = " + arr[i][j]);
            }
        }

    }
}

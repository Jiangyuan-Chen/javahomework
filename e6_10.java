import java.util.Random;
import java.util.Scanner;

public class e6_10 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt(); // 读取矩阵的n值
        printMatrix(n);
    }

    public static void printMatrix(int n){
        Random r = new Random();
        String s = "";

        //打印矩阵
        for (int i = 0; i < n; i++){          //打印行
            for (int j = 0; j < n; j++){      //打印列
                s = r.nextInt(2) + " ";       //打印分量
                if (j != n-1)
                    System.out.print(s);
                else                          //当打印到末尾时换行
                    System.out.println(s);
            }

        }
    }
}

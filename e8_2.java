import java.util.Scanner;

public class e8_2 {
    public static void main(String[] arg){
        double[][] m = new double[4][4];

        //输入4x4的矩阵
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);

        //给每个矩阵内的元素赋值
        for (int i = 0; i < m.length; i++){
            for (int j = 0; j < m[i].length; j++){
                m[i][j] = input.nextDouble();
            }
        }

        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(m));
    }

    //计算主对角线的元素之和
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0; //创建sum记录主对角线元素的总和

        //取每行主对角线的元素相加
        for (int i = 0; i < m.length; i++)
            sum += m[i][i];

        return sum; //返回主对角线元素的总和的值
    }


}

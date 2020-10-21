import java.util.Scanner;

public class e7_10 {
    public static void main(String[] arg){
        //创建一个存放用户输入数字的数组
        double[] array = new double[10];

        //输入要比较的数的数组
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.printf("请输入第" + (i+1) + "个数：");
            array[i] = input.nextDouble();
        }

        //输出最小元素的下标值
        System.out.println("\n" + "最小元素的下标值为" + indexOfSmallestElement(array));
    }

    //获取最小数的下标
    public static int indexOfSmallestElement(double[] array){
        double min = array[0];  //创建存放最小值的变量min并将数组第一个数存入
        int index = 0;  //创建存放最小数下标的变量

        //获取最小数下标
        for (int i = 1; i < array.length; i++){
            //当遍历到的数比最小值还小的时候将其赋值给min
            if (array[i] < min){
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}

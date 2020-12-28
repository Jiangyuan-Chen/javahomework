public class e7_7 {
    public static void main(String[] arg){
        //声明并创造一个数据
        int[] number = createArray();
        System.out.println("随机生成的100个整数为：");
        displayArray(number);
        int[] counts = countNumbers(number);
        System.out.println();
        System.out.println("每个整数出现的次数为：");
        displayCounts(counts);
    }

    //创建一个整形数组
    public static int[] createArray(){
        int[] number = new int[100];
        for (int i = 0; i < number.length; i++)
            number[i] = (int)(Math.random() * 10);
        return number;
    }

    //展示数组
    public static void displayArray(int[] number){
        for (int i = 0; i < number.length; i++){
            if ((i + 1) % 10 == 0)
                System.out.println(number[i]);
            else
                System.out.print(number[i] + "");
        }
    }

    //计算每个数字出现的次数
    public static int[] countNumbers(int[] number){
        int[] counts = new int[10];
        for (int i = 0; i < number.length; i++)
            counts[number[i]]++;
        return counts;
    }

    //展示计算次数
    public static void displayCounts(int[] counts){
        for (int i = 0; i < counts.length; i++)
                System.out.println(i + ": " + counts[i]);
    }
}

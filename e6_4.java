import java.util.Scanner;

public class e6_4 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入待反转的整数：");
        int number = input.nextInt(); //记录待反转的整数
        reverse(number);
    }

    public static void reverse(int number) {
        String s = "";
        int reverseNumber = 0;
        while (number != 0) {
            //取待反转整数的最后一位数
            int a = number % 10;

            //判断反转后是否溢出
            if (reverseNumber > Integer.MAX_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && a > 7)) {
                s = reverseNumber + "" + a;
                System.out.println(s);
                return;
            }
            if (reverseNumber < Integer.MIN_VALUE / 10 || (reverseNumber == Integer.MAX_VALUE / 10 && a < -8)) {
                int _reverseNumber = -reverseNumber;
                s = "-" + _reverseNumber + -a;
                System.out.println(s);
                return;
            }

            //将取到的最后一位数放入最后
            reverseNumber = 10 * reverseNumber + a;
            //总数减少一位
            number /= 10;
        }
        System.out.println(reverseNumber);

    }
}
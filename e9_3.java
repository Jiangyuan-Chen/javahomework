import java.util.Date;
public class e9_3 {
    public static void main(String[] args) {
        long time = 10000;//创建l记录最新的流逝时间
        Date date = new Date(time);//新建对象
        System.out.println(time + ": " + date.toString());//打印时间
        time *= 10;

        //通过循环设置新的流逝时间并显示日期
        for(int i = 0; i < 7; i++) {
            date.setTime(time);
            System.out.println(time + ": " + date.toString());
            time *= 10;
        }
    }
}
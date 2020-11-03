import java.util.ArrayList;

public class e13_3 {
    public static void main(String[] args){
        ArrayList<Number> list = new ArrayList<>();// 创建存储数字的对象

        // 存放数字
        list.add(44);
        list.add(2.2);
        list.add(3.2);
        list.add(23.2);
        list.add(24);

        sort(list);// 排序元素

        // 打印类
        for (Number number : list)
            System.out.println(number);

    }

    public static void sort(ArrayList<Number> list){
        // 判断对象是否为空
        if (list == null || list.size() == 0)
            return;

        // 从头开始循环交换数字
        for (int i = 0; i < list.size() - 1; i++){
            //判断相邻两个数后者是否小于前者
            if (list.get(i).doubleValue() > list.get(i+1).doubleValue()) {
                double tem = list.get(i).doubleValue();// 创建临时变量存放较小的数
                // 交换数字
                list.set(i, list.get(i+1).doubleValue());
                list.set(i+1, tem);
            }
        }
    }
}



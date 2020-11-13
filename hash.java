import java.util.ArrayList;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Scanner;

public class hash{
    public static void main(String[] args){
        try {
            MessageDigest complete = MessageDigest.getInstance("SHA-1");    // 新建一个SHA-1对象

            // 获得被哈希的目录
            Scanner input = new Scanner(System.in);
            System.out.print("请输入要哈希的目录：");
            String dir = input.next();

            dfs(dir, complete);

            System.out.println("---------------------------------------");

            byte[] sha1 = complete.digest();

            String result = "";

            for (int i = 0; i < sha1.length; i++) {
                result += Integer.toString(sha1[i], 16);
            }
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 取出文件的内容并更新哈希值
    public static void SHA1Checksum(InputStream is, MessageDigest complete) throws Exception {
        byte[] buffer = new byte[1024]; // 用于计算哈希值的文件缓冲区
        int numRead = 0;

        do {
            numRead = is.read(buffer);  // 读处numRead的字节到buffer中

            if (numRead > 0)
                complete.update(buffer, 0, numRead);    // 根据buff中的内容更新哈希值
        } while (numRead != -1);

        is.close();
    }

    // 文件夹的深度遍历并取出每个文件的内容
    public static void dfs(String path, MessageDigest complete) throws Exception {
        File dir = new File(path);
        File[] fs = dir.listFiles();
        for(int i = 0; i < fs.length; i++) {
            if(fs[i].isFile()) {
                System.out.println("file " + fs[i].getName());
                SHA1Checksum(new FileInputStream(fs[i]), complete);
            }
            if(fs[i].isDirectory()) {
                System.out.println("directory " + fs[i].getName());
                dfs(path + File.separator + fs[i].getName(), complete);
            }
        }
    }
}



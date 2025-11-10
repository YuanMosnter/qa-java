package exection;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class TestException {
    public static void main(String[] args) {
        System.out.println("开始模拟请求");
        String s = null;
        try {
            // 不catch也能编译，但运行崩 - 演示Unchecked
            System.out.println(s.length());  // 抛NPE
        } catch (NullPointerException e) {  // 可选：本地消化
            System.out.println("Catch NPE: " + e.getMessage() + " - 在测试框架中，可重试或默认值");
            // 扩展：e.printStackTrace(); // 打印栈，debug用
        }  // 无finally，资源自动管

        System.out.println("\n=== Checked: IOException (必须处理) ===");

        try {
            FileInputStream fis = new FileInputStream("nonexistent.txt");
            System.out.println("读取文件成功");
        } catch (FileNotFoundException e) {
            //如果文件不存在异常

            System.out.println("Catch IOException: 文件不存在 - " + e.getMessage() + "，测试开发中：日志+跳过或用默认数据");
        }finally {
            System.out.println("必须释放资源");
        }
// 场景3: 用throws上抛 (方法签名加throws，传给main上层)
        try {
            readFileWithThrows();  // 调用，main会catch或运行崩
        } catch (FileNotFoundException e) {
            System.out.println("Catch IOException: 文件不存在 - " + e.getMessage() + "，测试开发中：日志+跳过或用默认数据");
        }

    }       static void readFileWithThrows() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("nonexistent.txt");  // 编译通过，但运行抛
    }

}
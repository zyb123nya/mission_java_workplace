package mission;
import java.util.Scanner;
public class mission9 {//自定义方法判段两个字符串大小
	//我觉得这个也不需要写注释了吧(doge)
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入第一个字符串");
		String a = in.next();
		System.out.println("请输入第二个字符串");
		String b = in.next();
		System.out.println("String a:"+a);
		System.out.println("String b:"+b);
		if(a.equals(b)) {
			a = b.concat(b);
			System.out.println("两个字符串大小相等，开始合并");
			System.out.println("sum:"+a);
		}

	}
}

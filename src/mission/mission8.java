package mission;
import java.util.Scanner;
public class mission8 {//自定义
	public static void main(String[]args) {
		//导入数据
		Scanner n = new Scanner(System.in);
		System.out.println("请输入9个数据");
		int arry2[][]= new int[3][3];
		for(int i=0;i<arry2.length;i++) {
			for(int j=0;j<arry2.length;j++) {
				arry2[i][j]= n.nextInt();
			}
		}
		//对角线
//		这个数 * *
//		* 这个数 *
//		* * 这个数
		int a = 0;
		int b = 0;
		for(int i=0;i<arry2.length;i++) {
			a+=arry2[i][i];
		}
		int c = 0;
		//对角线
//		* * 这个数
//		* 这个数 *
//		这个数 * *
		for(int i=2;i>=0;i--) {
			b+=arry2[c][i];
			c++;
		}
		//对角线相加
		int sum=a+b;
		System.out.println("对角线的和为:"+sum);
		
		
	}
}

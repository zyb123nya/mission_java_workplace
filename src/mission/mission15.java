package mission;

public class mission15 {
	public static int jiecheng(int n) {
		if(n==1) {
			return 1;
		}//结束条件
		return n*jiecheng(n-1);//操作
	}
	public static void main(String[] args) {
		int i = jiecheng(34);
		System.out.println(i);//赋值输出，最大值为34
	}
}

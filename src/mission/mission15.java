package mission;

public class mission15 {
	public static int jiecheng(int n) {
		if(n==1) {
			return 1;
		}//��������
		return n*jiecheng(n-1);//����
	}
	public static void main(String[] args) {
		int i = jiecheng(34);
		System.out.println(i);//��ֵ��������ֵΪ34
	}
}

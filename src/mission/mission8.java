package mission;
import java.util.Scanner;
public class mission8 {//�Զ���
	public static void main(String[]args) {
		//��������
		Scanner n = new Scanner(System.in);
		System.out.println("������9������");
		int arry2[][]= new int[3][3];
		for(int i=0;i<arry2.length;i++) {
			for(int j=0;j<arry2.length;j++) {
				arry2[i][j]= n.nextInt();
			}
		}
		//�Խ���
//		����� * *
//		* ����� *
//		* * �����
		int a = 0;
		int b = 0;
		for(int i=0;i<arry2.length;i++) {
			a+=arry2[i][i];
		}
		int c = 0;
		//�Խ���
//		* * �����
//		* ����� *
//		����� * *
		for(int i=2;i>=0;i--) {
			b+=arry2[c][i];
			c++;
		}
		//�Խ������
		int sum=a+b;
		System.out.println("�Խ��ߵĺ�Ϊ:"+sum);
		
		
	}
}

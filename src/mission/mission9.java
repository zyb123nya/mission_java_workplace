package mission;
import java.util.Scanner;
public class mission9 {//�Զ��巽���ж������ַ�����С
	//�Ҿ������Ҳ����Ҫдע���˰�(doge)
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		System.out.println("�������һ���ַ���");
		String a = in.next();
		System.out.println("������ڶ����ַ���");
		String b = in.next();
		System.out.println("String a:"+a);
		System.out.println("String b:"+b);
		if(a.equals(b)) {
			a = b.concat(b);
			System.out.println("�����ַ�����С��ȣ���ʼ�ϲ�");
			System.out.println("sum:"+a);
		}

	}
}

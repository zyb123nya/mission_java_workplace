package mission;
import java.util.Scanner;
public class mission10 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		System.out.println("�������һ�����ķ���:");
		int a = in.nextInt();
		System.out.println("�������һ�����ķ�ĸ:");
		int a_end = in.nextInt();
		System.out.println("������ڶ������ķ���:");
		int b = in.nextInt();
		System.out.println("������ڶ������ķ�ĸ:");
		int b_end =in.nextInt();
		if(a==0||a_end==0||b==0||b_end==0) {
		System.out.println("�벻Ҫ����0!");//������һ������0�����
		System.exit(0);
		}

		//������ͬ�ȷ�ĸ����ĸԽС��Խ��

		
		if(a==b&&a_end<b_end) {
			System.out.println(a+"/"+a_end);
		}
		else if(a==b&&a_end>b_end){
			System.out.println(b+"/"+b_end);
		}
		//��ĸ��ͬ�ȷ��ӣ�����Խ����Խ��
		if(a_end==b_end&&a>b) {
			System.out.println(a+"/"+a_end);
		}
		else if(a_end==b_end&&a<b)
		{
			System.out.println(b+"/"+b_end);
		}
		
		//��ͬ����£�ͨ��
		
		
		if(a!=b&&a_end!=b_end) {
			int mixa = a * b_end;
			int mixb = b * a_end;
			int mix_end = a_end * b_end;
			if(mixa>mixb) {
				System.out.println(mixa+"/"+mix_end);
			}
			else if(mixa<mixb)
			{
				System.out.println(mixb+"/"+mix_end);
			}
		}
		

	}
}
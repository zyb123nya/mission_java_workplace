package mission;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class Mission14 {
	//����ⷨ�Ƚϱ���û�뵽ʲô�÷���
	public static void main(String[]args) {
		Scanner n = new Scanner(System.in);
		int year;//��
		int month;//��
		int day = 0;//��
		int days;//���������
		int d=0;//������
		int e=0;//��ѭ�����õ�
		//�ø�do-whileѭ����ִ�����жϣ�
		do
		{
			System.out.println("������ĳ��:");
			year = n.nextInt();
			System.out.println("������ĳ��:");
			month = n.nextInt();
			System.out.println("������ĳ��:");
			days = n.nextInt();
			
		}
		while(e==1);
		for(int i=1;i<month;i++) {//forѭ��Ƕ��switchѡ����һ�꣬��������һ��31��ģ�30��ģ�29��ĺ�28���
			switch(i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:{
					day = 31;
					break;
				}
				case 4:
				case 6:
				case 9:
				case 11:{
					day = 30;
					break;
				}
				case 2://���·ݵ���������һ��
					{
					if((year % 100 !=0 && year % 4 == 0)|| (year % 100 == 0 && year%400==0)) 
					//�����ж�����
					{
						day = 29;
					}else
					{
						day = 28;
					}
				}
				default:
				break;
			}
			d+=day;//����첢��d���㣬��ֵ��d
		}
		System.out.println("����"+year+"���"+(d+days)+"��");
	}
}

package mission;
import java.util.Scanner;



class calc{
	double jia;
	double jian;
	double cheng;
	double chu;
	double num1;
	double num2;
	public void shownumber(){

		System.out.println("�ӷ����Ϊ:"+jia);
		System.out.println("�������Ϊ:"+jian);
		System.out.println("�˷����Ϊ:"+cheng);
		if(num2==0) {
			System.out.println("��������Ϊ0!");
		}else {
			System.out.println("�������Ϊ:"+chu);
		}
		
	}
}
public class Mission20 {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		calc suan = new calc();
		try{
		System.out.println("�������һ������");
		suan.num1=in.nextDouble();
		System.out.println("������ڶ�������");
		suan.num2=in.nextDouble();
		suan.jia=suan.num1+suan.num2;
		suan.jian=suan.num1-suan.num2;
		suan.cheng=suan.num1*suan.num2;
		suan.chu=suan.num1/suan.num2;
		System.out.println("������Ϊ:");
		suan.shownumber();
		}
		catch(Exception e) {
			System.out.println("����������!");

		}
	
		
		
	}

	}


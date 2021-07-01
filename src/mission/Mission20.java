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

		System.out.println("加法结果为:"+jia);
		System.out.println("减法结果为:"+jian);
		System.out.println("乘法结果为:"+cheng);
		if(num2==0) {
			System.out.println("除数不能为0!");
		}else {
			System.out.println("除法结果为:"+chu);
		}
		
	}
}
public class Mission20 {

	
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		calc suan = new calc();
		try{
		System.out.println("请输入第一个数：");
		suan.num1=in.nextDouble();
		System.out.println("请输入第二个数：");
		suan.num2=in.nextDouble();
		suan.jia=suan.num1+suan.num2;
		suan.jian=suan.num1-suan.num2;
		suan.cheng=suan.num1*suan.num2;
		suan.chu=suan.num1/suan.num2;
		System.out.println("运算结果为:");
		suan.shownumber();
		}
		catch(Exception e) {
			System.out.println("请输入数字!");

		}
	
		
		
	}

	}


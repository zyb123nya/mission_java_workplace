package mission;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.IOException;
public class Mission14 {
	//这题解法比较笨，没想到什么好方法
	public static void main(String[]args) {
		Scanner n = new Scanner(System.in);
		int year;//年
		int month;//月
		int day = 0;//日
		int days;//输入的日子
		int d=0;//俩变量
		int e=0;//给循环体用的
		//用个do-while循环先执行在判断；
		do
		{
			System.out.println("请输入某年:");
			year = n.nextInt();
			System.out.println("请输入某月:");
			month = n.nextInt();
			System.out.println("请输入某日:");
			days = n.nextInt();
			
		}
		while(e==1);
		for(int i=1;i<month;i++) {//for循环嵌套switch选择哪一年，单独列了一个31天的，30天的，29天的和28天的
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
				case 2://二月份单独拉出来一下
					{
					if((year % 100 !=0 && year % 4 == 0)|| (year % 100 == 0 && year%400==0)) 
					//闰年判断条件
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
			d+=day;//输出天并与d计算，赋值给d
		}
		System.out.println("这是"+year+"年的"+(d+days)+"天");
	}
}

package mission;
//Monday Tuesday Wednesday Thursday Friday Saturday Sunday
//我觉得不用写注释这么多中文也该看得懂吧（doge）
import java.util.Scanner;

import javax.swing.JOptionPane;
public class mission7 {
	public static void main(String[]args) {
		Scanner n = new Scanner(System.in);
		String s1;
		String s2;
		System.out.println("请输入星期英文首字母：");
		s1=n.next();
		if(s1.equals("M")||s1.equals("m")){
			System.out.println("Monday");
		}
		else if(s1.equals("W")||s1.equals("w"))
		{
			System.out.println("Wednesday");
			}
		else if(s1.equals("F")||s1.equals("f")){	
			System.out.println("Friday");
		}
		else if(s1.equals("T")||s1.equals("t")){
				System.out.println("请输入第二个字母");
				s2=n.next();
				if(s2.equals("U")||s2.equals("u")) {
				System.out.println("Tuesday");
			}
			else if(s2.equals("H")||s2.equals("h")) {
				System.out.println("Thursday");
			}
		}
		else if(s1.equals("S")||s1.equals("s")){
				System.out.println("请输入第二个字母");
				s2=n.next();
			if(s2.equals("A")||s2.equals("a")) {
				System.out.println("Saturday");
			}
			else if(s2.equals("U")||s2.equals("u")) {
				System.out.println("Sunday");
			}
		}
	}
}

package mission;
import java.util.Scanner;
public class mission10 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);

		System.out.println("请输入第一个数的分子:");
		int a = in.nextInt();
		System.out.println("请输入第一个数的分母:");
		int a_end = in.nextInt();
		System.out.println("请输入第二个数的分子:");
		int b = in.nextInt();
		System.out.println("请输入第二个数的分母:");
		int b_end =in.nextInt();
		if(a==0||a_end==0||b==0||b_end==0) {
		System.out.println("请不要输入0!");//处理了一下输入0的情况
		System.exit(0);
		}

		//分子相同比分母，分母越小数越大

		
		if(a==b&&a_end<b_end) {
			System.out.println(a+"/"+a_end);
		}
		else if(a==b&&a_end>b_end){
			System.out.println(b+"/"+b_end);
		}
		//分母相同比分子，分子越大数越大
		if(a_end==b_end&&a>b) {
			System.out.println(a+"/"+a_end);
		}
		else if(a_end==b_end&&a<b)
		{
			System.out.println(b+"/"+b_end);
		}
		
		//不同情况下，通分
		
		
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
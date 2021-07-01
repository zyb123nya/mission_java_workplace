package mission;
import java.util.Scanner;
class guest{
	int age;
	int price;
	public void setAge(int age) {
		this.age=age;
	}
	public void ticket(){
		if(age>0&&age<12) {
			price=20;
		}
		if(age<18) {
			price=35;
		}
		if(age>=18) {
			price=50;
		}
		System.out.println("门票价格:"+price);
	}
}
public class Mission24 {
	public static void main(String[]args) {
		guest p = new guest();
		Scanner n = new Scanner(System.in);
		System.out.println("请输入你的年龄：");
		p.setAge(n.nextInt());
		p.ticket();
	}
	
}

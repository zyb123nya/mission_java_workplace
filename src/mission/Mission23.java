package mission;
import java.util.Scanner;
class register{
String name;
String password;
String newpassword;

public void generate(){
	Scanner in = new Scanner(System.in);
	System.out.println("�������û���,�������֤����");
	System.out.print("�û���:");
	name = in.next();
	System.out.print("����:");
	password = in.next();
	System.out.print("��֤����:");
	newpassword=in.next();
	while(name.length()<3||password.length()<6||password.equals(newpassword)==false) 
	{
		if(name.length()<3) 
		{
			System.out.println("�û������Ȳ�С��3");
		}
		if(password.equals(newpassword)==false)
		{
			System.out.println("�����������벻һ��");
		}
		if(password.length()<6) {
			System.out.println("���벻��С��6λ");
		}
		System.out.println("\n"+"����������");
		System.out.print("�û���:");
		name = in.next();
		System.out.print("����:");
		password = in.next();
		System.out.print("��֤����:");
		newpassword=in.next();
	}
	System.out.println("��Աע��ɹ�!");
}
}
public class Mission23{
	public static void main(String[] args) {
		register m = new register();
		m.generate();
	}
}

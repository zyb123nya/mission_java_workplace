package mission;
import java.util.Scanner;
class register{
String name;
String password;
String newpassword;

public void generate(){
	Scanner in = new Scanner(System.in);
	System.out.println("请输入用户名,密码和验证密码");
	System.out.print("用户名:");
	name = in.next();
	System.out.print("密码:");
	password = in.next();
	System.out.print("验证密码:");
	newpassword=in.next();
	while(name.length()<3||password.length()<6||password.equals(newpassword)==false) 
	{
		if(name.length()<3) 
		{
			System.out.println("用户名长度不小于3");
		}
		if(password.equals(newpassword)==false)
		{
			System.out.println("两次输入密码不一样");
		}
		if(password.length()<6) {
			System.out.println("密码不能小于6位");
		}
		System.out.println("\n"+"请重新输入");
		System.out.print("用户名:");
		name = in.next();
		System.out.print("密码:");
		password = in.next();
		System.out.print("验证密码:");
		newpassword=in.next();
	}
	System.out.println("会员注册成功!");
}
}
public class Mission23{
	public static void main(String[] args) {
		register m = new register();
		m.generate();
	}
}

package mission;
import java.util.Scanner;
public class Mission19{
	public static void main(String[]args) {
		 String s1 = null,s2 = null;
		String sString;
		float sfloat =0;
	       Scanner strin=new  Scanner(System.in);
	       
	       try {
	    	   System.out.print ("输入第一个字符串：" );
	           s1= strin.next();
	           System.out.print ("输入第二个字符串：" );
	           s2= strin.next();
	           sfloat = Float.valueOf(s1).floatValue()+Float.valueOf(s2).floatValue();
	           sString = s1+s2;
	            int sint;
	            sint =(int)sfloat;

	       System.out.println ("输入的二个字符串拼接结果为："+sString );
	       System.out.println ("输入字符串转换为整数相加结果为："+sint );
	       System.out.println ("输入字符串转换为浮点数相加结果为："+sfloat );	       
	       }catch(Exception e) {
		    	System.out.println("输入的不是数字，请重新输入！");

		    }
	       }
	       	
}
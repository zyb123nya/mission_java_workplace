package mission;
import java.util.Scanner;
public class Mission19{
	public static void main(String[]args) {
		 String s1 = null,s2 = null;
		String sString;
		float sfloat =0;
	       Scanner strin=new  Scanner(System.in);
	       
	       try {
	    	   System.out.print ("�����һ���ַ�����" );
	           s1= strin.next();
	           System.out.print ("����ڶ����ַ�����" );
	           s2= strin.next();
	           sfloat = Float.valueOf(s1).floatValue()+Float.valueOf(s2).floatValue();
	           sString = s1+s2;
	            int sint;
	            sint =(int)sfloat;

	       System.out.println ("����Ķ����ַ���ƴ�ӽ��Ϊ��"+sString );
	       System.out.println ("�����ַ���ת��Ϊ������ӽ��Ϊ��"+sint );
	       System.out.println ("�����ַ���ת��Ϊ��������ӽ��Ϊ��"+sfloat );	       
	       }catch(Exception e) {
		    	System.out.println("����Ĳ������֣����������룡");

		    }
	       }
	       	
}
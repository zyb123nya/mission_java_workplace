package mission;

import java.util.TreeSet;

public class Mission18 {
	public static void main(String[]args) {
	//һ�ּ��ϵ�д�������ַ�������ASCII�룩��ӽ����Ͻ������򣻱���Ϊ��������������
	//{-1,0,9}{3,4,6}{2,5,7}->{-1,0,3,4,6,9}{2,5,7}->{-1,0,2,3,4,5,6,7,9}
	TreeSet<String> ts = new TreeSet<String>();  
	//������5����������ʵҲ����scanner����һ�£��������ASCII��
	ts.add("r");//114
	ts.add("e"); //101
	ts.add("a");  //97
	ts.add("d");//100
	ts.add("y");  //121
	System.out.println(ts);  
	//��ʵҲ������ð���ţ��Ƚ��ַ���ת��Ϊ������Ȼ���ӽ����飻
//	��һ��LeetCode��Դ�루�ַ���ת��������
//    public int myAtoi(String str) {
//        int len = str.length();
//        char[] charArray = str.toCharArray();//ת��Ϊ�ַ�����
//		�����һ���ǿո�
//        int index = 0;
//        while (index < len && charArray[index] == ' ') {
//            index++;
//        }
//		������Ӧ�ò�������ô��ո�ɣ����˵Ļ�Ҳû�£�����
//        if (index == len) {
//            return 0;
//        }
//
//        //�ж���������
//        int sign = 1;//��һ���ַ�
//        char firstChar = charArray[index];
//        if (firstChar == '+') {
//            index++;
//        } else if (firstChar == '-') {
//            index++;
//            sign = -1;
//        }
//
//        
	}
}

package mission;

import java.util.TreeSet;

public class Mission18 {
	public static void main(String[]args) {
	//一种集合的写法，将字符串（以ASCII码）添加进集合进行排序；本质为二叉树遍历排序；
	//{-1,0,9}{3,4,6}{2,5,7}->{-1,0,3,4,6,9}{2,5,7}->{-1,0,2,3,4,5,6,7,9}
	TreeSet<String> ts = new TreeSet<String>();  
	//随便加了5个，这里其实也可以scanner活用一下，下面的是ASCII码
	ts.add("r");//114
	ts.add("e"); //101
	ts.add("a");  //97
	ts.add("d");//100
	ts.add("y");  //121
	System.out.println(ts);  
	//其实也可以用冒泡排，先将字符串转化为整数，然后扔进数组；
//	放一下LeetCode的源码（字符串转整数）：
//    public int myAtoi(String str) {
//        int len = str.length();
//        char[] charArray = str.toCharArray();//转化为字符数组
//		如果第一个是空格
//        int index = 0;
//        while (index < len && charArray[index] == ' ') {
//            index++;
//        }
//		正经人应该不会敲那么多空格吧，敲了的话也没事，如下
//        if (index == len) {
//            return 0;
//        }
//
//        //判段正负符号
//        int sign = 1;//第一个字符
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

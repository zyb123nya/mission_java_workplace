package mission;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Student{
	String sNO;
	String sname;
	String sSex;
	int sAge;
	int sJava;
	public Student(String id,String name,String sex,int age,int java){
		sNO=id;
		sname=name;
		sSex=sex;
		sAge=age;
		sJava=java;
		
	}
	public void getNo() {
		System.out.println("学号:"+sNO);
	}
	public void getName() {
		System.out.println("姓名:"+sname);
	}
	public void getSex() {
		System.out.println("姓别:"+sSex);
	}
	public void getAge() {
		System.out.println("年龄:"+sAge);
	}
	public void getJava() {
		System.out.println("java课程成绩:"+sJava);
	}
}
public class Mission22 {
	public static void main(String[]args) {
		Student s1 = new Student("1", "甲", "男", 20, 90);
		Student s2 = new Student("2", "乙", "女", 22, 88);
		Student s3 = new Student("3", "丙", "男", 21, 95);
		Student s4 = new Student("4", "丁", "女", 22, 100);
		Student s5 = new Student("5", "戊", "男", 23, 66);

		//list是个列表，列表添加好后实例化+遍历输出
		List<Student> list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for(int i=0;i<list.size();i++) {
			System.out.println("姓名:"+list.get(i).sname+"学号:"+list.get(i).sNO+"性别:"+list.get(i).sSex+"年龄:"+list.get(i).sAge+"java课程成绩:"+list.get(i).sJava);
		}
		//取一下java成绩，构造一个新的空 set，该 set 根据其元素的自然顺序进行排序;
		TreeSet<Integer> set =new TreeSet();
		for(int i=0;i<list.size();i++) {
			set.add(list.get(i).sJava);
		}
		//最大最小值选里面的首尾
		int max = set.last();
		int min = set.first();
		double a=0;
		for(int i = 0;i<list.size();i++) {
			
			a=a+list.get(i).sJava;
		}
		//但是不想写死，所以用的list长度
		double avg = a/list.size();
		System.out.println("学生的平均java成绩:"+avg);
		System.out.println("最大值为:"+max+"最小值为:"+min);
		
	}
}

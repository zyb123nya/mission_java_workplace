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
		System.out.println("ѧ��:"+sNO);
	}
	public void getName() {
		System.out.println("����:"+sname);
	}
	public void getSex() {
		System.out.println("�ձ�:"+sSex);
	}
	public void getAge() {
		System.out.println("����:"+sAge);
	}
	public void getJava() {
		System.out.println("java�γ̳ɼ�:"+sJava);
	}
}
public class Mission22 {
	public static void main(String[]args) {
		Student s1 = new Student("1", "��", "��", 20, 90);
		Student s2 = new Student("2", "��", "Ů", 22, 88);
		Student s3 = new Student("3", "��", "��", 21, 95);
		Student s4 = new Student("4", "��", "Ů", 22, 100);
		Student s5 = new Student("5", "��", "��", 23, 66);

		//list�Ǹ��б��б���Ӻú�ʵ����+�������
		List<Student> list = new ArrayList();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);

		for(int i=0;i<list.size();i++) {
			System.out.println("����:"+list.get(i).sname+"ѧ��:"+list.get(i).sNO+"�Ա�:"+list.get(i).sSex+"����:"+list.get(i).sAge+"java�γ̳ɼ�:"+list.get(i).sJava);
		}
		//ȡһ��java�ɼ�������һ���µĿ� set���� set ������Ԫ�ص���Ȼ˳���������;
		TreeSet<Integer> set =new TreeSet();
		for(int i=0;i<list.size();i++) {
			set.add(list.get(i).sJava);
		}
		//�����Сֵѡ�������β
		int max = set.last();
		int min = set.first();
		double a=0;
		for(int i = 0;i<list.size();i++) {
			
			a=a+list.get(i).sJava;
		}
		//���ǲ���д���������õ�list����
		double avg = a/list.size();
		System.out.println("ѧ����ƽ��java�ɼ�:"+avg);
		System.out.println("���ֵΪ:"+max+"��СֵΪ:"+min);
		
	}
}

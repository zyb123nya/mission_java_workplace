package mission;

public class Mission1 {
	public static void main(String[]args) {
		int index = 0 ;//��0��ʼѭ��
		while(index<=99)
		{
			index+=10;//ÿ�μ�10
			if(index==40)//�ų�40
				continue;//����ѭ��
			System.out.println("����Ϊ"+""+index);//ÿѭ��һ��"10�ı���"���һ��
		}
	}
}

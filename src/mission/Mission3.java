package mission;
public class Mission3 {
	public static void main(String[]args) {
	double sum = 0;
	int arry[]= {0,2,1,3,5,4,6,7,9,10};//һάint����
	int min =arry[0];//��ʼ�����飬��ֵ��min
	int max =arry[0];//ͬ�ϣ���ֵ��max
	for(int i=0;i<arry.length;i++) {//�������飬Ѱ���������ֵ����Сֵ
		sum += i;//��������Ȼ���������
		if(max < arry[i]) 
		{
			max = arry[i];
		}
		if(min > arry[i]) 
		{
			min = arry[i];
		}
	}
	//�������
	System.out.println("max:"+max);
	System.out.println("min:"+min);
	System.out.println("avg:"+sum/10.0);//��ͺ��10.0(int),���Ըĳɻ��
	System.out.println("sum:"+sum);
	
	}

	}


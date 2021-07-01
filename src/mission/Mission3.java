package mission;
public class Mission3 {
	public static void main(String[]args) {
	double sum = 0;
	int arry[]= {0,2,1,3,5,4,6,7,9,10};//一维int数组
	int min =arry[0];//初始化数组，赋值给min
	int max =arry[0];//同上，赋值给max
	for(int i=0;i<arry.length;i++) {//遍历数组，寻找数组最大值和最小值
		sum += i;//遍历数组然后求数组和
		if(max < arry[i]) 
		{
			max = arry[i];
		}
		if(min > arry[i]) 
		{
			min = arry[i];
		}
	}
	//输出部分
	System.out.println("max:"+max);
	System.out.println("min:"+min);
	System.out.println("avg:"+sum/10.0);//求和后除10.0(int),可以改成活的
	System.out.println("sum:"+sum);
	
	}

	}


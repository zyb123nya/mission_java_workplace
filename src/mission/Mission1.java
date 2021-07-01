package mission;

public class Mission1 {
	public static void main(String[]args) {
		int index = 0 ;//从0开始循环
		while(index<=99)
		{
			index+=10;//每次加10
			if(index==40)//排除40
				continue;//继续循环
			System.out.println("数据为"+""+index);//每循环一次"10的倍数"输出一次
		}
	}
}

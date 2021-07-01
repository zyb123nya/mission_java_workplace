package mission;

public class mission2 {
	public static void main(String[]args) {
	int i,j,k;//设置3个数据类型为int的变量，及公鸡，母鸡，小鸡
	System.out.println("公 母 小");//输出“买鸡列表（物理意义上的）”
	for(i=0;i<=20;i++) {
		//外层循环买的公鸡（指公鸡数量不大于20，因为20（公鸡数量）*5=100，等于总钱数，若大于则钱不够。
		for(j=0;j<=33;j++) 
		{//内层循环买的母鸡（理由同公鸡，33*3=99<100，33为最大值。
			k=100-i-j;//总价钱-买的公鸡-买的母鸡
			if(5*i+3*j+k/3.0==100){//判段是否满足了100块钱
				System.out.println(" "+i+" "+j+" "+k);//输出一种方案
		}
		}
	}
	}
}
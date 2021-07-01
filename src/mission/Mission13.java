package mission;

public class Mission13 {
	public static void main(String[]args) {
		int i,j,k;//三位数
		for(i=1;i<5;i++) {//第一位
			for(j=1;j<5;j++) {//第二位
				for(k=1;k<5;k++) {//第三位
					if(i!=k&&j!=k&&i!=j) {//如果这三位值不一样
						System.out.print(i*100+j*10+k+" ");//输出这个值
					}
				}
				
			}
			System.out.println();//第一位的一个数排完后换行
		}

	}

}

package mission;

public class mission6 {//书里有，我抄的书（doge）
	public static void main(String[]args) {
		int tri[][]=new int [5][];//二维数组分配空间
		for(int i=0;i<tri.length;i++) {
			tri[i]= new int[i+1];//复制给第二排的数
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)//当两边和对角线时
				{
					tri[i][j]=1;//两边为1
				}else
				{
					tri[i][j]=tri[i-1][j]+tri[i-1][j-1];//二维数组每个数是上面两个数之和
				}
				System.out.print(tri[i][j]);//输出
			}
		System.out.println();//换行
	}
}
}
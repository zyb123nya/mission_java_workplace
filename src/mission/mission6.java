package mission;

public class mission6 {//�����У��ҳ����飨doge��
	public static void main(String[]args) {
		int tri[][]=new int [5][];//��ά�������ռ�
		for(int i=0;i<tri.length;i++) {
			tri[i]= new int[i+1];//���Ƹ��ڶ��ŵ���
			for(int j=0;j<=i;j++)
			{
				if(j==0||j==i)//�����ߺͶԽ���ʱ
				{
					tri[i][j]=1;//����Ϊ1
				}else
				{
					tri[i][j]=tri[i-1][j]+tri[i-1][j-1];//��ά����ÿ����������������֮��
				}
				System.out.print(tri[i][j]);//���
			}
		System.out.println();//����
	}
}
}
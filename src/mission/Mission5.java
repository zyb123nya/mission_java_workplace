package mission;
//矩阵转置->把5*5的矩阵旋转90°
public class Mission5 {
	public static void main(String[]args) {
		int mat1[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		//自定义矩阵->二维数组，5*5
		int mat2[][]=new int[5][5];//对二位数组分配空间
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				mat2[j][i]=mat1[i][j];//把第一个矩阵的数行变列，赋值到第二个上去
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		//以上打印原矩阵，以下打印改变后矩阵，我是分割线
		System.out.println("************after do that:");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
	}
}

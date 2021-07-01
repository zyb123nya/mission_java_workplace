package mission;
//书上有，原理是循环的嵌套分别控制行和列
public class Mission12 {
	public static void main(String[]args) {
		//新建二维数组，分配空间
	 int chengfabiao[][]= new int[9][];
	 //i每次+1即列+1
	 for(int i=0;i<chengfabiao.length;i++) {
		 chengfabiao[i]=new int[i+1];
	 }
	 //乘出来的数，直到对角线
	 for(int i=0;i<chengfabiao.length;i++)
	 {
		 for(int j=0;j<chengfabiao[i].length;j++) {
			 chengfabiao[i][j]=(i+1)*(j+1);
		 }
	 }
	 //输出乘法表
	 for(int i=0;i<chengfabiao.length;i++) {
		 for(int j=0;j<chengfabiao[i].length;j++) {
			 System.out.print("\t"+chengfabiao[i][j]);
		 }
		 System.out.println();
	 }
 }
}

package mission;
//�����У�ԭ����ѭ����Ƕ�׷ֱ�����к���
public class Mission12 {
	public static void main(String[]args) {
		//�½���ά���飬����ռ�
	 int chengfabiao[][]= new int[9][];
	 //iÿ��+1����+1
	 for(int i=0;i<chengfabiao.length;i++) {
		 chengfabiao[i]=new int[i+1];
	 }
	 //�˳���������ֱ���Խ���
	 for(int i=0;i<chengfabiao.length;i++)
	 {
		 for(int j=0;j<chengfabiao[i].length;j++) {
			 chengfabiao[i][j]=(i+1)*(j+1);
		 }
	 }
	 //����˷���
	 for(int i=0;i<chengfabiao.length;i++) {
		 for(int j=0;j<chengfabiao[i].length;j++) {
			 System.out.print("\t"+chengfabiao[i][j]);
		 }
		 System.out.println();
	 }
 }
}

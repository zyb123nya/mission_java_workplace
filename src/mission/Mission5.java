package mission;
//����ת��->��5*5�ľ�����ת90��
public class Mission5 {
	public static void main(String[]args) {
		int mat1[][]={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
		//�Զ������->��ά���飬5*5
		int mat2[][]=new int[5][5];//�Զ�λ�������ռ�
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				mat2[j][i]=mat1[i][j];//�ѵ�һ����������б��У���ֵ���ڶ�����ȥ
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println();
		}
		//���ϴ�ӡԭ�������´�ӡ�ı��������Ƿָ���
		System.out.println("************after do that:");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println();
		}
	}
}

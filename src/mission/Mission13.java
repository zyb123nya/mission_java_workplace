package mission;

public class Mission13 {
	public static void main(String[]args) {
		int i,j,k;//��λ��
		for(i=1;i<5;i++) {//��һλ
			for(j=1;j<5;j++) {//�ڶ�λ
				for(k=1;k<5;k++) {//����λ
					if(i!=k&&j!=k&&i!=j) {//�������λֵ��һ��
						System.out.print(i*100+j*10+k+" ");//������ֵ
					}
				}
				
			}
			System.out.println();//��һλ��һ�����������
		}

	}

}

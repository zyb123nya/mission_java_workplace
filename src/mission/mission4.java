package mission;
//ð�ݡ�������mission_advance��package��
import java.util.Arrays;
//�ο��ĵ���https://tool.oschina.net/apidocs/apidoc?api=jdk-zh
/*��ָ���� char �����鰴���������������
 * �������㷨��һ���������ŵĿ������򷨣�
 * �ı��� Jon L. Bentley �� M. Douglas McIlroy ������
 *  Engineering a Sort Function", Software-Practice and Experience Vol. 23
 *  (11) P. 1249-1265 (November 1993)��
 *  ���㷨��������ݼ����ṩ n*log(n) ���ܣ�
 *  �⵼��������������ή�Ͷ��������ܡ�
 */
public class mission4 {
	public static void main(String[]args) {
		int arry[]={5,7,10,9,2};
		Arrays.sort(arry);
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);//����������յڶ������е�mission4_adv2
		}
	}
}

package mission_advance;
import java.util.Scanner;
class maopao{
	void sort(int arr[]) {
	int i;
	int j;
	int temp;
	int len=arr.length;
	for(i=0;i<len-1;i++) {
		for(j=len-1;j>i;j--) {
			if(arr[j]<arr[j-1]) {
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
			}
		}
	}
}
}
public class mission4_adv {
	//ð��
	public static void main(String[]args){
		
		Scanner p = new Scanner(System.in);
		int i,j,temp;
		String c1;
		int arr[] = new int[5];
		int len =arr.length;
		System.out.println("��Ӽ�������5������:");
		for(i=0;i<len;i++) {
			c1 = p.next();
			arr[i]=Integer.parseInt(c1);
		}
		System.out.print("ԭʼ����Ϊ:");
		for(i=0;i<len;i++) {
			System.out.print(" "+arr[i]);
		}
			maopao m = new maopao();
			m.sort(arr);
		System.out.print("ð�ݷ�����Ľ��:");
		for(i=0;i<len;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}

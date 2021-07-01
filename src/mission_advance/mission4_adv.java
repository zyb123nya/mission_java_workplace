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
	//冒泡
	public static void main(String[]args){
		
		Scanner p = new Scanner(System.in);
		int i,j,temp;
		String c1;
		int arr[] = new int[5];
		int len =arr.length;
		System.out.println("请从键盘输入5个数据:");
		for(i=0;i<len;i++) {
			c1 = p.next();
			arr[i]=Integer.parseInt(c1);
		}
		System.out.print("原始数据为:");
		for(i=0;i<len;i++) {
			System.out.print(" "+arr[i]);
		}
			maopao m = new maopao();
			m.sort(arr);
		System.out.print("冒泡法排序的结果:");
		for(i=0;i<len;i++) {
			System.out.print(" "+arr[i]);
		}
	}
}

package mission;
import java.util.Arrays;
import java.util.Scanner;
public class Mission16{


	public static void main(String []args) {//�������Զ����򣬰�����ֵ
        int[] array = {1, 5, 6, 7, 9};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("��������������");
        int num = sc.nextInt();
        
        System.out.println("������������ֵ������ռ�(1-5)");
        int index = sc.nextInt();
        sc.close();
        charu(array, index, num);
        
    }

	private static void charu(int[] array, int index, int num) {
		
	        int[] arr = Arrays.copyOf(array, array.length + 1);
	        for (int i = arr.length-1; i > index; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[index] = num;
//	        Arrays.sort(arr); �Ҳ�֪��ԭ���Ĺ����費��Ҫ���������Ҫ�����ü���
	        System.out.println(Arrays.toString(arr));
	}
		
	
	
}

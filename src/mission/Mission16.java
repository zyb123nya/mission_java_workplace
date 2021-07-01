package mission;
import java.util.Arrays;
import java.util.Scanner;
public class Mission16{


	public static void main(String []args) {//对数组自动排序，包括插值
        int[] array = {1, 5, 6, 7, 9};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入放入的数字");
        int num = sc.nextInt();
        
        System.out.println("请输入放入数字的所属空间(1-5)");
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
//	        Arrays.sort(arr); 我不知道原来的规律需不需要排序，如果需要则启用即可
	        System.out.println(Arrays.toString(arr));
	}
		
	
	
}

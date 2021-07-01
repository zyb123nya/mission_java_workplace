package mission;
import java.util.Arrays;
import java.util.Scanner;

import java.util.Arrays;

public class Mission17 {
	public static void main(String[]args) {
	System.out.print("数字个数:");
	Scanner input = new Scanner(System.in);
	int n =input.nextInt();
		if(n > 0){
		 int arr_n [] =new int[n];
		 for(int i=0; i<n; i++) {
			 arr_n[i] = input.nextInt(); 
		 }
		 max(arr_n);
		 min(arr_n);
		 System.out.println(Arrays.toString(arr_n));
	   
     	}
	 input.close();
	}
	
	static void max(int arr_n[]){
		int max = 0;//首位置
		int index =0;
		for(int i=0;i<arr_n.length;i++) {
			if(max<arr_n[i]) {
				max=arr_n[i];
				index=i;
			}
		}
		int temp =arr_n[0];
		arr_n[0] = max;
		arr_n[index] = temp;
	}
	static void min(int arr_n[]){
		int min = arr_n[arr_n.length-1];//末位置：数组长度-1
		int index =0;
		for(int i=0;i<arr_n.length;i++) {
			if(min>arr_n[i]) {
				min=arr_n[i];
				index=i;
			}
		}
		int temp =arr_n[arr_n.length-1];
		arr_n[arr_n.length-1] = min;
		arr_n[index] = temp;
	}
}

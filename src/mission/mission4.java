package mission;
//冒泡、快排在mission_advance的package中
import java.util.Arrays;
//参考文档：https://tool.oschina.net/apidocs/apidoc?api=jdk-zh
/*对指定的 char 型数组按数字升序进行排序。
 * 该排序算法是一个经过调优的快速排序法，
 * 改编自 Jon L. Bentley 和 M. Douglas McIlroy 合著的
 *  Engineering a Sort Function", Software-Practice and Experience Vol. 23
 *  (11) P. 1249-1265 (November 1993)。
 *  此算法在许多数据集上提供 n*log(n) 性能，
 *  这导致其他快速排序会降低二次型性能。
 */
public class mission4 {
	public static void main(String[]args) {
		int arry[]={5,7,10,9,2};
		Arrays.sort(arry);
		for(int i=0;i<arry.length;i++)
		{
			System.out.println(arry[i]);//快速排序参照第二个包中的mission4_adv2
		}
	}
}

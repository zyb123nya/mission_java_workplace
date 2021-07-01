package mission;
import java.util.Scanner;
public class Mission11 {
	public static void main(String[]args) {
		Scanner n = new Scanner(System.in);
		String s = n.next();
		int bigCount = 0;
		int SmallCount = 0;
		int numberCount =0;
		for(int i = 0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch >= 'a' && ch<='z') {
				SmallCount++;
			}
			else if(ch >= 'A' && ch<='Z') {
				bigCount++;
			}
			else if(ch >= '0' && ch<='9') {
				numberCount++;
			}
		}
		System.out.println("´óÐ´×ÖÄ¸:"+bigCount);
		System.out.println("Êý×Ö:"+numberCount);
		System.out.println("Ð¡Ð´×ÖÄ¸:"+SmallCount);
	}
}

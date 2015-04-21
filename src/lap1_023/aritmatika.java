package lap1_023;
import java.util.Scanner;


public class aritmatika {
	static int a,b,c;
	
	void tambah (int a, int b){
		c=a+b;
		System.out.print("hasil "+a+"+"+b+" ="+c);
	}
	
	void kurang (int a, int b){
		c=a-b;
		System.out.print("hasil "+a+"-"+b+" ="+c);
	}
	
	void kali (int a, int b){
		c=a*b;
		System.out.print("hasil "+a+"x"+b+" ="+c);
	}
	
	void bagi (int a, int b){
		c=a/b;
		if (a==0) {
		System.out.print("error");
		}
		else if (b==0) {
		System.out.print("infinity");	
		}
		else
		System.out.print("hasil "+a+"/"+b+" ="+c);
	}
	
	byte inputan(int x){
		Scanner ketik  = new Scanner(System.in);		
		System.out.print("Input nilai "+x+" : ");
		byte a = (byte) Integer.parseInt(ketik.nextLine());
		return a;
	}
}

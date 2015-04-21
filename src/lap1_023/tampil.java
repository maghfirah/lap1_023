package lap1_023;
import java.util.Scanner;

public class tampil {
	
	void bio(){
		System.out.println("BIODATA");
		System.out.println("Nama : Maghfirah Suyuti");
		System.out.println("TTL  : Palopo,13 Desember 1994");
		System.out.println("NIM  : 60200112023");
		System.out.println("===================================");		
	}
	
	void pilihan(){
		System.out.println("Mari berhitung!");
		System.out.println("Input 1: TAMBAH!");
		System.out.println("Input 2: KURANG!");
		System.out.println("Input 3: KALI!");
		System.out.println("Input 4: BAGI!");
	}
	
	public static void main (String[] args){
		Scanner ketik		= new Scanner(System.in);
		tampil biodata 		= new tampil ();
		aritmatika hitung 	= new aritmatika ();

		biodata.bio();
		biodata.pilihan();
		
		System.out.print("Input Pilihan= ");
		byte pil = (byte) Integer.parseInt(ketik.nextLine());
		byte a = hitung.inputan(1);
		byte b = hitung.inputan(2);
		
		switch (pil){
			case 1:
				hitung.tambah(a,b);
				break;
			case 2:
				hitung.kurang(a,b);
				break;
			case 3:
				hitung.kali(a,b);
				break;
			case 4:
				hitung.bagi(a,b);
				break;
			default:
				System.out.println("Salah input!");
		}					
	}
}

package pbo1_023;

public class tampil {
	static String judul="Perkenalan";  //deklarasi variable global
	static String nama=" Maghfirah Suyuti";  //deklarasi variable global
	 
	 void identitas (){  
	 	System.out.println("Nick	: Virah");
	 	System.out.println("TTL 	: Palopo, 13 Desember 1994");
	 	System.out.println("Almt	: BTN Minasaupa B6 Nomor 11");
	 }
     
	 
	 public static void main(String[] args) {
		   	int a = 2, b = 2; //deklarasi variable lokal
		   	
	        System.out.println("Praktikum Pertama"); //mencetak Praktikum Pertama
	        System.out.println(judul+nama); //mencetak variable nama
	        new tampil().identitas(); //memanggil method
	        System.out.println("Nilai a = "+a); // menampilkan isi variable a
	        System.out.println("Nilai b = "+b); // menampilkan isi variable b
	        System.out.print("a+b = "); System.out.println(a+b); // menampilkan hasil penjumlahan a+b
	        System.out.print("a-b = "); System.out.println(a-b); // menampilkan hasil pengurangan a-b
	        System.out.print("a*b = "); System.out.println(a*b); // menampilkan hasil perkalian a*b
	        System.out.print("a/b = "); System.out.println(a/b); // menampilkan hasil pembagian a:b
	        
	    }
}

package introo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 25;
		boolean dustuMu = false;
		String internetSubeButonu = "�nternet �ubesi";
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmini koy.");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar y�kseldi resmi koy.");
		}
		else {
			System.out.println("Dolar e�it resmi koy.");
		}
		
		//diziler, a�a��daki �rnekleri teker teker yaz�p her birini g�nceleme gereksinimi oldu�unda
		// tekrar ekrana basma derdinden kurtar�r.
		String[] krediler = 
			{
				"H�zl� kredi",
				"Mutlu emekli kredisi",
				"konut kredisi",
				"�if�ti kredisi",
				"msb kredisi",
				
			};
		//foreach olay� ise kredilerdeki her bir krediyi gezer
		for(String kredi :krediler)
		{
			System.out.println(kredi);
		}
		//ayn� i�i int ile yazarsak
		for(int i = 0; i< krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		/// referans tipleri ve de�er tipleri
		//de�er tiplerde atama yap�l�r ve de�i�kenler aras�nda ba�lant� kalmaz
		// referans tiplerde ise birbirine ba�l�d�r. arraylar gibi.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1= sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);

}
}

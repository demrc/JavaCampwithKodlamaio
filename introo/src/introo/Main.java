package introo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double dolarDun = 8.15;
		double dolarBugun = 8.18;
		int vade = 25;
		boolean dustuMu = false;
		String internetSubeButonu = "Ýnternet Þubesi";
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmini koy.");
		}
		else if(dolarBugun>dolarDun) {
			System.out.println("Dolar yükseldi resmi koy.");
		}
		else {
			System.out.println("Dolar eþit resmi koy.");
		}
		
		//diziler, aþaðýdaki örnekleri teker teker yazýp her birini günceleme gereksinimi olduðunda
		// tekrar ekrana basma derdinden kurtarýr.
		String[] krediler = 
			{
				"Hýzlý kredi",
				"Mutlu emekli kredisi",
				"konut kredisi",
				"çifçti kredisi",
				"msb kredisi",
				
			};
		//foreach olayý ise kredilerdeki her bir krediyi gezer
		for(String kredi :krediler)
		{
			System.out.println(kredi);
		}
		//ayný iþi int ile yazarsak
		for(int i = 0; i< krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		
		/// referans tipleri ve deðer tipleri
		//deðer tiplerde atama yapýlýr ve deðiþkenler arasýnda baðlantý kalmaz
		// referans tiplerde ise birbirine baðlýdýr. arraylar gibi.
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

package oopIntro;

public class main {

	public static void main(String[] args) {
		//objelerle çalýþmak gerekir
		//bir classý oluþtururken kullanacaðýmýz iþlev new product vs..
		
		Product product1 = new Product(); // örnek oluþturma, referans oluþturma, instance oluþturma denebilir
		product1.setId(1);
		product1.setName("Lenovo v14");
		product1.setDetail("32 Gb Ram");
		product1.setUnitPrice(15000);
		product1.setDiscount(10);
		Product product2 = new Product(); // örnek oluþturma, referans oluþturma, instance oluþturma denebilir
		product2.setId(2);
		product2.setName("Lenovo v15");
		product2.setDetail("16 Gb Ram");
		product2.setUnitPrice(16000);
		product2.setDiscount(10);
		System.out.println(product2.getUnitPriceAfterDiscount());
		System.out.println(product1.getUnitPriceAfterDiscount());
		
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		
		
//		Product[] products = {product1,product2,product3};//product1 i array e ekleyebiliriz.bunun yerine foreach yapablriiz
//		
//		//verinin türü, takma ismi(deðiþken),listelenen ürün mü neyse artýk o 
//		for (Product product : products) {
//			System.out.println(product.name);
//		}
//		
//		System.out.println(products.length);
//		
//		Category category1 = new Category();
//		category1.id=1;
//		category1.name="Bilgisayar";
//		
//		Category category2 = new Category();
//		category2.id=2;
//		category2.name="Ev/Bahçe";
//		
//		ProductManager productManager = new ProductManager();
//		productManager.addToCart(product1);
		
	}

}

package oopIntro;



public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	private double unitPriceAfterDiscount;
//java da class isimleri büyük harflerle baþlar
	//classta þablonumuzu oluþturuyoruz diyebiliriz
	
	//contructor yazma. olmasýný istediðimiz kodu buraya yazarýz
	//birden fazla contructor varsa bu yapýda sadece biri çalýþýr
	public Product() {
		System.out.println("Ben çalýþtým");
	};
	//bunu main classýnda ekstradan aþaðýdaki referans tipleri yazmadan direk bilgileri girmemizi saðlar
	public Product(int id, String name, double unitPrice,String detail,double discount,double unitPriceAfterDiscount) {
		//yukarýdakilerin çalýþmasý için tanýmasýný saðlamamýz lazým bu da this komutuyla olur
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		this.discount=discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
		
	};
	//kodlarýn yönetimi açýsýndan encapsulation yapýp get set yapmak her zaman yararlýdýr.
	//islemlerin yönetimi buradan gerçekleþir
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);
	}
}

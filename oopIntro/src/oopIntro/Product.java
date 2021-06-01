package oopIntro;



public class Product {
	
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;
	private double unitPriceAfterDiscount;
//java da class isimleri b�y�k harflerle ba�lar
	//classta �ablonumuzu olu�turuyoruz diyebiliriz
	
	//contructor yazma. olmas�n� istedi�imiz kodu buraya yazar�z
	//birden fazla contructor varsa bu yap�da sadece biri �al���r
	public Product() {
		System.out.println("Ben �al��t�m");
	};
	//bunu main class�nda ekstradan a�a��daki referans tipleri yazmadan direk bilgileri girmemizi sa�lar
	public Product(int id, String name, double unitPrice,String detail,double discount,double unitPriceAfterDiscount) {
		//yukar�dakilerin �al��mas� i�in tan�mas�n� sa�lamam�z laz�m bu da this komutuyla olur
		this.id=id;
		this.name=name;
		this.unitPrice=unitPrice;
		this.detail=detail;
		this.discount=discount;
		this.unitPriceAfterDiscount=unitPriceAfterDiscount;
		
	};
	//kodlar�n y�netimi a��s�ndan encapsulation yap�p get set yapmak her zaman yararl�d�r.
	//islemlerin y�netimi buradan ger�ekle�ir
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

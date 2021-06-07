package kodlamaio.northwind.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
//we use this table.
@Table(name="products")
@Data//getter ve setter ları oto tanımladı
@AllArgsConstructor//bunu yazınca otomatik olarak contrustor ları tanımlıyor, parametreli constructorlar
@NoArgsConstructor// bu da parametresz contructor için
public class Product {
	//we use column for which column is use by us
	//id, we use it, because processes are going on id, id of table
	//generated value use for how id is increase
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//bunu biz yazacağız ki veritabanı otomatik kendi oluştursun. stratejidir.
	@Column(name="product_id")
	private int id;
	
//	@Column(name="category_id")
//	private int categoryId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="unit_price")
	private double unitPrice;
	
	@Column(name="units_in_stock")
	private short unitsInStock;
	
	@Column(name="quantity_per_unit")
	private String quantityPerUnit;
	
	@ManyToOne()
	@JoinColumn(name="category_id")//ilişkili olduğu tabloyla nasıl bir durum var onu belirttik
	private Category category;
	
	
	

	public Product() {
		
	}
	
	public Product(int id, int categoryId, String productName, double unitPrice, short unitsInStock,
			String quantityPerUnit,Category category) {
		super();
		this.id = id;
		
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.unitsInStock = unitsInStock;
		this.quantityPerUnit = quantityPerUnit;
		this.category = category;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public short getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(short unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getQuantityPerUnit() {
		return quantityPerUnit;
	}

	public void setQuantityPerUnit(String quantityPerUnit) {
		this.quantityPerUnit = quantityPerUnit;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
}

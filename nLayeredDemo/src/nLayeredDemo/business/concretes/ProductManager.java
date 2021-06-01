package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	//business layer just communicate with access layer's abstract class
	private ProductDao productDao;
	private LoggerService loggerService;
	
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	

	@Override
	public void add(Product product) {
		if(product.getCategoryId()==1) {
			System.out.println("product is not acceptiable in this category!");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("Product added "+product.getName());
		}

	
	
	@Override
	public List<Product> getAll() {
		
		return null;
	}

}

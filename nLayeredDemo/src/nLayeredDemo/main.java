package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.abcProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class main {

	public static void main(String[] args) {
		//do not new except entity, because they will be a problem in future
		ProductService productService = new ProductManager(new abcProductDao(),new JLoggerManagerAdapter());
		
		
		Product product = new Product(1,2,"apple",12,50);
		productService.add(product);
	}

}

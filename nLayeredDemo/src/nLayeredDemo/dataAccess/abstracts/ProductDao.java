package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	//for product search, searching in product class and get some results
	Product get(int id);
	//for list some products, use List instead of array list.
	List<Product> getAll();
}

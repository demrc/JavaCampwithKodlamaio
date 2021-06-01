package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
//controller ın kullacağı yapılar burada yazılır, kaç servis oluşursa öyle düşün, yani abstract kısmı
public interface ProductService {
	DataResult<List<Product>>  getAll();
	Result add(Product product);
}

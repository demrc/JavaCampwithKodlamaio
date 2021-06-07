package kodlamaio.northwind.business.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
//controller ın kullacağı yapılar burada yazılır, kaç servis oluşursa öyle düşün, yani abstract kısmı
public interface ProductService {
	DataResult<List<Product>>  getAll();
	//sayfalama için bunu yapıyoruz
	DataResult<List<Product>>  getAll(int pageNo,int pageSize);
	//sıralama için
	DataResult<List<Product>>  getAllSorted();

	Result add(Product product);
	//bunlar bizim yazdığımız özel operasyonlar. yukarıda yazanlar jparepository de zaten var olanlar
	DataResult<Product> getByProductName(String productName);//bir ürünü listeleyecek//getBy gidiyor productname i buluyor ve hazır şekilde geliypr
	DataResult<Product> getByProductNameAndCategory(String productName, int categoryId);
	DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId);
	DataResult<List<Product>> getByCategoryIn(List<Integer> categories);//şunları getir.
	DataResult<List<Product>> getByProductNameContains(String productName);//şunu içereni getir
	DataResult<List<Product>> getByProductNameStartsWith(String productName);//şunu içereni getir
	
	
	DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId);
	
	DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails();
}

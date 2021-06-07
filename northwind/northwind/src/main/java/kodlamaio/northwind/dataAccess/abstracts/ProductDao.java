package kodlamaio.northwind.dataAccess.abstracts;
//product ı koyuyoruz buraya, ve primary key in cinsini de belirtiyoruz sorgusunu bu şekilde yapsın
//diye

import java.util.List;

//
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

//jpa repository ekleme, silme, güncelleme, veritabanından veri çekme gibi operasyonları yapmaya yarar 
//jeneriktir, her nesne için çalışacak yapıya sahip, bu da bir interface,
//bizim interfacelere yazdığımız işlemler bunun içinde var, öyle düşünebiliriz
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
//bu yazdığımız jpa repository için product ve integer jpa repository de bir instance oluşturuyor
//ve bu instance ı product manager a verecek çünkü orada çağırılıyor.
//ezbere kullanma.
public interface ProductDao extends JpaRepository<Product,Integer>{
	
	Product getByProductName(String productName);//bir ürünü listeleyecek//getBy gidiyor productname i buluyor ve hazır şekilde geliypr
	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);
	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);
	List<Product> getByCategoryIn(List<Integer> categories);//şunları getir.
	List<Product> getByProductNameContains(String productName);//şunu içereni getir
	List<Product> getByProductNameStartsWith(String productName);//şunu içereni getir
	
	
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")//JPQL örneği//=: parametre ve değeri diye belirtir
	List<Product> getByNameAndCategory(String productName, int categoryId);

	@Query("Select new kodlamaio.northwind.entities.dtos.ProductWithCategoryDto(p.id,p.productName,c.categoryName) "
			+ "From Category c Inner Join c.products p")
	List<ProductWithCategoryDto> getProductWithCategoryDetails();
	
}

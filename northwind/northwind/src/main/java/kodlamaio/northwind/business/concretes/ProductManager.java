package kodlamaio.northwind.business.concretes;


//abstract service in işini yapan yer
import java.util.List;
//bean proje class ı olarak algıla.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
import kodlamaio.northwind.entities.dtos.ProductWithCategoryDto;
//service, projemizdeki business kısmını görecek olan yer demek
@Service
public class ProductManager implements ProductService{
//data access e erişmek için, productdao yu oluşturuyoruz.
	private ProductDao productDao;
	
	//autowired, spring arka planda productdao nun instance ı olabilecek bir class üretip onu veriyor
	//çok kullanılır. tek bir sınıftan gidilir.
	@Autowired
	//sistem bu şekilde çözümlenir. productdao nun ne olduğunu bize verebilmesi için
	//autowired ekliyoruz diyebiliriz
	//veri erişim katmanına buradan ulaşırız, interface i burada oluştururuz
	//bir bağımlılığı contructor üzerinden enjecte etmek yani
	//bu interfaceler newlenmez ama bunun burada çalışmasını autowired sağlıyor.
	//gidiyor Dao nun somut olduğu bir nesneyi arıyor, onu newleyip bize getiriyor.
	//biz ekstra bir şey yazmadık, jparepository de bunlar var zaten
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getAll() {
	//dataresult ı burada kullanma sebebimiz, interface gibi kullanarak super base gibi kullanıyoruz
	//
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data Listed.");
				
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);//save ekleme yapıyor burada veya güncelleme
		return new SuccessResult("Product added.");
	}

	@Override
	public DataResult<Product> getByProductName(String productName) {
		//business kodları buraya yazılacak
		return new SuccessDataResult<Product>(this.productDao.getByProductName(productName),"Data Listed.");

	}

	@Override
	public DataResult<Product> getByProductNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<Product>(this.productDao.getByProductNameAndCategory_CategoryId(productName,categoryId),"Data Listed.");

	}

	@Override
	public DataResult<List<Product>> getByProductNameOrCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameOrCategory_CategoryId(productName,categoryId),"Data Listed.");

	}

	@Override
	public DataResult<List<Product>> getByCategoryIn(List<Integer> categories) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByCategoryIn(categories),"Data Listed.");

	}

	@Override
	public DataResult<List<Product>> getByProductNameContains(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameContains(productName),"Data Listed.");

	}

	@Override
	public DataResult<List<Product>> getByProductNameStartsWith(String productName) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByProductNameStartsWith(productName),"Data Listed.");

	}

	@Override
	public DataResult<List<Product>> getByNameAndCategory(String productName, int categoryId) {
		return new SuccessDataResult<List<Product>>(this.productDao.getByNameAndCategory(productName,categoryId),"Data Listed.");

	}

	@Override
	public DataResult<List<Product>> getAll(int pageNo, int pageSize) {

		Pageable pageable= PageRequest.of(pageNo-1, pageSize);
				
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(pageable).getContent());
	}

	@Override
	public DataResult<List<Product>> getAllSorted() {

		Sort sort = Sort.by(Sort.Direction.DESC,"productName");
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(sort),"Successful.");
	}

	@Override
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoryDetails() {
		return new SuccessDataResult<List<ProductWithCategoryDto>>(this.productDao.getProductWithCategoryDetails(),"Data Listed.");
	}

}

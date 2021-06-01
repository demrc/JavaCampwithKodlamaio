package kodlamaio.northwind.business.concretes;


//abstract service in işini yapan yer
import java.util.List;
//bean proje class ı olarak algıla.
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.core.utilities.results.SuccessDataResult;
import kodlamaio.northwind.core.utilities.results.SuccessResult;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;
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

}

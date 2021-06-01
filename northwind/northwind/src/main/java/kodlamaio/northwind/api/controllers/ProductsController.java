package kodlamaio.northwind.api.controllers;
//controller,backend ve farklı uygulama ortamlarının anlaşabilmesi için api kuruyoruz.
//controller ise bu ortamlar arasındaki istekleri yönetir. dış ortam ile haberleşir diyebiliriz.

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController//sen bir controller demek, java olmayanlar da tanısın diye yazıyoruz
@RequestMapping("/api/products")//eğer dış dünyadan birisi istekte bulunursa bu karar verecek,farklı controlleri
//yönetmek için kullanılır.
public class ProductsController {
	//böyle bir desteği bu controller ile veriyoruz demektir.
	
	
	
	private ProductService productService;
	@Autowired//burada autowired, projeyi tariyor, kim productservice i implement etmiş
	//geliyor, productmanager in implement ettiğini görüyor ve arka planda newliyor
	//productmanager p=new productmanager() yapıyor.bunu yaparken dao ya da ihtiyaç duyuyor onu 
	//da newliyor kısacası newlenmiş p yi controller e yerleştiriyor. sanki product manager ı 
	//çalıştırmış gibi davranıyoruz. çünkü öyle oluyor arka planda
	// burada çalışırken aynı zamanda veri tabanıyla da iletişimi sağlıyor diyebiliriz
	// product managar ı newlerken dao yu da newlemesi nedeniyle ortak iş yapıyor diyelim
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	//getmapping veri istediğimiz get request zamanlarda kullanılır
	@GetMapping("/getall")// getall diye bir istekte bulunursak aşağıdaki kod çalışacak demek
	public DataResult<List<Product>> getAll() {
		return this.productService.getAll();
	}
	
	//bir şey göndereceğimiz zaman eklediğimizde vs bu anotasyon kullanılır
	@PostMapping("/add")// be şekilde post işleminde bir parametre alırsak ki genelde alırız o zaman;
	public Result add(@RequestBody Product product) {//gelen requestin bi body si var demek, bu da
		//post işlemi olduğu için execute işlemi dediğimizde mesaj gövdesine, bilgileri de json datasına 
		//döndürüp yolluyor, requestbody yapıyor bilgileri pakete koyup yollar gibi, id , categoryid gibi
		//alanları product ın içinde arıyor bunları haritalandırıyor, arka planda bir product oluşturuyor
		// ve bunu buraya yollayıp eşleştiriyor controller içine yani
		return this.productService.add(product);
	}
}

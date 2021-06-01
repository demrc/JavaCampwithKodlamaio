package kodlamaio.northwind.dataAccess.abstracts;
//product ı koyuyoruz buraya, ve primary key in cinsini de belirtiyoruz sorgusunu bu şekilde yapsın
//diye

//
import org.springframework.data.jpa.repository.JpaRepository;
//jpa repository ekleme, silme, güncelleme, veritabanından veri çekme gibi operasyonları yapmaya yarar 
//jeneriktir, her nesne için çalışacak yapıya sahip, bu da bir interface,
//bizim interfacelere yazdığımız işlemler bunun içinde var, öyle düşünebiliriz
import kodlamaio.northwind.entities.concretes.Product;
//bu yazdığımız jpa repository için product ve integer jpa repository de bir instance oluşturuyor
//ve bu instance ı product manager a verecek çünkü orada çağırılıyor.
//ezbere kullanma.
public interface ProductDao extends JpaRepository<Product,Integer>{
	
}

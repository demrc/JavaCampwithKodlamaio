package kodlamaio.northwind;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2//bu swagger ı başlatan anotasyon, api üzerinden büyün controllerı buluyor
//altta yazdığım şeyler yani
public class NorthwindApplication {

	public static void main(String[] args) {
		SpringApplication.run(NorthwindApplication.class, args);
	}
	
	//bean controller daki bütün  requesthandler ları buluyor ve dökümantasyon haline getiriyor
	// uygulamdaki bütün apileri buluyor ve onları test edebileceğimiz noktaya taşıyor
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("kodlamaio.northwind"))              
          .paths(PathSelectors.any())                          
          .build();                                           
    }

}

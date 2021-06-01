package kodlamaio.northwind.core.utilities.results;
//birden fazla veri tipinin döndürülmesini istediğimiz noktada T yani generic kullanırız
//bunun içinde error ve success data result larını yazalım aynı result için yazdığımız gibi
public class DataResult<T> extends Result{
	private T data;
	public DataResult(T data,boolean success, String message) {
		super(success, message);
		this.data=data;
	}
	//sadece bunu da kullanabiliriz. result ta tanımlı ne de olsa
	public DataResult(T data,boolean success) {
		super(success);
		this.data=data;
	}
	
	public T getData() {
		return this.data;
	}

}

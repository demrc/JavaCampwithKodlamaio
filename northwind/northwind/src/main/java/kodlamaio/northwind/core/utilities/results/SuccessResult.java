package kodlamaio.northwind.core.utilities.results;

//bu class ı başarılı olduğu durumlarda kullansın diye kurduk
public class SuccessResult extends Result {

	public SuccessResult() {
		super(true);
		// TODO Auto-generated constructor stub
	}
	
	public SuccessResult(String message) {
		super(true,message);
		// TODO Auto-generated constructor stub
	}
}

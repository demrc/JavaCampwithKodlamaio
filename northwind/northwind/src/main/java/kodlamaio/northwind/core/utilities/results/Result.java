package kodlamaio.northwind.core.utilities.results;
//we use error or success result instead of result, because of work without error.
public class Result {
	private boolean success;
	private String message;
	
	public Result(boolean success) {
		this.success=success;
	}
	public Result(boolean success,String message) {
		this.success=success;
		this.message=message;
	}
	
	public boolean isSuccess() {
		return this.success;
	}
		
	public String getMessage() {
		return message;
	}
	
}

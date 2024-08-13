package customException;

class InvalidPercentageException extends RuntimeException {
	private String message;
	InvalidPercentageException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
	return message;
	}
}



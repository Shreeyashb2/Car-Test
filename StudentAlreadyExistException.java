package snippet;

public class StudentAlreadyExistException extends RuntimeException {
	public StudentAlreadyExistException(String msg) {
		super(msg);
	}
}

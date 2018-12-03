package win.oscene.paycore;

/**
 * @author Sorata  2018/9/28 12:02
 */
public class ResponseData<T> {

	private int code;

	private String message;

	private T data;


	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}

package arora.nitish.orders.dto.response;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.http.HttpStatus;

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer responseCode;

	private String responseMessage;

	public BaseResponse() {
	}

	public BaseResponse(HttpStatus status) {
		Objects.requireNonNull(status, "Status can't be null.");
		this.responseCode = status.value();
		this.responseMessage = status.getReasonPhrase();
	}

	public BaseResponse(HttpStatus status, String message) {
		Objects.requireNonNull(status, "Status can't be null.");
		this.responseCode = status.value();
		this.responseMessage = message;
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
}

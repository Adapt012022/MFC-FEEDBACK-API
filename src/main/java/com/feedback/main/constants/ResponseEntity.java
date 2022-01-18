package com.feedback.main.constants;

public class ResponseEntity<T> {
	private int status;
	private String message;
	private String description;
	
	
	
	public ResponseEntity(int status, String message, String description) {
		
		this.status = status;
		this.message = message;
		this.description = description;
	}
	public ResponseEntity(int status, String message, String description, T response) {
		this.status = status;
		this.message = message;
		this.description = description;
		this.response = response;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public T getResponse() {
		return response;
	}
	public void setResponse(T response) {
		this.response = response;
	}
	private T response;
	

}

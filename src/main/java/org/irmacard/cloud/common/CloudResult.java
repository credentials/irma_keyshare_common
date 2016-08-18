package org.irmacard.cloud.common;

public class CloudResult {
	String status;
	String message;

	public static final String STATUS_SUCCESS = "success";
	public static final String STATUS_FAILURE = "failure";
	public static final String STATUS_ERROR = "error";

	public CloudResult() {
	}

	public CloudResult(String status, String message) {
		this.status = status;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setstatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return "Status: " + status + ", msg: " + message;
	}
}

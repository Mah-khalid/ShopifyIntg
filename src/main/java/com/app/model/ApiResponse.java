package com.app.model;

import java.util.List;

public class ApiResponse {
	
	private Boolean isSuccess;
	private List<String> error;
	private Object data;
	private String successMessage;
	
	public Boolean getIsSuccess() {
		return isSuccess;
	}
	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public List<String> getError() {
		return error;
	}
	public void setError(List<String> error) {
		this.error = error;
	}
	public String getSuccessMessage() {
		return successMessage;
	}
	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}
	
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ApiResponse [isSuccess=").append(isSuccess).append(", error=").append(error).append(", data=")
				.append(data).append(", successMessage=").append(successMessage).append("]");
		return builder.toString();
	}
	
}

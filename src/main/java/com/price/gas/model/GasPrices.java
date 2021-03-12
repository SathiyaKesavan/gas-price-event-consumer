package com.price.gas.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "GASPRICE")
public class GasPrices {
	
	@Id
	private String date;
	private boolean success;
	private List<GasPrice> result;
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public List<GasPrice> getResult() {
		return result;
	}
	public void setResult(List<GasPrice> result) {
		this.result = result;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

}

package com.terracottainnovation.application.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Result {

	@Getter
	@Setter
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
}

package com.cg.inheritance;

public class mobile {
	private String manufacturer;
	private String operatingsystem;
	protected String model;
	//call to the constructor
	public mobile(String manufacturer, String operatingsystem, String model) {
		super();
		this.manufacturer = manufacturer;
		this.operatingsystem = operatingsystem;
		this.model = model;
	}
	protected String getmodel() {
		return model;
	}
	@Override
	public String toString() {
		return "mobile [manufacturer=" + manufacturer + ", operatingsystem=" + operatingsystem + ", model=" + model
				+ "]";
	}
	

}

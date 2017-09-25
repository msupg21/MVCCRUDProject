package com.skilldistillery.data;

public class Laptop {
	private int stockNum;
	private String name;
	private String seller;
	private int year;
	private double price;
	private String ram;
	private String processor;
	private String hardDrive;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public String getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(String hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Laptop() {

	}

	public Laptop(int stockNum, String name, String seller, int year, double price, String ram, String processor,
			String hardDrive) {
		super();
		this.stockNum = stockNum;
		this.name = name;
		this.seller = seller;
		this.year = year;
		this.price = price;
		this.ram = ram;
		this.processor = processor;
		this.hardDrive = hardDrive;
	}

	public Laptop(String stockNumString, String name, String seller, String yearString, String priceString, String ram, String processor,
			String hardDrive) {
		super();
		
		stockNum = Integer.parseInt(stockNumString);
		this.name = name;
		this.seller = seller;
		this.year = Integer.parseInt(yearString);
		this.price = Double.parseDouble(priceString);
		this.ram = ram;
		this.processor = processor;
		this.hardDrive = hardDrive;
	}

	@Override
	public String toString() {
		return "Laptop [stockNum=" + stockNum + ", name=" + name + ", seller=" + seller + ", year=" + year + ", price="
				+ price + ", ram=" + ram + ", processor=" + processor + ", hardDrive=" + hardDrive + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockNum() {
		return stockNum;
	}

	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}

}

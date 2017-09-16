package com.skilldistillery.data;

public class Laptop {
	private int stockNum;
	private String name;
	private String seller;
	private int year;
	private int ram;
	private double processor;
	private double hardDrive;

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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public double getProcessor() {
		return processor;
	}

	public void setProcessor(double processor) {
		this.processor = processor;
	}

	public double getHardDrive() {
		return hardDrive;
	}

	public void setHardDrive(double hardDrive) {
		this.hardDrive = hardDrive;
	}

	public Laptop(int num, String name, String seller, int year, int ram, double processor, double hardDrive) {
		this.stockNum = num;
		this.name = name;
		this.seller = seller;
		this.year = year;
		this.ram = ram;
		this.processor = processor;
		this.hardDrive = hardDrive;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", seller=" + seller + ", year=" + year + ", ram=" + ram + ", processor="
				+ processor + ", hardDrive=" + hardDrive + "]";
	}

}

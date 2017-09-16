package com.skilldistillery.data;

import java.awt.List;

public interface LaptopDAO {
	public void add(Laptop laptop);
	public void edit(Laptop laptop);
	public void delete(int stockNum);
	public Laptop getLaptop(int stockNum);
	public List getAllLaptops();

}

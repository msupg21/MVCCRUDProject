package com.skilldistillery.data;

import java.util.List;

public interface LaptopDAO {
	public void add(Laptop laptop);
	public void edit(Laptop laptop);
	public void delete(int stockNum);
	public Laptop getLaptopById(int stockNum);
	public List<Laptop> getAllLaptops();
}

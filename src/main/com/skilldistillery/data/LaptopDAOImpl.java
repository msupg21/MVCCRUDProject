package com.skilldistillery.data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
public class LaptopDAOImpl implements LaptopDAO {
	private static final String FILE_NAME = "/WEB-INF/laptop.txt";
	private List<Laptop> laptops = new ArrayList<>();

	@Autowired
	private WebApplicationContext wac;

	@PostConstruct
	public void init() {
		// Retrieve an input stream from the servlet context
		// rather than directly from the file system
		try (InputStream is = wac.getServletContext().getResourceAsStream(FILE_NAME);
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));) {
			String line;
			while ((line = buf.readLine()) != null) {
				String[] tokens = line.split(",");
				int stockNum = Integer.parseInt(tokens[0].trim());
				String name = tokens[1].trim();
				int year = Integer.parseInt(tokens[2].trim());
				String ram = (tokens[3].trim());
				String processor = (tokens[4].trim());
				String hardDrive = (tokens[5].trim());
				double price = Double.parseDouble(tokens[6].trim());
				String seller = tokens[7].trim();
				laptops.add(new Laptop(stockNum, name, seller, year, price, ram, processor, hardDrive));
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
	}

	@Override
	public void add(Laptop laptop) {
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Laptop laptop) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int stockNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Laptop getLaptopById(int stockNumber) {
		Laptop l = null;
		for (Laptop laptop : laptops) {
			if (laptop.getStockNum() == stockNumber) {
				l = laptop;
				break;
			}

		}
		return l;
	}

	@Override
	public List<Laptop> getAllLaptops() {
		return laptops;
	}

}

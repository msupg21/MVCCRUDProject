package com.skilldistillery.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.management.Query;
import org.springframework.web.bind.annotation.RequestParam;
import com.mysql.jdbc.PreparedStatement;
import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
public class dbDAOimpl implements dbDAO {

	@Autowired
	private WebApplicationContext wac;

	private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/laptop";
	private static final String USER = "laptopuser";
	private static final String PASSWORD = "laptopuser";

	private Connection conn;
	private Statement stmt;
	public static int uc = 0;

	public ArrayList<Laptop> getLaptops() {
		ArrayList<Laptop> laptops = new ArrayList<>();

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			String sql = "SELECT stockNum, name, seller, year, price, ram, processor, hard_drive FROM laptop";
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				laptops.add((new Laptop(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5),
						rs.getString(6), rs.getString(7), rs.getString(8))));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return laptops;
	}

	@Override
	public Laptop getLaptopByID(int id) {

		Laptop laptop = null;
		String sql = "SELECT stockNum, name, seller, year, price, ram, processor, hard_drive FROM laptop WHERE stockNum = "
				+ id;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				laptop = new Laptop(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5),
						rs.getString(6), rs.getString(7), rs.getString(8));

				rs.close();
				stmt.close();
				conn.close();
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		return laptop;
	}

	// @Override
	public void addLaptops(Laptop laptop) {

		String sql = "INSERT INTO laptop (stockNum, name, seller, year, price, ram, processor, hard_drive) VALUES('"
				+ laptop.getStockNum() + "', '" + laptop.getName() + "', '" + laptop.getSeller() + "', '"
				+ laptop.getYear() + "', '" + laptop.getPrice() + "', '" + laptop.getRam() + "', '"
				+ laptop.getProcessor() + "', '" + laptop.getHardDrive() + "');";
		System.out.println(sql);
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			uc = stmt.executeUpdate(sql);

			stmt.close();
			conn.close();
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void updateLaptop(Laptop laptop) {

		String sql = "UPDATE laptop SET stockNum= '" + laptop.getStockNum() + "', seller= '" + laptop.getSeller()
				+ "', year= '" + laptop.getYear() + "', price= '" + laptop.getPrice() + "', ram= '" + laptop.getRam()
				+ "' , processor= '" + laptop.getProcessor() + "', hard_drive= '" + laptop.getHardDrive();

		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			java.sql.PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void deleteLaptop(int stockNum) {

		

		String sqltxt = "DELETE FROM laptop WHERE id=" + stockNum + ";";
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqltxt);
				rs.close();
				stmt.close();
				conn.close();

		} catch (Exception e) {
			System.err.println(e);
		}

	}
}
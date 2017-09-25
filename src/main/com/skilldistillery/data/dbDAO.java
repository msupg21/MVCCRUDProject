package com.skilldistillery.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.management.Query;

import org.springframework.web.bind.annotation.RequestParam;

import com.mysql.jdbc.PreparedStatement;

public interface dbDAO {
	public ArrayList<Laptop> getLaptops();
	public Laptop getLaptopByID(int id);
	public void addLaptops(Laptop laptop);
	public void deleteLaptop(int id);
}
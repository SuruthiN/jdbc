package com.jdbc.servlet.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.jdbc.servlet.dto.User;

public class DataBaseUtil {
	private String dburl = "jdbc:mysql://101.53.155.156:3306/mysql_demo_tnj";

	private String dbuname = "mysql_demo_tnj";

	private String dbpassword = "Ebrain@20";

	private String dbdriver = "com.mysql.jdbc.Driver";

	public void loadDriver(String dbdriver) {

		try {

			Class.forName(dbdriver);
			System.out.println("Connection Succsesfully");

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

	public Connection getConnection() {

		Connection conn = null;

		try {

			conn = DriverManager.getConnection(dburl, dbuname, dbpassword);

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

		return conn;

	}

	public String save(User user) {

		// TODO Auto-generated method stub

		loadDriver(dbdriver);

		Connection conn = getConnection();

		String result = "data entered Successfully";

		String sql = "insert into tb_sruthi_jdbc(user_name,email_id,password) values (?,?,?)";
		
	
		try {

			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, user.getUserName());

			ps.setString(2, user.getEmail());

			ps.setString(3, user.getPassword());

			ps.executeUpdate();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

			result = "data not entered";

		}

		return result;

	}

}

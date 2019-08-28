package com.basic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQL连接 {
	// MySQL 8.0 以下版本 - JDBC 驱动名及数据库 URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/ssm";
	// 数据库的用户名与密码，需要根据自己的设置
	static final String USER = "root";
	static final String PASS = "root";

	public static void main(String[] args) throws SQLException {
		Connection conn=null;
		Statement stmt=null;
		ResultSet resultSet =null;
		try {
			//1、注册JDBC驱动
			Class.forName(JDBC_DRIVER);
			
			//2、打开连接
			System.out.println("连接数据库...");
			conn=DriverManager.getConnection(DB_URL, USER, PASS);
			
			//3、执行查询
			System.out.println("实例化statement对象");
			stmt=conn.createStatement();
			String sql="SELECT * FROM USER";
			resultSet = stmt.executeQuery(sql);
			
			//4、输出结果集
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String username = resultSet.getString("username");
				System.out.println("id ="+id+",username ="+username);
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}finally{
			//5、关闭连接
			resultSet.close();
			stmt.close();
			conn.close();
		}
		
		
	}

}

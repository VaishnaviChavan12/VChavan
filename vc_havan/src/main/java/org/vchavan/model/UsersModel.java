package org.vchavan.model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.sql.DataSource;

import org.vchavan.entity.User;

public class UsersModel {

	public List<User> listUsers(DataSource dataSource) {
		// Step 1: Initialize connection objects
		List<User> listUsers = new ArrayList<>(); 
        Connection connect = null;
        Statement stmt = null;
        ResultSet rs = null;
        
        try {
			connect = dataSource.getConnection();
			
			// Step 2: Create a SQL statements string
			String query = "Select * from users";
			stmt = connect.createStatement();

			// Step 3: Execute SQL query
         rs = stmt.executeQuery(query);
         
			// Step 4: Process the result set
			while(rs.next()){
				listUsers.add(new User(rs.getInt("empID"), rs.getString("empName"), rs.getString("Designation"),rs.getInt("Salary")));
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return listUsers;
	}

	public boolean addUser(DataSource dataSource,User newUser) {
		Connection connect = null;
        PreparedStatement stmt = null;
     
        try {
			connect = dataSource.getConnection();
			String name=newUser.getempName();
			String designation=newUser.getDesignation();
			int salary=newUser.getSalary();
			
			// Step 2: Create a SQL statements string
			String query = "insert into users(empName,Designation,Salary) values(?,?,?)";
			stmt = connect.prepareStatement(query);
			stmt.setString(1,name);
			stmt.setString(2,designation);
			stmt.setInt(3,salary);
			return stmt.execute();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        finally {
        	try {
				connect.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
	}

	public boolean updateUser(DataSource dataSource, User updateUser) {
		Connection connect = null;
        PreparedStatement stmt = null;
     
        try {
			connect = dataSource.getConnection();
			int empID=updateUser.getempID();
			String name=updateUser.getempName();
			String designation=updateUser.getDesignation();
			int salary=updateUser.getSalary();
			
			// Step 2: Create a SQL statements string
			String query = "update users set empName=? , Designation=? , Salary=? where empID=?";
			stmt = connect.prepareStatement(query);
			stmt.setString(1,name);
			stmt.setString(2,designation);
			stmt.setInt(3,salary);
			stmt.setInt(4,empID);
			return stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        finally {
        	try {
				connect.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
	}

	public boolean deleteUser(DataSource dataSource,int empID) {
		// TODO Auto-generated method stub
		Connection connect = null;
        PreparedStatement stmt = null;
     
        try {
			connect = dataSource.getConnection();
			
			// Step 2: Create a SQL statements string
			String query = "delete from users where empID=?";
			stmt = connect.prepareStatement(query);
			stmt.setInt(1,empID);
			return stmt.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
        finally {
        	try {
				connect.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        }
	}

}

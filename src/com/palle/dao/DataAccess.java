package com.palle.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.palle.model.Customer;

public class DataAccess 
{
	private  final static String dbUrl="jdbc:mysql://localhost:3306/servlet";
	private final static String dbUserName="root";
	private final static String dbPassword="admin";
	
	private static Connection con=null;
	private static Statement s=null;
	private static PreparedStatement ps =null;
	private static ResultSet rs=null;
	
	private static final String insertQry="insert into"
			+ " customer(name, email, mobile, password,state) values(?,?,?,?,?)";
	
	private static final String validateQry= "select email, password from customer where email=? and password=?";
	
	public static  boolean validateCustomer(String email, String password)
	{
		boolean b =false;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			ps=con.prepareStatement(validateQry);
			ps.setString(1, email);
			ps.setString(2, password);
			
			rs=ps.executeQuery();
			
			b=rs.next();
			
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(rs!=null)
				{
					rs.close();	
				}
				if(ps!=null)
				{
					ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
				
			}
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}
		return b;
	}
	
	public static void insertCustomer(Customer customer)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
			
			ps= con.prepareStatement(insertQry);
			ps.setString(1,customer.getName());
			ps.setString(2, customer.getEmail());
			ps.setLong(3, customer.getMobile());
			ps.setString(4,customer.getPassord());
			ps.setString(5, customer.getState());
			
			ps.executeUpdate();
		} 
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		} catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(ps!=null)
				{
					ps.close();
				}
				if(con!=null)
				{
					con.close();
				}
				
			}
			catch (SQLException e) 
			{
				
				e.printStackTrace();
			}
		}
		
		
	}

}

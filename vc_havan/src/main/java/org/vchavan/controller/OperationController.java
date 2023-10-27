package org.vchavan.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.vchavan.entity.User;
import org.vchavan.model.UsersModel;

@WebServlet("/operation")
public class OperationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Resource(name = "jdbc/project")
	private DataSource dataSource;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page=request.getParameter("page");
		page=page.toLowerCase();
		
		switch(page)
		{
		case "listusers":
			usersList(request, response);
			break;
		case "adduser":
			adduser(request, response);
			break;
		case "updateuser":
			updateuser(request, response);
			break;
		case "deleteuser":
			deleteuser(Integer.parseInt(request.getParameter("empID")));
			usersList(request,response);
			break;
		default:
			request.setAttribute("title", "Error Page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
			
		}
	}


	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("form");
		operation=operation.toLowerCase();
		switch(operation) {
		case "adduseroperation":
			User newUser=new User(request.getParameter("empName"),request.getParameter("Designation"),Integer.parseInt(request.getParameter("Salary")));
			addUserOperation(newUser);
			usersList(request,response);
			break;
		case "updateuseroperation":
			User updateUser=new User(Integer.parseInt(request.getParameter("empID")),request.getParameter("empName"),request.getParameter("Designation"),Integer.parseInt(request.getParameter("Salary")));
			updateUserOperation(dataSource,updateUser);
			usersList(request,response);
			break;
		default:
			request.setAttribute("title", "Error Page");
			request.getRequestDispatcher("error.jsp").forward(request, response);
		}
	}
	
	private void updateUserOperation(DataSource datasource,User updateUser) {
		new UsersModel().updateUser(dataSource,updateUser);
		return;
	}


	private void addUserOperation(User newUser) {
		new UsersModel().addUser(dataSource,newUser);
		return;
	}
	
	private void deleteuser(int empID) {
		// TODO Auto-generated method stub
		new UsersModel().deleteUser(dataSource,empID);
		return;
	}
	
	private void updateuser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("updateuser.jsp").forward(request, response);		
	}

	public void usersList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<org.vchavan.entity.User> listUsers = new ArrayList<>();
		listUsers = (List<org.vchavan.entity.User>) new UsersModel().listUsers(dataSource);
		request.setAttribute("listUsers", listUsers);
		request.getRequestDispatcher("listUsers.jsp").forward(request, response);
	}
	
	public void adduser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		request.getRequestDispatcher("adduser.jsp").forward(request, response);
	}
	

}

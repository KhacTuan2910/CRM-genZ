package com.cybersoft.java14.crm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cybersoft.java14.crm.service.UserService;
import com.cybersoft.java14.crm.util.JspConst;
import com.cybersoft.java14.crm.util.UrlConst;

@WebServlet(name = "userServlet", urlPatterns = {
		UrlConst.USER_DASHBOARD,
		UrlConst.USER_ADD,
		UrlConst.USER_REMOVE,
		UrlConst.USER_UPDATE
})
public class UserServlet extends HttpServlet {
	private UserService userService;
	private String action;
	
	
	@Override
	public void init() throws ServletException {
		super.init();
		userService = new UserService();
		action = "";
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		action = req.getServletPath();
		super.service(req, resp);
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		switch (action) {
		case UrlConst.USER_DASHBOARD:
			req.getRequestDispatcher(JspConst.USER_DASHBOARD)
				.forward(req, resp);
			break;

		default:
			break;
		}
	}
}

package com.shoppingstreet.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shoppingstreet.entity.User;
import com.shoppingstreet.service.UserService;
import com.shoppingstreet.service.impl.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		String saveLogin = request.getParameter("saveLogin");

		if(loginName=="" || password==""){
			request.setAttribute("errorMsg", "�û��������벻��Ϊ��");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else{

			UserService userService = new UserServiceImpl();
			User user = userService.getLoginUser(loginName, password);
			if(user!=null){
				//System.out.println("��¼�ɹ�");
				//response.sendRedirect("index.html");
	//			request.getRequestDispatcher("index.html").forward(request, response);
				
				HttpSession session = request.getSession();
				session.setAttribute("user", user);

				if (saveLogin != null ){
					Cookie cookie = new Cookie("loginName",loginName);
					cookie.setMaxAge(24*3600);
					response.addCookie(cookie);
				}
				else {
					request.setAttribute("loginName",loginName);
				}
				request.getRequestDispatcher("index.jsp").forward(request, response);
			}else{
				System.out.println("��¼ʧ��");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

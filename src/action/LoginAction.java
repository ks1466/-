package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAO;
import vo.UserVO;

/**
 * Servlet implementation class LoginAction
 */
@WebServlet("/login.do")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		//userID=asd&userPassword=asd
		String userID = request.getParameter("userID");
		String userPassword = request.getParameter("userPassword");
		
		System.out.println(userID + " / " + userPassword);
		UserVO user = UserDAO.getInstance().selectOne(userID);
		
		String param = "";
		String resultStr = "";
		
		//id 불일치
		if( user == null ) {
			param ="no_id";
			resultStr = String.format("[{'param':'%s'}]", param);
			response.getWriter().println(resultStr);
			return;
		}
		//비밀번호 불일치
		if( !user.getUserPassword().equals(userPassword)) {
			param ="no_pwd";
			resultStr = String.format("[{'param':'%s'}]", param);
			response.getWriter().println(resultStr);
			return;
		}
		
		//아이디와 비밀번호 체크에 문제가 없다면 세션에 user정보를 저장한다.
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		session.setMaxInactiveInterval(3600);
		
		param = "clear";
		resultStr = String.format("[{'param':'%s'}]", param);
		response.getWriter().println(resultStr); 
		
		/*
		System.out.println(userID);
		System.out.println(userPassword);
		UserVO user = new UserVO();
		user.setUserID(userID);
		user.setUserPassword(userPassword);
		
		
		
		//response.sendRedirect("main.jsp");
		RequestDispatcher disp = request.getRequestDispatcher("main.jsp");
		disp.forward(request, response);
		*/
	}

}


















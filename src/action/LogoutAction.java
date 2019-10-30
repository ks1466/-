package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutAction
 */
@WebServlet("/logout.do")
public class LogoutAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//세션에 등록되어 있는 user를 삭제
				HttpSession session = request.getSession();
				session.removeAttribute("user");//바인딩 된 user정보 삭제
				
				RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
				disp.forward(request, response);
		
	}

}


















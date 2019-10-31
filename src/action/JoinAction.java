package action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDAO;
import vo.UserVO;

/**
 * Servlet implementation class JoinAction
 */
@WebServlet("/join.do")
public class JoinAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public JoinAction() {
        super();
        // TODO Auto-generated constructor stub
    }
	//http://localhost:8080/Booksystem/
	//joinAction.jsp?userID=asd&userPassword=asd&
	//userName=asd&userGender=%EB%82%A8%EC%9E%90&
	//userEmail=ks1466%40naver.com
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String userID = request.getParameter("userID").trim();
		System.out.println(userID);
		String userPassword = request.getParameter("userPassword").trim();
		String userName = request.getParameter("userName").trim();
		String userGender = request.getParameter("userGender").trim();
		System.out.println(userGender);
		String userEmail = request.getParameter("userEmail").trim();
		System.out.println(userEmail);
		String userTable = "10";// table 10 init
		
		
		UserVO user = new UserVO(userID , userPassword , userName , 
				userGender , userEmail , userTable);
		
		UserDAO dao = new UserDAO().getInstance();
		int is_join = dao.join(user);
		
		System.out.println(is_join);
		if(is_join == 1) {
			RequestDispatcher disp = request.getRequestDispatcher("login.jsp");
			disp.forward(request, response);
		}
		else {
			RequestDispatcher disp = request.getRequestDispatcher("join.jsp");
			disp.forward(request, response);
		}
	}

}




























package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import storage.Connectivity;
import vo.UserVO;


public class UserDAO {
	static UserDAO single = null;
	
	private Connection con = Connectivity.getConnection();
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public static UserDAO getInstance() {
		if(single == null)
			single = new UserDAO();
		
		return single;
	}
	
	public int join(UserVO user) {
		String SQL = "INSERT INTO USER VALUES(?,?,?,?,?)";
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, user.getUserID());
			pstmt.setString(2, user.getUserPassword());
			pstmt.setString(3, user.getUserName());
			pstmt.setString(4, user.getUserGender());
			pstmt.setString(5, user.getUserEmail());
			
			int n = pstmt.executeUpdate();
			System.out.println(n);
			return n;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return -1;//데이터베이스 오류
	}
	
	public UserVO selectOne(String userID) {
		String SQL = "SELECT * FROM USER "
				+ "WHERE userID = ?";
		
		UserVO user = null;
		
		try {
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, userID);
			
			rs = pstmt.executeQuery();

			if(rs.next()) {
				user = new UserVO();
				user.setUserID(rs.getString("userID"));
				user.setUserPassword(rs.getString("userPassword"));
				user.setUserName(rs.getString("userName"));
				user.setUserGender(rs.getString("userGender"));
				user.setUserEmail(rs.getString("userEmail"));
				System.out.println(user.getUserName());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
}
























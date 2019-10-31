package vo;
//http://localhost:8080/Booksystem/
	//joinAction.jsp?userID=asd&userPassword=asd&
	//userName=asd&userGender=%EB%82%A8%EC%9E%90&
	//userEmail=ks1466%40naver.com
public class UserVO {
	private String userID;
	private String userPassword;
	private String userName;
	private String userGender;
	private String userEmail;
	private String userTable;
	
	public UserVO() {
		
	}
	public UserVO(String userID , String userPassword ,
			String userName , String userGender , String userEmail, String userTable) {
		this.userID = userID;
		this.userPassword = userPassword;
		this.userName = userName;
		this.userGender = userGender;
		this.userEmail = userEmail;
		this.userTable = userTable;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserTable() {
		return userTable;
	}
	public void setUserTable(String userTable) {
		this.userTable = userTable;
	}
	
	
}

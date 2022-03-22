package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	private Connection  conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public UserDAO() {
		try {
			String dbURL = "jdbc:mysql://localhost:3306/bbs";
			String dbID = "root";
			String dbPassword = "root";
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(dbURL,dbID,dbPassword);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	
// 로그인 관련 매서드
	public int login(String userID, String userPassword) {
		String SQL = "SELECT userPassword FROM user WHERE userID = ?";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, userID);
			rs=pstmt.executeQuery();
			
			if(rs.next()) {
				// 아이디가 존재한다.
				if(rs.getString(1).equals(userPassword)) {
					// 로그인 성공
					return 100;
				}else {
					// 패스워드 불일치 
					return -100;
				}
			}else {
			//	실패
				return -200; // 아이디가 존재하지 않는다.
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return -300; // 데이터베이스 오류
			
	}
	
// 회원가입 관련 매서드
// public int join() {
//	}

}












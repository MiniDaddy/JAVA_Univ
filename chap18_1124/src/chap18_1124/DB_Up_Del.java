package chap18_1124;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Up_Del {
	public static void main(String[] args) {
		Connection conn;
		String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
		
		String id = "root";   // DB에 로그인할 ID
		String pw = "1234";   // MYSQL 설정 시 입력한 PASSWORD

		//sql문 실행을 위한 클래스 Statement
		Statement stmt=null;
		
		try {
			//1. JDBC 드라이버 로드.
			Class.forName("com.mysql.cj.jdbc.Driver");  
			
			//2. 데이터베이스 연결.
			//getConnection() 메소로 DB에 연결하여 Connection 객체 반환.
			conn = DriverManager.getConnection(url, id, pw);
			
			//3. Statement 생성
			stmt=conn.createStatement();
			
			//4. SQL문 전송
			//수정
//			stmt.executeUpdate("UPDATE student SET NAME='홍길동' WHERE ID='201855021'");
			//삭제
			stmt.executeUpdate("DELETE FROM student WHERE NAME='가나다'");
			
			//5. 결과 받기(메소드 호출)
			printTable(stmt);
			
			//6. 연결 해제
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 에러");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류. 데이터가 이미 존재함.");
		}
	}
	
	private static void printTable(Statement stmt) throws SQLException{
		//5. 결과 받기
		ResultSet result=stmt.executeQuery("SELECT * FROM student");
		
		while(result.next()) {
			System.out.print(result.getString("NAME"));
			System.out.print("\t|\t"+result.getString("ID"));
			System.out.println("\t|\t"+result.getString("DEPT"));
			
			//getString() 메소드는 해당 데이터 타입으로 '열' 값을 읽어옴
			//모든 데이터 타입에 대해 읽어오기 가능
			//필요시 데이터 타입 변환해야 함
		}
		System.out.println();
		
		//ResultSet 닫기
		result.close();
		
	}
}

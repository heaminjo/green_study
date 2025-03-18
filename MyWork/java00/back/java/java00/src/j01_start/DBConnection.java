package j01_start;

import java.sql.Connection;
import java.sql.DriverManager;

//** JDBC 드라이버
//=> DBMS와 통신을 담당하는 자바 클래스
//	 DBMS 별로 알맞은 JDBC 드라이버 필요
//	 보통 jar 파일로 제공

//** DriverManager
//=> JDK(Java SE Development Kit)의 정적 클래스이며,
//	 사용할 애플리케이션에 대해 사용가능한 JDBC(Java Database Connectivity) 드라이버 세트를 관리함.

public class DBConnection {
	
	public static Connection getConection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// => Connector mysql-connector-j-8.4.0.jar 내에서 "com.mysql.cj.jdbc.Driver" 를 찾음
			//    그러므로 실행전에 프로젝트에 ~.jar 연동  
			String url="jdbc:mysql://@127.0.0.1:3306/testdb?characterEncoding=UTF-8&serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
			Connection cn= DriverManager.getConnection(url,"root","mysql");
			System.out.println("** JDBC Connection 성공 **");
			return cn;
		} catch (Exception e) {
			System.out.println("** JDBC Connection Exception=> "+e.toString());
			return null;
		} //try
		
	} //getConection

} //class

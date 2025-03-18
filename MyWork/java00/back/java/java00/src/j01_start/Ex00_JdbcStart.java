package j01_start;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex00_JdbcStart {
	// ** 전역변수 정의
	static Connection cn=DBConnection.getConection();
	static Statement st; //Sql 구문 처리
	static PreparedStatement pst;
	static ResultSet rs; //결과 담당
	static String sql;
	
	// ** CRUD 구현
	// => select, insert, update, delete
 
	public static void selectList() {
		// 1) Connection => 전역변수에 정의
		// 2) SQL 구문 처리
		// => select * from friends;
		sql="select * from friends order by age desc";
		try {
			st=cn.createStatement();
			rs=st.executeQuery(sql);

			// 3) 결과 출력
			if (rs.next()) {
				// => 결과존재
				System.out.println("*********************************");
				System.out.println("        Friends List");
				System.out.println("*********************************");
				do {
					System.out.print(rs.getString("name")+" ");
					System.out.print(rs.getInt("age")+" ");
					System.out.print(rs.getString(3)+" ");
					System.out.print(rs.getString(4)+"\n");
				}while(rs.next());
			}else {
				System.out.println("** selectList: 출력 자료가 1건도 없습니다. **");
			}
		}catch (Exception e) {
			System.out.println("** selectList Exception => "+e.toString());
		} //catch
	} //selectList
	
	public static void selectOne(String name) {
		//=> select * from friends where name='홍길동' ; 
		sql="select * from friends where name='" + name + "'";
		try {
			st=cn.createStatement();
			rs=st.executeQuery(sql);
			if (rs.next()) {
				// => 결과존재
				System.out.println("** SelectOne **");
				do {
					System.out.print(rs.getString("name")+" ");
					System.out.print(rs.getInt("age")+" ");
					System.out.print(rs.getString(3)+" ");
					System.out.print(rs.getString(4)+"\n");
				}while(rs.next());
			}else {
				System.out.println("** selectOne: 출력 자료가 1건도 없습니다. **");
			}
		}catch (Exception e) {
			System.out.println("** selectOne Exception => "+e.toString());
		} //catch
	} //selectOne
	
	public static void main(String[] args) {
		// 1) Connection 확인
		System.out.println("** DB 연결확인 => "+cn);
		 
		// ** 메뉴 기능 추가, 반복문 적용하기
		// => 1.List 2.내정보 3.종료
		
		Scanner sc = new Scanner(System.in);
		String menu ;
		do {
			System.out.println("\n** 메뉴를 선택하세요 (1.List  2.내정보  3.종료) => ");
			menu = sc.nextLine();
			
			switch(menu) {
			case "1": selectList(); break;
			case "2": System.out.println("** 이름을 입력하세요 => ");
					  String name = sc.nextLine();
					  selectOne(name); 
					  break;
			case "3": System.out.println("** 종료, menu => "+menu); break;
			default : System.out.println("** 메뉴 선택 오류 **"); 
			} //switch
			
		}while(!menu.equals("3")); 
		//=> menu 가 "3" 이면 종료, 아니면 계속 
		//=> menu != "3" 오류 (String 은 "==" 아니고 equals 로 비교해야함 )
		
		// 2) FriendsList
		// 3) 내정보 보기
		//=> 이름을 입력 받아서 출력하기
			
		sc.close(); 
	} //main

} //class

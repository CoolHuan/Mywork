package jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.sql.Connection;

import com.sun.org.apache.bcel.internal.generic.Select;

public class GetConnection{
	public static void main(String[] args){
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("成功加载MySQL驱动程序");
			}catch(ClassNotFoundException e1){
				System.out.println("找不到SQL驱动程序");
				e1.printStackTrace();
			}
			
			String url="jdbc:mysql://localhost:3306/student";
			Connection conn;
			try{
				conn=DriverManager.getConnection(url, "root", "root");
				Statement stmt=conn.createStatement();
				System.out.println("成功连接到数据库");
				
				String sql="Select * from stu";
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println("学号\t"+"姓名\t"+"年龄");
				while(rs.next()){
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getInt(3));
					System.out.println();
				}
				stmt.close();
				conn.close();
				rs.close();
			}catch(SQLException e){
		
				e.printStackTrace();
	
			}
		}
}

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
				System.out.println("�ɹ�����MySQL��������");
			}catch(ClassNotFoundException e1){
				System.out.println("�Ҳ���SQL��������");
				e1.printStackTrace();
			}
			
			String url="jdbc:mysql://localhost:3306/student";
			Connection conn;
			try{
				conn=DriverManager.getConnection(url, "root", "root");
				Statement stmt=conn.createStatement();
				System.out.println("�ɹ����ӵ����ݿ�");
				
				String sql="Select * from stu";
				ResultSet rs=stmt.executeQuery(sql);
				System.out.println("ѧ��\t"+"����\t"+"����");
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

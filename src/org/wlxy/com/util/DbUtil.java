package org.wlxy.com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {

	private static String dbUrl="jdbc:mysql://127.0.0.1:3306/db_studentInfo?autoReconnect=true";
	private static String dbUserName="root";
	private static String dbPassword="123456";
	private static String jdbcName="com.mysql.jdbc.Driver";
	
	static {

        try {
            Class.forName(jdbcName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
	}
	
	/**
	 * ��ȡ���ݿ�����
	 * @return
	 * @throws Exception
	 */
	public static Connection getCon() throws Exception{
		Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
		return con;
	}
	
	/**
	 * �ر����ݿ�����
	 * @param con
	 * @throws Exception
	 */
	public static void closeCon(Connection con) throws Exception{
		if(con!=null){
			con.close();
		}
	}
	
	public static void main(String[] args) {
		
		try {
		    Connection con= DbUtil.getCon();
			System.out.println("���ݿ����ӳɹ� "+con.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

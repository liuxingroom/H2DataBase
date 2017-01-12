package com.jiuhua.h2.user.utils;

import java.sql.Connection;


import org.h2.jdbcx.JdbcConnectionPool;

/**
 * ��ȡ���ݿ����ӵĹ�����
 * @author jiuhua
 *
 */
public class ConnectionManager {
	
	public static  Connection  conn=null;
	
	public static Connection getConnection(){
		
		try{
			if(conn==null){
				//����h2���ݿ�����
				Class.forName("org.h2.Driver");
				//��ȡ����
				JdbcConnectionPool connectionPool=JdbcConnectionPool.create("jdbc:h2:D:\\h2\\db\\test", "sa", "");
				conn=connectionPool.getConnection();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
		
	}
}

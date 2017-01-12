package com.jiuhua.h2.user.utils;

import java.sql.Connection;


import org.h2.jdbcx.JdbcConnectionPool;

/**
 * 获取数据库连接的工具类
 * @author jiuhua
 *
 */
public class ConnectionManager {
	
	public static  Connection  conn=null;
	
	public static Connection getConnection(){
		
		try{
			if(conn==null){
				//加载h2数据库驱动
				Class.forName("org.h2.Driver");
				//获取连接
				JdbcConnectionPool connectionPool=JdbcConnectionPool.create("jdbc:h2:D:\\h2\\db\\test", "sa", "");
				conn=connectionPool.getConnection();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return conn;
		
	}
}

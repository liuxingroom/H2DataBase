package com.jiuhua.h2.user.utils;

import java.util.UUID;

public class H2DBFunctionExt {
	
   /**
     * 用法：SELECT uuid();
     * H2数据库注册uuid函数：CREATE ALIAS uuid FOR "h2db.function.ext.H2DBFunctionExt.uuid";
     *
     * @return
     */ 
     public static String uuid(){
         return UUID.randomUUID().toString();
     }
}

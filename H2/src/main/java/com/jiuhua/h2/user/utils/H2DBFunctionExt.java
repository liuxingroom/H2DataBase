package com.jiuhua.h2.user.utils;

import java.util.UUID;

public class H2DBFunctionExt {
	
   /**
     * �÷���SELECT uuid();
     * H2���ݿ�ע��uuid������CREATE ALIAS uuid FOR "h2db.function.ext.H2DBFunctionExt.uuid";
     *
     * @return
     */ 
     public static String uuid(){
         return UUID.randomUUID().toString();
     }
}

package com.jiuhua.h2.user.utils;

import java.lang.reflect.Field;

import org.junit.Test;



public class NvlFunction {
	public static Object nvl(Object obj){
		Class clz=obj.getClass();
		 // 获取实体类的所有属性，返回Field数组
		Field [] fields=clz.getDeclaredFields();
		for(Field field:fields){
			if(field.getGenericType().toString().contains("java.lang.String")){
				String str=(String) obj;
				if(str!=null && str!=""){
					return str;
				}else{
					return "";
				}
			}
			
			if(field.getGenericType().toString().contains("java.lang.Integer")){
				Integer integer=(Integer) obj;
				if(integer!=0 && integer!=null){
					return integer;
				}else{
					return 0;
				}
			}
			if(field.getGenericType().toString().contains("java.lang.Double")){
				Double double1=(Double) obj;
				if(double1!=null){
					return double1;
				}else{
					return 0.0;
				}
			}
			
			if(field.getGenericType().toString().contains("class java.lang.Boolean")){
				Boolean bool=(Boolean) obj;
				if(bool!=null){
					return bool;
				}else{
					return true;
				}
			}
			
			
			if(field.getGenericType().toString().contains("java.lang.Short")){
				Short short1=(Short) obj;
				if(short1!=null){
					return short1;
				}else{
					return (short)0;
				}
			}


		}
		
		return null;
	}
	
	@Test
	public  void testNvl(){
//		Field [] field=String.class.getFields();
		Field [] field=Boolean.class.getFields();
		for(int i=0;i<field.length;i++){
			System.out.println(field[i].getGenericType().toString());
		}
	}
}

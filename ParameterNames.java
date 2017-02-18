package com.rajpro;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ParameterNames {
	public static void main(String[] args) throws Exception {
//		Method method = ParameterNames.class.getMethod("main", String[].class);
//		Method method = ParameterNames.class.getMethod("getCalculation_static", Integer.class,Integer.class,Integer.class);
		Method method = ParameterNames.class.getMethod("getCalculation", Integer.class,Integer.class);
		System.out.println(method.getReturnType());
		for (final Parameter parameter : method.getParameters()) {
			System.out.println("Parameter: " + parameter.getName());
		}
	}
	public Integer getCalculation(Integer no1,Integer getCalculation){
		return 0;
	}
	public static void getCalculation_static(Integer no1,Integer getCalculation,Integer result){
		
	}
}

package com.rajpro;

import java.util.ArrayList;
import java.util.Arrays;

import sun.font.CreatedFontTracker;

public class LamdaExpressions {
	public static void main(String[] args) {
		try {
			ArrayList<String> al=new ArrayList<>();
			al.add("a");
			al.add("b");
			al.add("c");
			
			al.forEach( e -> System.out.println( e ) );
			
			System.out.println("-------------------");
			al.forEach((String e) -> System.out.println(e));
			
			System.out.println("-----------");
			al.forEach(e ->{
				System.out.println(e);
				System.out.println(e);
			});
			System.out.println("-----------");
			Arrays.asList( "a", "b", "d" ).forEach( e -> System.out.println( e ) );
			System.out.println("---------------");
			Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
			System.out.println("-------------");
			Arrays.asList( "a", "e", "d" ).sort( ( e1, e2 ) -> {
				int result = e1.compareTo( e2 );
				return result;
				} );
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}

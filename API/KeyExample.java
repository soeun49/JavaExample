package com.java.november.API;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		//key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		
		HashMap<Key,String> hashMap= new HashMap<Key,String>();
		
		//식별키로 이름을 저장
		hashMap.put(new Key(1), "홍길동");
		
		//식별키로 이름을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		

	}

}

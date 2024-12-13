package com.gn.study.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.study.model.vo.Snack;

public class MapRun {
	public static void main(String[] args) {
		// 1. HashMap 생성
		Map<String,Object> flower = new HashMap<String,Object>();
		// 2. HashMap 요소 추가
		flower.put("name","샌더소니아");
		flower.put("lang", "성공");
		flower.put("price", 40000);
		// 중복된 key 사용
		flower.put("price", 50000);
		System.out.println(flower);
		
		// 4. HashMap 요소 조회 (1)
		String f_name = (String)(flower.get("name"));
		System.out.println(f_name);
		System.out.println(flower.get("lang"));
		
//		// 6. HashMap 요소 조회(2)
//		// (1) HashMap 요소들의 key값으로 Set 만들기 -> key의 제네릭 사용
//		Set<String> keySet = flower.keySet();
//		// (2) Iterator 만들기
//		Iterator<String> itKey = keySet.iterator();
//		// (3) 손을 집어넣는다 -> hasNext()
//		while(itKey.hasNext()) {
//			// (4) 확인한다 -> next()
//			String key = itKey.next();
////			System.out.println(key);
//			Object value = flower.get(key);
//			System.out.println(key+":"+value);
//		}
//		
//		// (1) HashMap 요소들의 key+value 값으로 entrySet 만들기
//		Set<Entry<String,Object>> entrySet = flower.entrySet();
//		// (2) Iterator 만들기
//		Iterator<Entry<String,Object>> itEntry = entrySet.iterator();
//		// (3) hasNext()
//		while(itEntry.hasNext()) {
//			// (4) next()
//			Entry<String,Object> entry = itEntry.next();
//			String key = entry.getKey();
//			Object value = entry.getValue();
//			System.out.println(key+"="+value);
//		}
		
		
		// 3. HashMap<key,객체> 요소 추가
		Map<String,Snack> snackMap = new HashMap<String,Snack>();
		snackMap.put("다이제", new Snack("초코맛",1700));
		snackMap.put("새우깡", new Snack("매운맛",900));
		snackMap.put("포테이토칩", new Snack("양파맛",500));
		System.out.println(snackMap);
		
		// 5. HashMap<key,객체> 요소 조회(1)
		// Snack s1 = new Snack("초코맛",1700);
		Snack s1 = snackMap.get("다이제");
		System.out.println(s1);
		s1.setFlavor("기본맛");
		System.out.println(snackMap);
		// 포테이토칩 양파맛 -> 소금맛
		snackMap.get("포테이토칩").setFlavor("소금맛");
		System.out.println(snackMap);
		
		// 7. HashMap<객체> 요소 조회(2)
		// (1) keySet()
		Set<String> keySet = snackMap.keySet();
		Iterator<String> itKey = keySet.iterator();
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = snackMap.get(key);
			System.out.println(key+"::"+value);
		}
		// (2) entrySet()
		Set<Entry<String,Snack>> entrySet = snackMap.entrySet();
		Iterator<Entry<String,Snack>> itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<String,Snack> entry = itEntry.next();
			String key = entry.getKey();
			Snack value = entry.getValue();
			System.out.println(key+"=="+value);
		}
	}
}
package com.gn.practice10.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.gn.practice10.model.vo.Planet;

public class Main {
	public static void main(String[] args) {
		Map<String,Planet> map =
				new HashMap<String,Planet>();
		map.put("Mercury", new Planet("수성",4879,0.24));
		map.put("Venus", new Planet("금성",12104,0.62));
	    map.put("Earth", new Planet("지구", 12742, 1.0));
	    map.put("Mars", new Planet("화성", 6779, 1.88));
	    
	    System.out.println("*** keySet() -> getter ***");
	    Set<String> keySet = map.keySet();
	    Iterator<String> itKey = keySet.iterator();
	    while(itKey.hasNext()) {
	    	String key = itKey.next();
	    	Planet planet =map.get(key);
	    	// 행성 이름: Earth(지구), 지름: 12742 km, 공전주기: 1.0년
	    	String str = "";
	    	str += "행성 이름: "+key;
	    	str += "("+planet.getName()+"),";
	    	str += " 지름: "+planet.getDiameter()+"km,";
	    	str += " 공전주기: "+planet.getPeriod()+"년";
	    	System.out.println(str);		
	    }
	    System.out.println("*** entrySet() -> toString ***");
	    Set<Entry<String,Planet>> entrySet = map.entrySet();
	    Iterator<Entry<String,Planet>> itEntry = entrySet.iterator();
	    while(itEntry.hasNext()) {
	    	Entry<String,Planet> entry = itEntry.next();
	    	String key = entry.getKey();
	    	Planet value = entry.getValue();
	    	// 키: Earth, 값: 지구 (지름: 12742 km, 공전주기: 1.0년)
	    	String str = "";
	    	str += "키:"+key+",";
	    	str += " 값 : "+value;
	    	System.out.println(str);
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	}
}

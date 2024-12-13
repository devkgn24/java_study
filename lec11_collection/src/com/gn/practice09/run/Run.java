package com.gn.practice09.run;

import java.util.HashMap;
import java.util.Map;

import com.gn.practice09.model.vo.Information;

public class Run {
	public static void main(String[] args) {
		Map<String,Information> map =
				new HashMap<String,Information>();
		map.put("John", new Information("123-456-7890",3800000));
		map.put("Emma", new Information("987-654-3210",2300000));
		map.put("Tom", new Information("555-123-4567",4600000));

		System.out.println("변경전 : "+map);
		
		// map.put("John", new Information("123-456-7890",4100000));
		map.get("John").setSalary(4100000);
		
		// (1) Emma가 전화번호를 바꿨어요.
		map.get("Emma").setPhone("111-111-111");
		// (2) Emma정보 출력 -> getter
		System.out.println("===== Emma의 정보 =====");
		System.out.println("전화번호 : "+map.get("Emma").getPhone());
		System.out.println("월급 : "+map.get("Emma").getSalary());

				
		
		
		System.out.println("변경후 : "+map);
	}
}

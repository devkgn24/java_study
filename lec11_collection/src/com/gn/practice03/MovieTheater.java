package com.gn.practice03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieTheater {
	 public static void main(String[] args) {
		List<String> seats = new ArrayList<String>();
		seats.add("A2");
		seats.add("A1");
		seats.add("B2");
		seats.add("B1");
		
        System.out.println("초기 좌석 목록: " + seats);
        
        seats.add(2, "A3");
        System.out.println("A3 좌석 추가 후: " + seats);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("예약 좌석 : ");
        String reserved = sc.nextLine();
        
//        System.out.println("확인 : "+reserved);
        int idx = seats.indexOf(reserved);
        
        if(idx != -1) {
        	// A3 -> 2 -> 2번을 A3(예약)
        	// B2 -> 3 -> 3번을 B2(예약)
        	seats.set(idx, seats.get(idx)+"(예약)");
        }else {
        	System.out.println(reserved+"는(은) 존재하지 않는 좌석입니다.");
        }
        System.out.println("좌석 예약 후 : " + seats);

        
	}
}

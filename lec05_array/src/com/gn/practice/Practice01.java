package com.gn.practice;

public class Practice01 {
	public static void main(String[] args) {
		// 철수는 친구들의 이름을 배열에 넣고 싶어졌어요. 
		// 친구들 이름이 아래와 같다고 할때, 
		// 친구들의 이름을 담고 있는 배열 friends를 구성하세요.
		// 박지영, 김태우, 이지훈, 최유진, 정승호
		// 인덱스, 선언+초기화
//		String[] friends = new String[5];
//		friends[0] = "박지영" ;
//		friends[1] = "김태우";
//		friends[2] = "이지훈";
//		friends[3] = "최유진";
//		friends[4] = "정승호";
		
//		String[] friends = new String[]{"박지영","김태우","이지훈","최유진","정승호"};
		String[] friends = {"박지영","김태우","이지훈","최유진","정승호"};
		
		// 홀수번째에 있는 친구들만 출력하기
//		1 : 박지영
//		3 : 이지훈
//		5 : 정승호
		
//		System.out.println(friends[0]);
//		System.out.println(friends[1]);
//		System.out.println(friends[2]);
//		System.out.println(friends[3]);
//		System.out.println(friends[4]);
		
		for(int i = 0 ; i < friends.length ; i++) {
			// 데이터의 위치가 홀수 위치일때
			if((i+1) % 2 != 0) {
				System.out.println((i+1)+" : "+friends[i]);
			}
		}
		
	}
}

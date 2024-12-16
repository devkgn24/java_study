package com.gn.study.practice01;

public class Run {
	public static void main(String[] args) {
		
		//크기가 1,000,000인 정수 배열을 생성하세요.
		int[] arr = new int[1000000];
		//그 다음 랜덤값(1~100사이)으로 해당 배열을 초기화하세요.
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		//System.arraycopy()를 사용하여 이 배열의 절반을 새로운 배열로 복사하세요.
		int[] dst = new int[arr.length/2];
		System.arraycopy(arr, 0, dst, 0, dst.length);
		
		//복사된 배열의 값을 출력예시와 같은 모양으로 출력하세요.
		// System.curentTimeMillis()를 사용하여 기능 구현에 소요되는 시간을 측정하여 출력하세요.
		
	}
}

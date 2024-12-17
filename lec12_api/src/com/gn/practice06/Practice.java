package com.gn.practice06;

public class Practice {
	public String builderTest() {
		StringBuilder sb 
		= new StringBuilder("WELCOME TO JAVA");
		sb.append("!");
		sb.insert(0, "<<");
//		sb.delete(10, 12+1);
		int idx1 = sb.indexOf(" ");
		int idx2 = sb.lastIndexOf(" ");
//		System.out.println(idx1 +" : "+idx2);
		sb.delete(idx1, idx2);
		sb.reverse();
//		System.out.println(sb);
		return sb.toString();
	}
}

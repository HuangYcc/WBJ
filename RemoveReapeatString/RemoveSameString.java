package com.njwb.zuoye3.ex3;

import java.util.*;


/**
 * 给字符串去重复:从控制台给一个字符串sssaw2, 压缩字符串为saw2
 * 
 * @author Administrator
 * 
 */
public class RemoveSameString {

	public static void main(String[] args) {
		String str = "aababccd";
		System.out.println(sub(str));
	}

	static String sub(String str){
		List list = new ArrayList();
		StringBuffer sb = new StringBuffer(str);
		int j=0;
		for(int i=0; i<str.length(); i++){
			if(list.contains(str.charAt(i))){
				sb.deleteCharAt(i-j);     //String 是没有delete方法的
				j++; //因为删除了sb中的字符，有一个偏移
			}else{
				list.add(str.charAt(i));
			}
		}
		return sb.toString();//abcd
	}
}


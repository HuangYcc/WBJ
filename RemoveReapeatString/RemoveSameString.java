package com.njwb.zuoye3.ex3;

import java.util.*;


/**
 * ���ַ���ȥ�ظ�:�ӿ���̨��һ���ַ���sssaw2, ѹ���ַ���Ϊsaw2
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
				sb.deleteCharAt(i-j);     //String ��û��delete������
				j++; //��Ϊɾ����sb�е��ַ�����һ��ƫ��
			}else{
				list.add(str.charAt(i));
			}
		}
		return sb.toString();//abcd
	}
}


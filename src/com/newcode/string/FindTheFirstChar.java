package com.newcode.string;

import java.util.HashMap;
import java.util.Map;
/**
 * 寻找字符串中第一个只出现一次的字符
 * 
 * @author admin
 *
 */
public class FindTheFirstChar {
	
	public static void main(String[] args) {
		new FindTheFirstChar().findChar("bcdab");
	}
	
	
	
	public  void findChar(String str){
		
		char [] ch = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(char c :ch){
			
			if(map.containsKey(c)){
				map.put(c, map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer>  m: map.entrySet()){
			if(m.getValue()==1){
				System.out.println(m.getKey());
				break ;
			}
		}
		
	}

}

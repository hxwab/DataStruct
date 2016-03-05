package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AddDigit {
	
	public static void main(String[] args) {
		AddDigit a = new AddDigit();
		System.out.println(a.addDigits(19));
		System.out.println(a.isAnagram0("abcdea", "adebca"));
				
	}
	
	
	public boolean isAnagram0(String s ,String t){
		char[] sc= new char[26];
		char[] tc = new char[26];
		
		if(s==null&&t==null){
			return true;
		}
		
		if(s.length()!=t.length()){
			return false;
		}
		
		char[] cs = s.toCharArray();
		char[] ts = t.toCharArray();
		
		
		for( char c:cs){
			sc[c-'a']++;
			
		}
		
		for(char c: ts){
			tc[c-'a']++;
		}

		//return  new String(sc).equals(new String(tc));
		return  sc.equals(tc);
	}
	
public boolean isAnagram(String s, String t) {
        
        Map<Character,Integer> maps = new HashMap<Character,Integer>();
        Map<Character,Integer> mapt = new HashMap<Character,Integer>();
        boolean  isAnagram = true;
        
        if(s.length()!=t.length()){
        	return false;
        }
        for(int i =0 ; i<s.length();i++){
            maps.put(s.charAt(i),maps.get(s.charAt(i))==null?1:(Integer)maps.get(s.charAt(i))+1);
            mapt.put(t.charAt(i),mapt.get(t.charAt(i))==null?1:(Integer)mapt.get(t.charAt(i))+1);
        }
        

        if(maps.size()!=mapt.size()){
        	return false;
        }
        for (Map.Entry<Character, Integer> entry : maps.entrySet()) {
        	   System.out.println("key= " + entry.getKey() + " and value= " + entry.getValue());
        	if(entry.getValue()!=mapt.get(entry.getKey())) 
        		isAnagram=false;
        	break;
        }
        
        for(char key:maps.keySet()){
        	System.out.println("key:"+key +"value:"+maps.get(key));
        }
        
        for(Integer value : maps.values()){
        	System.out.println(value);
        }
        
        return isAnagram;
        
        
    }
	
	
	 public int addDigits(int num) {
//	        int a =num/10;
//	        int b=num%10;
//	        if(a+b>9)
//	        	addDigits(a+b);
//	        return a+b;
		 
		 
	      return (num-1)%9+1;
	            
	        
	    }
}

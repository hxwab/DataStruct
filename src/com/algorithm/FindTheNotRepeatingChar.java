package com.algorithm;

/**
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符的位置。若为空串，返回-1。位置索引从0开始
 * @author csdc
 *全部映射到bitMap，然后根据字符的顺序遍历出对应值为1的
 */
public class FindTheNotRepeatingChar {

	
	public int FirstNotRepeating(String str) {
		
		int [] map = new int[52];
		if(str==null) return -1;
		if(str.length()==0) return -1;
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				map[str.charAt(i)-'a']++;
			}else{
				map[str.charAt(i)-'A'+26]++;
			}
		}
		
		
		for(int i=0;i<str.length();i++){
			
			if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
				if(map[str.charAt(i)-'a']==1){
					return i;
				}
			}else{
				
				if(map[str.charAt(i)-'A'+26]==1){
					return i;
				}
			}
		}
		
		
        return -1;
    }
	
}

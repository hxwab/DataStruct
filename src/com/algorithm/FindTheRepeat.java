package com.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 假设有十组数据，每一组数据中都可能有重复的，要求找出十组数据中共有的数据
 * @author csdc
 *1、倒排索引法
 *
 *倒排索引法  1:[1,1,2,3,]   2:[1,2,4,]  3:[2,3]
 数据     组别            hashMap(int key,Set set)
  1           1,2
  2           1,2,3
  3           1,3
  4           2
找出包含所有组别的那个数据
 */
public class FindTheRepeat {
      private HashMap<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
	
      
      public static void main(String[] args) {
		
    	  int  [][] a  = new int[][]{{1,1,2,3},{1,2,4,2},{2,3,3,3,}};
    	  new FindTheRepeat().getTheRepeatNum(a);
    	  
	}
	
	
	public int getTheRepeatNum(int [][] a){
		statics(a);
		for(Map.Entry<Integer, Set<Integer>> m :map.entrySet()){
			
			if(m.getValue().size()==a.length)
				System.out.println(m.getKey());
			
		}
		
		return 0;
		
	}
	
	
	public void  statics(int [][]a){
		int col = a[0].length;
		int line = a.length;
		for(int i = 0;i<line;i++){
			
			for(int j=0;j<col;j++){
				
				if(map.containsKey(a[i][j])){
					Set<Integer> set= map.get(a[i][j]);
					set.add(i);
					map.put(a[i][j], set);
				}else {
					Set<Integer> set = new HashSet<Integer>();
					set.add(i);
					map.put(a[i][j], set);
				}
			}
		}
	}
	
	
}

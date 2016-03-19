package com.trianning;

import java.util.ArrayList;
import java.util.List;

/**
 * n个人围成一圈报数，报到3的退出，下面接着从1开始报，问最后剩下的是谁？
复制代码
 * @author admin
 *
 */
public class ThreeBack {
	
	public final static  int  NUM = 9;
    public static  List<Integer>  list = new ArrayList<Integer>();
	int index;
    int m;
    
    
    public static void main(String[] args) {
		
    	new ThreeBack().getLastNum(list);
	}
    
    
    public void getLastNum(List<Integer> list){
    	init();
    	while(true){
			m++;
    		if(m<3){
    			next(list);
    		}else{
    			remove(list);
    			m=0;
    		}
    		
    		if(list.size()==1)
    			break;
    	}
    	
    	System.out.println(list.get(0));
    	
    }
    
    
    
    
    public void init(){
    	index =-0;
    	m=0;
    	list.clear();
    	for(int i=1;i<NUM +1;i++){
    		list.add(i);
    	}
    }
	
    
    
    public void next(List<Integer> list){
    	index++;
    	if(index==list.size())
    		index=0;
    }
    
    
    public void remove(List<Integer> list){
    	list.remove(index);

    	if(index==list.size()){
    		index=0;
    	}
    }
	
	
}
	


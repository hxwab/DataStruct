package com.trianning;

import java.util.Scanner;

public class PlayCard {
	
	private  String [] s1;
	private String [] s2;
	private String str1;
	private String str2;
	
	
	public static void main(String[] args) {
		 System.out.println(new PlayCard().theBigOne());
	}
	
	public PlayCard() {
		Scanner sc = new Scanner(System.in);
		String [] str = sc.nextLine().split("-"); 
		str1 = str[0];
		str2 = str[1];
		s1 = str1.split(" ");
		s2 = str2.split(" ");
	}
	
	
	public String theBigOne(){
		String  result=null;
		
		if(s1.length==s2.length){
		
				result = count(s1[0])>count(s2[0])?str1:str2;
		} else {
			
			if(s1.length==4||s2.length==4){
				if(!str1.startsWith("joker")&&!str2.startsWith("joker")){
					result = s1.length==4?str1:str2;
				}else{
					result = str1.startsWith("joker")?str1:str2;
				}
			}else if(str1.startsWith("joker")||str2.startsWith("joker"))  {
				result = str1.startsWith("joker")?str1:str2;
			}else {
				result = "ERROR";
			}
			
		}
		
		return result;
	}
	
	private static int count(String str) {
        return "345678910JQKA2jokerJOKER".indexOf(str);
	}
	
}

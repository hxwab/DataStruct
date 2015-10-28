package com.dongtaiguihua;

public class CoinsChange {
	
	 /**  
     * Ӳ�����㣺��̬�滮�㷨  
     *   
     * @param values  
     *            :����ÿһ��Ӳ�ҵı�ֵ������  
     * @param valueKinds  
     *            :��ֵ��ͬ��Ӳ��������������coinValue[]����Ĵ�С  
     * @param money  
     *            :��Ҫ�������ֵ  
     * @param coinsUsed  
     *            :������ֵΪi��ֽ�������������СӲ����  
     *            
     *  ״̬ת�Ʒ��̣�
     *     d(i)=min{ d(i-vj)+1 }������i-vj >=0��vj��ʾ��j��Ӳ�ҵ���ֵ;  
     *     
     *     d(5)=min{d(5-5)+1,d(5-1)+1}
     *     d(17)=min{d(17-10)+1,d(17-5)+1,d(17-1)+1}
     *     
     */ 
    public static void makeChange(int[] values, int valueKinds, int money,  
            int[] coinsUsed) {  
 
        coinsUsed[0] = 0;  
        // ��ÿһ��Ǯ�����㣬������������Ľ��Ա��ã������  
        for (int cents = 1; cents <= money; cents++) {  
 
            // ������С��ֵ��Ӳ������ʱ������Ӳ��������� 
            int minCoins = cents;  
 
            // ����ÿһ����ֵ��Ӳ�ң����Ƿ����Ϊ���������֮һ  
            for (int kind = 0; kind < valueKinds; kind++) {               
                // ����ǰ��ֵ��Ӳ��С�ڵ�ǰ��cents��ֽ����Ⲣ���  
                if (values[kind] <= cents) {  
                    int temp = coinsUsed[cents - values[kind]] + 1;  
                    if (temp < minCoins) {  
                        minCoins = temp;  
                    }  
                }  
            }  
            // ������СӲ����  
            coinsUsed[cents] = minCoins;  
 
            System.out.println("��ֵΪ " + (cents) + " ����СӲ���� : " 
                    + coinsUsed[cents]);  
        }  
    }  
      
    public static void main(String[] args) {  
 
        // Ӳ����ֵԤ���Ѿ����������� 
        int[] coinValue = new int[] { 1,2,5,10,20,50 };  
        // ��Ҫ�������ֵ  
        int money = 49;  
        // ����ÿһ����ֵ�����������СӲ������0�ŵ�Ԫ�������ã�����Ҫ���1 
        int[] coinsUsed = new int[money + 1];  
 
        makeChange(coinValue, coinValue.length, money, coinsUsed);  
    }  

}

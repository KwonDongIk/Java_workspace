package com.yedam.api;

public class TimeExe {
	
	public static void main(String[] args) {
		// ?분 ?초 합은 ? 입니다. 출력
		// 1부터 10000000000 까지 짝수합을 구하는 시간
		
		
		long startTime = System.currentTimeMillis();
		
		long sum = 0;
		
		// System.out.println(Integer.MAX_VALUE); // int +- 21억
		
		for (long i = 1; i <= 10000000000L; i++){
			
			if(i % 250 == 0) {
				
			sum += i;
			
			}
			
		}
		
		long endTime = System.currentTimeMillis();
		
		long actualTime = endTime - startTime;
		
		
		long minutes = (actualTime / 1000) / 60;
		long seconds = (actualTime / 1000) % 60;
		
		System.out.println("걸린 시간은 " + minutes + " 분 " + seconds + " 초 입니다.");
		System.out.println("합은 : " + sum + " 입니다.");
		
		
		
		
		
		
	}

}

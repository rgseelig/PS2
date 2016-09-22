package base;

public class MyInteger {
	
	private int iValue;
	
	public MyInteger(int iValue){
		this.iValue = iValue;
	}
	
	public int getiValue(){
		return this.iValue;
	}
	
	public boolean isEven(){
		if(iValue % 2 == 0){
			return true;
		}
		else {return false;}
		
	}
	
	public boolean isOdd(){
		if(iValue %2 != 0){
			return true;
		}
		else {return false;}
	}
	public boolean isPrime(){
		boolean answer = true;
		
		
		for(int i = 2; i < iValue; i++){
			if (iValue < 2) {
				answer = false;
			}
			else if (iValue % i == 0){
				answer = false;
			}
		}
		return answer;
	}
	
	public static boolean isEven(int number){
		if (number %2 == 0){
			return true;
		}
		else {return false;}
	}
	public static boolean isOdd(int number){
		if (number % 2 != 0){
			return true;
		} else {return false;}
	}
	
	public static boolean isPrime(int number){
		boolean answer = true;
		
		
		for(int i = 2; i < number; i++){
			if (number < 2) {
				answer = false;
			}
			else if (number % i == 0){
				answer = false;
			}
		}
		return answer;
	}
	
	public static boolean isEven(MyInteger number){
		if (number.iValue %2 == 0){
			return true;
		}
		else {return false;}
	}
	
	public static boolean isOdd(MyInteger number){
		if (number.iValue %2 != 0){
			return true;
		}
		else {return false;}
	}
	public static boolean isPrime(MyInteger number){
		boolean answer = true;
		
		
		for(int i = 2; i < number.iValue; i++){
			if (number.iValue < 2) {
				answer = false;
			}
			else if (number.iValue % i == 0){
				answer = false;
			}
		}
		return answer;
	}
	
	public boolean equals(int number){
		if (number == iValue){
			return true;
		}else {return false;}
	}
	
	public boolean equals(MyInteger number){
		if (number.iValue == iValue){
			return true;}
		else{return false;}
		}
	
	
		
	}
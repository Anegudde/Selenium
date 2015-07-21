package com.qspiders;


class Operator {

	public int Addition(int a, int b){
		return a +b;
		}
	
	public int Subtraction(int a, int b) {
		return a -b;
		}
	
	public int Multiplication(int a, int b) {
		return a *b;
	}
	
	public int Division(int a, int b) {
		
		try{
			return a / b;
		}
		catch (Exception e) {
			return 0;
			//System.out.println("division by zero exception");
	        //System.out.println("inside-catch");     
			
		}			
	}

}

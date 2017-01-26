package com.nagarjun.Mockito;

public class CalService {

	ICalculator cal;

	public int addTwoNumbers(int x, int y){
		return cal.add(x, y);
	}
	
	public void setCal(ICalculator cal) {
		this.cal = cal;
	}
	public ICalculator getCal() {
		return cal;
	}
}

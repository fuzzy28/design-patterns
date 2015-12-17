package org.jrue.designpatterns;

/**
 * Unit test for simple App.
 */
public class AppTest 
{   
	/** personally, i prefer using strategy pattern since 
		it follows the Program to interface not implementation principle.
		But using template method pattern has an advantage to encapsulate 
		the algorithm */ 
	public static void main(String[] args) {
		HotBeverage coffee = new Coffee();
		coffee.prepare();
		System.out.println();
		HotBeverage tea = new HotTea();
		tea.prepare();
	}
	
}

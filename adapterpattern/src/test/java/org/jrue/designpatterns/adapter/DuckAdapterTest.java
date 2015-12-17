package org.jrue.designpatterns.adapter;

import org.jrue.adapterpattern.objects.Duck;
import org.jrue.adapterpattern.objects.MallardDuck;
import org.jrue.adapterpattern.objects.Turkey;
import org.jrue.adapterpattern.objects.WildTurkey;

public class DuckAdapterTest {

	public static void main(String[] args) {				
		
		Duck duck = new MallardDuck();
		System.out.println("\nMallard duck says\n");
		duck.quack();
		duck.fly();
		
		
		Turkey turkey = new WildTurkey();
		System.out.println("\nWild Turkey says\n");
		turkey.gobble();
		turkey.fly();

		Turkey poserDuck = new DuckAdapter(duck);
		System.out.println("\nPoser duck turkey says\n");
		sayWuttt(poserDuck);		
	}
	
	public static void sayWuttt(Turkey duck) {
		duck.gobble();
		duck.fly();
	}
}

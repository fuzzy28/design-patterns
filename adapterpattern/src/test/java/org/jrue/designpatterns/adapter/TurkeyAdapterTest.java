package org.jrue.designpatterns.adapter;

import org.jrue.adapterpattern.objects.Duck;
import org.jrue.adapterpattern.objects.MallardDuck;
import org.jrue.adapterpattern.objects.Turkey;
import org.jrue.adapterpattern.objects.WildTurkey;

public class TurkeyAdapterTest {

	public static void main(String[] args) {				
		Turkey turkey = new WildTurkey();
		System.out.println("\nTurkey says\n");
		turkey.gobble();
		turkey.fly();
		
		Duck duck = new MallardDuck();
		System.out.println("\nMallard duck says\n");
		sayWuttt(duck);
		
		Duck poserDuck = new TurkeyAdapter(turkey);
		System.out.println("\nPoser turkey duck says\n");
		sayWuttt(poserDuck);		
	}
	
	public static void sayWuttt(Duck duck) {
		duck.quack();
		duck.fly();
	}
}

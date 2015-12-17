package org.jrue.classes;

import org.jrue.interfaces.Display;
import org.jrue.interfaces.Observer;
import org.jrue.interfaces.Subject;

public class SoftDevDepartment2 implements Observer, Display{

	private Subject subject;
	private String memoMessage;
	
	public SoftDevDepartment2(Subject subject) {
		this.subject = subject;
		subject.subscribe(this);
	}
	
	@Override
	public void display() {
		System.out.println("New Memorandum Received by SDD2: " + memoMessage);
	}

	@Override
	public void update(String memoMessage) {
		this.memoMessage = memoMessage;
		display();
	}

}

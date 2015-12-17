package org.jrue.classes;

import java.util.ArrayList;


import org.jrue.interfaces.Observer;
import org.jrue.interfaces.Subject;

public class HumanResource implements Subject{

	ArrayList<Observer> observers;
	private String memoMessage;

	public HumanResource() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void subscribe(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unsubsribe(Observer observer) {
		int i = observers.indexOf(observer);
		if(i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifySubscribers() {
		for (Observer observer : observers) {
			observer.update(memoMessage);
		}
	}

	public String getMemoMessage() {
		return memoMessage;
	}

	public void setMemoMessage(String memoMessage) {
		this.memoMessage = memoMessage;
		notifySubscribers();
		
	}
}

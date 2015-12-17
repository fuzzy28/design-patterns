package org.jrue.interfaces;

public interface Subject {

	void subscribe(Observer observer);
	void unsubsribe(Observer observer);
	void notifySubscribers();
}

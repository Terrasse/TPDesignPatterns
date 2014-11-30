package eu.telecomnancy.sensor;

import java.util.ArrayList;

public abstract class Observable {
	ArrayList<Observer> observers=new ArrayList<Observer>();
	
	public void addObserver(Observer o){
		this.observers.add(o);
	}
	
	public void removeObserver(Observer o){
		this.observers.remove(o);
	}
	
	public void notifyObservers(){
		for(Observer currentObserver : this.observers){
			currentObserver.update(this);
		}
	}
}

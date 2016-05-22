package utilities;

import java.util.concurrent.atomic.AtomicInteger;

import components.GameObject;

public class Counter {
	
	public final static int lenghtOnScreen = 40;
	
	public static void timer(AtomicInteger timeCounter, GameObject gameObject) {
		//System.out.println("Time counter: " + timeCounter);
		timeCounter.set(timeCounter.get()+1);
		if(timeCounter.get() == lenghtOnScreen){
			gameObject.setRadius(0);
			timeCounter.set(0);
		}
	}
}

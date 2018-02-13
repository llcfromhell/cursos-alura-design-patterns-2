package br.com.alura.designpatterns2.memento;

import java.time.LocalDateTime;

public class Test {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		History history = new History();
		
		Contract c = new Contract(LocalDateTime.now(), "test", ContractStatus.NEW);
		
		// add new state
		history.addState(c.saveState());
		System.out.println(c.getActualStatus() + " - " + c.getSignDate().toString());
		
		// forward the contract state
		c.forwardStatus();
		history.addState(c.saveState());
		System.out.println(c.getActualStatus() + " - " + c.getSignDate().toString());
		
		c.forwardStatus();
		history.addState(c.saveState());
		System.out.println(c.getActualStatus() + " - " + c.getSignDate().toString());
		
		c.forwardStatus();
		history.addState(c.saveState());
		System.out.println(c.getActualStatus() + " - " + c.getSignDate().toString());
		
		// restore
		c.restore(history.getState(1));
		history.addState(c.saveState());
		System.out.println(c.getActualStatus() + " - " + c.getSignDate().toString());
		
	}
	
}

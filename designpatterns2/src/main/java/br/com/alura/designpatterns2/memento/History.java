package br.com.alura.designpatterns2.memento;

import java.util.ArrayList;
import java.util.List;

public class History {
	
	private List<ContractState> states = new ArrayList<>();

	public void addState(ContractState contractState) {
		states.add(contractState);
	}
	
	public ContractState getState(int position) {
		return states.get(position);
	}
	
}

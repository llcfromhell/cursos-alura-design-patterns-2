package br.com.alura.designpatterns2.memento;

public class ContractState {

	private Contract contract;

	public ContractState(Contract contract) {
		this.contract = contract;
	}

	public Contract getContract() {
		return contract;
	}

}

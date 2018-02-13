package br.com.alura.designpatterns2.memento;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Contract {
	
	private LocalDateTime signDate;
	private String customerName;
	private ContractStatus actualStatus = ContractStatus.NEW;
	
	public Contract(LocalDateTime signDate, String customerName, ContractStatus actualStatus) {
		super();
		this.signDate = signDate;
		this.customerName = customerName;
		this.actualStatus = actualStatus;
	}
	public LocalDateTime getSignDate() {
		return signDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public ContractStatus getActualStatus() {
		return actualStatus;
	}

	public ContractState saveState() {
		return new ContractState(
				new Contract(
						this.signDate, 
						this.customerName, 
						this.actualStatus)
				);
	}
	
	public void restore(ContractState contractState) {
		this.signDate = contractState.getContract().getSignDate();
		this.customerName = contractState.getContract().getCustomerName();
		this.actualStatus = contractState.getContract().getActualStatus();
	}
	
	public void forwardStatus() {
		if (actualStatus.equals(ContractStatus.NEW)) {
			this.actualStatus = ContractStatus.ONGOING;
		} else if (actualStatus.equals(ContractStatus.ONGOING)) {
			this.actualStatus = ContractStatus.CONFIRMED;
		} else if (actualStatus.equals(ContractStatus.CONFIRMED)) {
			this.actualStatus = ContractStatus.DONE;
		}
		
	}
	

}

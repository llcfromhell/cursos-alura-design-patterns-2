package br.com.alura.designpatterns2.interpreter.impl;

import br.com.alura.designpatterns2.interpreter.Expression;

public class Number implements Expression {
	
	private int number;

	public Number(int number) {
		this.number = number;
	}

	@Override
	public Integer evaluate() {
		return number;
	}


}

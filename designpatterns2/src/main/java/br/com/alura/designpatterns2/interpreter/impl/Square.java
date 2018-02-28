package br.com.alura.designpatterns2.interpreter.impl;

import br.com.alura.designpatterns2.interpreter.Expression;

public class Square implements Expression {

	private Expression target;
	
	public Square(Expression target) {
		this.target = target;
	}
	
	@Override
	public Integer evaluate() {
		return (int) Math.sqrt(target.evaluate());
	}

}

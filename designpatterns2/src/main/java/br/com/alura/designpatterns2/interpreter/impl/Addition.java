package br.com.alura.designpatterns2.interpreter.impl;

import br.com.alura.designpatterns2.interpreter.Expression;

public class Addition implements Expression {

	private Expression left;
	private Expression right;

	public Addition(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer evaluate() {
		return left.evaluate() + right.evaluate();
	}
	
}

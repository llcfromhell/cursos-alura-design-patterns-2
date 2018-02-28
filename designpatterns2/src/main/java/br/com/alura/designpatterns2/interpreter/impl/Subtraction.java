package br.com.alura.designpatterns2.interpreter.impl;

import br.com.alura.designpatterns2.interpreter.Expression;

public class Subtraction implements Expression {

	private Expression right;
	private Expression left;

	public Subtraction(Expression left, Expression right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public Integer evaluate() {
		return left.evaluate() - right.evaluate();
	}


}

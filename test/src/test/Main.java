package test;
import javax.script.ScriptException;

import test.Algebra;

public class Main {

	public static void main(String[] args) throws ScriptException {

		Algebra a = new Algebra("5+6","10+1");
		
		Solver manage = new Solver(a);
		
		System.out.println("Your answer equals: " + manage.calculate(a.getEquation()));
		System.out.println("The real answer equals: " + manage.calculate(a.getSolution()));		
		System.out.println(manage.checkAnswer(manage.calculate(a.getEquation())));
	}

}
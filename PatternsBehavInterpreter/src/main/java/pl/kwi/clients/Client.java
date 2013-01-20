package pl.kwi.clients;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.contexts.Context;
import pl.kwi.expressions.DivideExpression;
import pl.kwi.expressions.Expression;
import pl.kwi.expressions.MinusExpression;
import pl.kwi.expressions.MultiplyExpression;
import pl.kwi.expressions.PlusExpression;
import pl.kwi.toys.Toy;

public class Client {
		
	public void addCountPropertyToToy(String count, Toy toy) {
		
		Context context = new Context(count);
		
		List<Expression> expressions = new ArrayList<Expression>();
		expressions.add(new MultiplyExpression());
		expressions.add(new DivideExpression());
		expressions.add(new PlusExpression());
		expressions.add(new MinusExpression());
		
		for (Expression expression : expressions) {
			expression.interpret(context);
		}
		
		int result = context.getOutput();
		
		toy.addProperty("count", String.valueOf(result));
		
	}

}

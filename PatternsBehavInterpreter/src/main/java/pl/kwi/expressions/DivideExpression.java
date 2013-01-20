package pl.kwi.expressions;

public class DivideExpression extends Expression {

	@Override
	public String getMark() {
		return "/";
	}

	@Override
	public String getResult(int firstDigit, int secondDigit) {
		int result = firstDigit / secondDigit;
		return String.valueOf(result);
	}

}

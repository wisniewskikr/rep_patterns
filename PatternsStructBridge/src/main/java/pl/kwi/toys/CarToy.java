package pl.kwi.toys;

import pl.kwi.styles.ITextStyle;

public class CarToy extends Toy{
	
	public CarToy(ITextStyle textStyle){
		super(Toy.CAR, textStyle);
	}
	
	@Override
	public String getFormattedName() {
		return textStyle.getFormattedName(getName());
	}

}

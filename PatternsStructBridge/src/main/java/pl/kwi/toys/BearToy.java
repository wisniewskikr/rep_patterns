package pl.kwi.toys;

import pl.kwi.styles.ITextStyle;

public class BearToy extends Toy{
	
	public BearToy(ITextStyle textStyle){
		super(Toy.BEAR, textStyle);
	}

	@Override
	public String getFormattedName() {
		return textStyle.getFormattedName(getName());
	}

}

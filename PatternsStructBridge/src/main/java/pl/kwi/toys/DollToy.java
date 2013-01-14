package pl.kwi.toys;

import pl.kwi.styles.ITextStyle;

public class DollToy extends Toy{
	
	public DollToy(ITextStyle textStyle){
		super(Toy.DOLL, textStyle);
	}
	
	@Override
	public String getFormattedName() {
		return textStyle.getFormattedName(getName());
	}

}

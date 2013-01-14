package pl.kwi.styles;

public class BoldTextStyle implements ITextStyle {

	public String getFormattedName(String name) {
		return "<b>" + name + "</b>";
	}

}

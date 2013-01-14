package pl.kwi.styles;

public class ItalicTextStyle implements ITextStyle {

	public String getFormattedName(String name) {
		return "<i>" + name + "</i>";
	}

}

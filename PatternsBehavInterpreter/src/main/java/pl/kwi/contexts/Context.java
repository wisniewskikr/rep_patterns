package pl.kwi.contexts;

public class Context {
	
	
	private String input;
	private String tmpInput;
	private int output;
	
	
	public Context(String input) {
		this.input = input;
		this.tmpInput = input;
	}
	
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
		
	public String getTmpInput() {
		return tmpInput;
	}
	public void setTmpInput(String tmpInput) {
		this.tmpInput = tmpInput;
	}
	
	public int getOutput() {
		return output;
	}
	public void setOutput(int output) {
		this.output = output;
	}
		
}

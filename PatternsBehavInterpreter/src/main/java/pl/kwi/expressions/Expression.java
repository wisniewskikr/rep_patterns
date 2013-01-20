package pl.kwi.expressions;

import java.util.ArrayList;
import java.util.List;

import pl.kwi.contexts.Context;

public abstract class Expression {
	
	
	public void interpret(Context context) {
        
		boolean cnt = true;
		List<String> inputList = getInputList(context);
		
		while(cnt){			
			
			int index = 0;
			String result = null;
			for (String input : inputList) {
				
				if(input.equals(getMark())){
					int firstDigit = Integer.valueOf(inputList.get(index - 1));
					int secondDigit = Integer.valueOf(inputList.get(index + 1));
					
					result = getResult(firstDigit, secondDigit);
					break;
										
				}
				index++;
				
			}
			
			if(result != null){
				
				inputList.remove(index);
				inputList.add(index, result);
				inputList.remove(index + 1);
				inputList.remove(index - 1);
				
				
			}else{
				cnt = false;
				context.setTmpInput(getTmpInput(inputList));				
			}
			
		}
		
		if(inputList.size() == 1){
			context.setOutput(Integer.valueOf(inputList.get(0)));
		}
        
    }
	
	public abstract String getMark();

	public abstract String getResult(int firstDigit, int secondDigit);
	
	public List<String> getInputList(Context context) {
		
		String[] inputArray = context.getTmpInput().split(" ");
		List<String> inputList = new ArrayList<String>();
		for (int i = 0; i < inputArray.length; i++) {
			inputList.add(inputArray[i]);
		}
		
		return inputList;
		
	}
	
	public String getTmpInput(List<String> inputList) {
		
		StringBuilder sb = new StringBuilder();
		for (String input : inputList) {
			sb.append(input);
			sb.append(" ");
		}
		String tmpInput = sb.toString();
		return tmpInput.substring(0, tmpInput.length() - 1);
		
	}
	

}

package app.dto;

import java.util.Map;

public class ParamDTO {
	
	private boolean state;
	private Map result;
	
	public boolean isState() {
		return state;
	}
	public void setState(boolean state) {
		this.state = state;
	}
	public Map getResult() {
		return result;
	}
	public void setResult(Map result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "ParamDTO [state=" + state + ", result=" + result + "]";
	}
	
	
}

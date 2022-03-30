package model;

public class Events_ {
	private String code;
	private String name;
	private String codDiscipline;
	private String state;
	
	
	public Events_(String code, String name, String type, String state) {
		this.code = code;
		this.name = name;
		this.codDiscipline = type;
		this.state= state;
	}
	
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getType() {
		return codDiscipline;
	}


	public void setType(String type) {
		this.codDiscipline = type;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
	
	

}

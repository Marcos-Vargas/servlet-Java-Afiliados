package model;

public class Team {
	
	private String code;
	private String name;
	private String state;
	
	
	public Team() {
		super();
	}


	public Team(String code, String name, String state) {
		super();
		this.code = code;
		this.name = name;
		this.state = state;
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


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	@Override
	public String toString() {
		return "Team [code=" + code + ", name=" + name + ", state=" + state + "]";
	}
	
	
	
	

}

package model;

public class Events_T_A {
	
	private String codeEvent;
	private String codParticipante;
	
	
	public Events_T_A(String codeEvent, String codParticipante) {
		super();
		this.codeEvent = codeEvent;
		this.codParticipante = codParticipante;
	}
	
	public String getCodeEvent() {
		return codeEvent;
	}
	public void setCodeEvent(String codeEvent) {
		this.codeEvent = codeEvent;
	}
	public String getCodParticipante() {
		return codParticipante;
	}
	public void setCodParticipante(String codParticipante) {
		this.codParticipante = codParticipante;
	}

	@Override
	public String toString() {
		return "Events_T_A [codeEvent=" + codeEvent + ", codParticipante=" + codParticipante + "]";
	}
	
	
	

}

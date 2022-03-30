package model;

public class Results {
	
	private String codeEvent;
	private String codeParticipant;
	private String ranking;
	
	
	public Results(String codeEvent, String codeParticipant, String ranking) {
		super();
		this.codeEvent = codeEvent;
		this.codeParticipant = codeParticipant;
		this.ranking = ranking;
	}
	
	public String getCodeEvent() {
		return codeEvent;
	}
	public void setCodeEvent(String codeEvent) {
		this.codeEvent = codeEvent;
	}
	public String getCodeParticipant() {
		return codeParticipant;
	}
	public void setCodeParticipant(String codeParticipant) {
		this.codeParticipant = codeParticipant;
	}
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}

	@Override
	public String toString() {
		return "Results [codeEvent=" + codeEvent + ", codeParticipant=" + codeParticipant + ", ranking=" + ranking
				+ "]";
	}
	
	
	
	

}

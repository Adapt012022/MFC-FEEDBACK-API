package com.feedback.main.modal;

//@Entity
//@Table(name = "tbl_employee")
public class Feedback {
	
//	@Id
// @GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Long id;
//	private int id;
	private String feedback;
	private int smiley;
	private int countryFlag;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	public int getSmiley() {
		return smiley;
	}
	public void setSmiley(int smiley) {
		this.smiley = smiley;
	}
	public int getCountryFlag() {
		return countryFlag;
	}
	public void setCountryFlag(int countryFlag) {
		this.countryFlag = countryFlag;
	}
	
	
	

}

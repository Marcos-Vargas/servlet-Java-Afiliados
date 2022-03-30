package model;

public class Affiliate {
	private String firstName;
	private String lastName;
	private String id;
	private String birthday;
	private String state;
	private String phone;
	
	
	public Affiliate() {
		super();
	}

	public Affiliate(String firstName, String lastName, String id, String birthday, String state, String phone) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.birthday = birthday;
		this.state = state;
		this.phone = phone;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Team [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", birthday=" + birthday
				+ ", state=" + state + ", phone=" + phone + "]";
	}
	
	
	

}

package genpact.mvc.jdbc.entities;

import java.util.Arrays;

// Model class - both const, getter/setter, toString
public class User {
	private String fullName;
	private String password;
	private String mobileNo;
	private String emailId;
	private String gender;
	private String[] hobbies;
	private String[] skills;

	public User() {
		super();
	}

	public User(String fullName, String password, String mobileNo, String emailId, String gender, String[] hobbies,
			String[] skills) {
		super();
		this.fullName = fullName;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.gender = gender;
		this.hobbies = hobbies;
		this.skills = skills;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "User [fullName=" + fullName + ", password=" + password + ", mobileNo=" + mobileNo + ", emailId="
				+ emailId + ", gender=" + gender + ", hobbies=" + Arrays.toString(hobbies) + ", skills="
				+ Arrays.toString(skills) + "]";
	}

}

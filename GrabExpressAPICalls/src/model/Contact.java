package model;

public class Contact {

	    String firstName;
	    String lastName;
	    String title;
	    String companyName;
	    String email;
	    String phone;
	    Boolean smsEnabled;
	    String instruction;
	    
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
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getCompanyName() {
			return companyName;
		}
		public void setCompanyName(String companyName) {
			this.companyName = companyName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public Boolean getSmsEnabled() {
			return smsEnabled;
		}
		public void setSmsEnabled(Boolean smsEnabled) {
			this.smsEnabled = smsEnabled;
		}
		public String getInstruction() {
			return instruction;
		}
		public void setInstruction(String instruction) {
			this.instruction = instruction;
		}
}

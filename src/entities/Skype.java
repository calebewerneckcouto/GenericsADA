package entities;

public class Skype {
	
	String skypeId;
	String password;
	String email;
	
	public Skype(String skypeId, String password, String email) {
		this.skypeId = skypeId;
		this.password = password;
		this.email = email;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
		
	

}

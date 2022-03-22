package user;

public class User {
	private String uID;
	private String uPass;
	private String uName;
	private String uAdderss;
	private String uEmail;
	
	public String getuID() {
		return uID;
	}
	public void setuID(String uID) {
		this.uID = uID;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuAdderss() {
		return uAdderss;
	}
	public void setuAdderss(String uAdderss) {
		this.uAdderss = uAdderss;
	}
	public String getuEmail() {
		return uEmail;
	}
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
}

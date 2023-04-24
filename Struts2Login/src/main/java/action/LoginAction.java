package action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String uname,password;

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String execute() throws Exception {

		System.out.println("Action is called....");
		
		if(uname.equals("arif") && password.equals("arif"))
		{
			return "success";
		}else
			return "error";
		
	}

}

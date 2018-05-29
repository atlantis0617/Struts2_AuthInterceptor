package org.struts.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{

	private static final long serialVersionUID = -5190604057341217140L;
	
	private String username;// 用户名
    private String password;// 密码
    private Map<String, Object> session;// Session
    
    @Override
    public String execute() throws Exception {
    	 if ("admin".equals(username) && "123456".equals(password)) {
             session.put("userInfo", username);
             session.remove("loginError");
             return SUCCESS;
         } else {
             session.put("loginError", "用户名或密码错误");
             session.remove("userInfo");
             return "login";
         }
    }
    
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

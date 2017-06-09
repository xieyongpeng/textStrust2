package com.helloweenvsfei.struts2.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private String account;

	// √‹¬Î
	private String password;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {

		if ("helloween".equalsIgnoreCase(account) && "1234".equals(password)) {
			return SUCCESS;
		}
		return LOGIN;
	}
}

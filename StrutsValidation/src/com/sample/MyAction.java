package com.sample;

import com.opensymphony.xwork2.ActionSupport;

public class MyAction extends ActionSupport {
	
	private String username;
	private String password;
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
	
	@Override
	public String execute() throws Exception {
		if(username.equals("Tulasiram") && password.equals("welcome")){
			return SUCCESS;
		}else{
			this.addActionError(getText("u.p.wrong"));
			return ERROR;
		}
	}
	@Override // this methos automatically return input I don't know how 
	public void validate() {
		if(username.equals("") || username.length()==0){
			this.addFieldError(username, getText("user.wrong"));
			}
		if(password.equals("") || password.length()==0){
			this.addFieldError(password, getText("pass.wrong"));
			}
			
	}

}

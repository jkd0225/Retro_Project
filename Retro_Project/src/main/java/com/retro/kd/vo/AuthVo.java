package com.retro.kd.vo;

public class AuthVo {
	private int auth_num;
	private String user_auth;
	private String user_email;

	public AuthVo() {
	}

	public boolean isRole(String role) {
		return user_auth.equals("ROLE_" + role.toUpperCase());
	}

	public AuthVo(int auth_num, String user_auth, String user_email) {
		super();
		this.auth_num = auth_num;
		this.user_auth = user_auth;
		this.user_email = user_email;
	}

	public int getAuth_num() {
		return auth_num;
	}

	public void setAuth_num(int auth_num) {
		this.auth_num = auth_num;
	}

	public String getUser_auth() {
		return user_auth;
	}

	public void setUser_auth(String user_auth) {
		this.user_auth = user_auth;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	@Override
	public String toString() {
		return "AuthVo [auth_num=" + auth_num + ", user_auth=" + user_auth + ", user_email=" + user_email + "]";
	}

}

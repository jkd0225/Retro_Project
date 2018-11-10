package com.retro.kd.vo;

import java.sql.Date;

public class UsersVo {
	private String user_email;
	private String user_password;
	private String user_name;
	private int user_profile;
	private int user_point;
	private Date user_regdate;
	private int user_enabled;

	public UsersVo() {
	}

	public UsersVo(String user_email, String user_password, String user_name, int user_profile, int user_point,
			Date user_regdate, int user_enabled) {
		super();
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_name = user_name;
		this.user_profile = user_profile;
		this.user_point = user_point;
		this.user_regdate = user_regdate;
		this.user_enabled = user_enabled;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_profile() {
		return user_profile;
	}

	public void setUser_profile(int user_profile) {
		this.user_profile = user_profile;
	}

	public int getUser_point() {
		return user_point;
	}

	public void setUser_point(int user_point) {
		this.user_point = user_point;
	}

	public Date getUser_regdate() {
		return user_regdate;
	}

	public void setUser_regdate(Date user_regdate) {
		this.user_regdate = user_regdate;
	}

	public int getUser_enabled() {
		return user_enabled;
	}

	public void setUser_enabled(int user_enabled) {
		this.user_enabled = user_enabled;
	}

	@Override
	public String toString() {
		return "UsersVo [user_email=" + user_email + ", user_password=" + user_password + ", user_name=" + user_name
				+ ", user_profile=" + user_profile + ", user_point=" + user_point + ", user_regdate=" + user_regdate
				+ ", user_enabled=" + user_enabled + "]";
	}

}

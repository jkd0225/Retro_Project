package com.retro.kd.vo;

import java.sql.Date;

public class InvenVo {
	private int inven_num;
	private Date inven_regdate;
	private String user_email;
	private int icon_num;
	private String icon_name;
	private String icon_type;
	private String icon_tier;
	private int icon_price;

	public InvenVo() {
	}

	public InvenVo(int inven_num, Date inven_regdate, String user_email, int icon_num, String icon_name,
			String icon_type, String icon_tier, int icon_price) {
		super();
		this.inven_num = inven_num;
		this.inven_regdate = inven_regdate;
		this.user_email = user_email;
		this.icon_num = icon_num;
		this.icon_name = icon_name;
		this.icon_type = icon_type;
		this.icon_tier = icon_tier;
		this.icon_price = icon_price;
	}

	public int getInven_num() {
		return inven_num;
	}

	public void setInven_num(int inven_num) {
		this.inven_num = inven_num;
	}

	public Date getInven_regdate() {
		return inven_regdate;
	}

	public void setInven_regdate(Date inven_regdate) {
		this.inven_regdate = inven_regdate;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getIcon_num() {
		return icon_num;
	}

	public void setIcon_num(int icon_num) {
		this.icon_num = icon_num;
	}

	public String getIcon_name() {
		return icon_name;
	}

	public void setIcon_name(String icon_name) {
		this.icon_name = icon_name;
	}

	public String getIcon_type() {
		return icon_type;
	}

	public void setIcon_type(String icon_type) {
		this.icon_type = icon_type;
	}

	public String getIcon_tier() {
		return icon_tier;
	}

	public void setIcon_tier(String icon_tier) {
		this.icon_tier = icon_tier;
	}

	public int getIcon_price() {
		return icon_price;
	}

	public void setIcon_price(int icon_price) {
		this.icon_price = icon_price;
	}

	@Override
	public String toString() {
		return "InvenVo [inven_num=" + inven_num + ", inven_regdate=" + inven_regdate + ", user_email=" + user_email
				+ ", icon_num=" + icon_num + ", icon_name=" + icon_name + ", icon_type=" + icon_type + ", icon_tier="
				+ icon_tier + ", icon_price=" + icon_price + "]";
	}

}

package com.retro.kd.vo;

public class IconVo {
	private int icon_num;
	private String icon_name;
	private String icon_type;
	private String icon_tier;
	private int icon_price;

	public IconVo() {
	}

	public IconVo(int icon_num, String icon_name, String icon_type, String icon_tier, int icon_price) {
		super();
		this.icon_num = icon_num;
		this.icon_name = icon_name;
		this.icon_type = icon_type;
		this.icon_tier = icon_tier;
		this.icon_price = icon_price;
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
		return "IconVo [icon_num=" + icon_num + ", icon_name=" + icon_name + ", icon_type=" + icon_type + ", icon_tier="
				+ icon_tier + ", icon_price=" + icon_price + "]";
	}

}

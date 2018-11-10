package com.retro.kd.vo;

public class ChatRoomVo {
	private int room_num;
	private String user_email;
	private String other_email;

	public ChatRoomVo() {
	}

	public ChatRoomVo(int room_num, String user_email, String other_email) {
		super();
		this.room_num = room_num;
		this.user_email = user_email;
		this.other_email = other_email;
	}

	public int getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getOther_email() {
		return other_email;
	}

	public void setOther_email(String other_email) {
		this.other_email = other_email;
	}

	@Override
	public String toString() {
		return "ChatRoomVo [room_num=" + room_num + ", user_email=" + user_email + ", other_email=" + other_email + "]";
	}

}

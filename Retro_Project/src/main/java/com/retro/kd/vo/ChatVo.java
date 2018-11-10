package com.retro.kd.vo;

import java.sql.Date;

import com.google.gson.Gson;


public class ChatVo {
	private int chat_num;
	private String chat_sender;
	private String chat_content;
	private Date chat_regdate;
	private int chat_read;
	private int room_num;

	public ChatVo() {
	}

	public ChatVo(int chat_num, String chat_sender, String chat_content, Date chat_regdate, int chat_read,
			int room_num) {
		super();
		this.chat_num = chat_num;
		this.chat_sender = chat_sender;
		this.chat_content = chat_content;
		this.chat_regdate = chat_regdate;
		this.chat_read = chat_read;
		this.room_num = room_num;
	}

	public int getChat_num() {
		return chat_num;
	}

	public void setChat_num(int chat_num) {
		this.chat_num = chat_num;
	}

	public String getChat_sender() {
		return chat_sender;
	}

	public void setChat_sender(String chat_sender) {
		this.chat_sender = chat_sender;
	}

	public String getChat_content() {
		return chat_content;
	}

	public void setChat_content(String chat_content) {
		this.chat_content = chat_content;
	}

	public Date getChat_regdate() {
		return chat_regdate;
	}

	public void setChat_regdate(Date chat_regdate) {
		this.chat_regdate = chat_regdate;
	}

	public int getChat_read() {
		return chat_read;
	}

	public void setChat_read(int chat_read) {
		this.chat_read = chat_read;
	}

	public int getRoom_num() {
		return room_num;
	}

	public void setRoom_num(int room_num) {
		this.room_num = room_num;
	}

	public static ChatVo convertMessage(String source) {
		ChatVo message = new ChatVo();
		Gson gson = new Gson();
		message = gson.fromJson(source, ChatVo.class);
		return message;
	}

	@Override
	public String toString() {
		return "ChatVo [chat_num=" + chat_num + ", chat_sender=" + chat_sender + ", chat_content=" + chat_content
				+ ", chat_regdate=" + chat_regdate + ", chat_read=" + chat_read + ", room_num=" + room_num + "]";
	}

}

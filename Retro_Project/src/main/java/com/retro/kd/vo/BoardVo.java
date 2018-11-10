package com.retro.kd.vo;

import java.sql.Date;

public class BoardVo {
	private int board_num;
	private String board_title;
	private String board_content;
	private Date board_regdate;
	private int board_hit;
	private String user_email;
	private int getComments;
	private int getRecomm;

	public BoardVo() {
	}

	public BoardVo(int board_num, String board_title, String board_content, Date board_regdate, int board_hit,
			String user_email, int getComments, int getRecomm) {
		super();
		this.board_num = board_num;
		this.board_title = board_title;
		this.board_content = board_content;
		this.board_regdate = board_regdate;
		this.board_hit = board_hit;
		this.user_email = user_email;
		this.getComments = getComments;
		this.getRecomm = getRecomm;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}

	public Date getBoard_regdate() {
		return board_regdate;
	}

	public void setBoard_regdate(Date board_regdate) {
		this.board_regdate = board_regdate;
	}

	public int getBoard_hit() {
		return board_hit;
	}

	public void setBoard_hit(int board_hit) {
		this.board_hit = board_hit;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getGetComments() {
		return getComments;
	}

	public void setGetComments(int getComments) {
		this.getComments = getComments;
	}

	public int getGetRecomm() {
		return getRecomm;
	}

	public void setGetRecomm(int getRecomm) {
		this.getRecomm = getRecomm;
	}

	@Override
	public String toString() {
		return "BoardVo [board_num=" + board_num + ", board_title=" + board_title + ", board_content=" + board_content
				+ ", board_regdate=" + board_regdate + ", board_hit=" + board_hit + ", user_email=" + user_email
				+ ", getComments=" + getComments + ", getRecomm=" + getRecomm + "]";
	}

}

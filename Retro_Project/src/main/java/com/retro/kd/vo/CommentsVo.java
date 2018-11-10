package com.retro.kd.vo;

import java.sql.Date;

public class CommentsVo {
	private int comm_num;
	private String comm_content;
	private Date comm_regdate;
	private int board_num;
	
	public CommentsVo() {}

	public CommentsVo(int comm_num, String comm_content, Date comm_regdate, int board_num) {
		super();
		this.comm_num = comm_num;
		this.comm_content = comm_content;
		this.comm_regdate = comm_regdate;
		this.board_num = board_num;
	}

	public int getComm_num() {
		return comm_num;
	}

	public void setComm_num(int comm_num) {
		this.comm_num = comm_num;
	}

	public String getComm_content() {
		return comm_content;
	}

	public void setComm_content(String comm_content) {
		this.comm_content = comm_content;
	}

	public Date getComm_regdate() {
		return comm_regdate;
	}

	public void setComm_regdate(Date comm_regdate) {
		this.comm_regdate = comm_regdate;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	@Override
	public String toString() {
		return "CommentsVo [comm_num=" + comm_num + ", comm_content=" + comm_content + ", comm_regdate=" + comm_regdate
				+ ", board_num=" + board_num + "]";
	}
	
	
}

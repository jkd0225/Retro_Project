package com.retro.kd.vo;

public class RecommVo {
	private int recomm_num;
	private String user_email;
	private int board_num;

	public RecommVo() {
	}

	public RecommVo(int recomm_num, String user_email, int board_num) {
		super();
		this.recomm_num = recomm_num;
		this.user_email = user_email;
		this.board_num = board_num;
	}

	public int getRecomm_num() {
		return recomm_num;
	}

	public void setRecomm_num(int recomm_num) {
		this.recomm_num = recomm_num;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public int getBoard_num() {
		return board_num;
	}

	public void setBoard_num(int board_num) {
		this.board_num = board_num;
	}

	@Override
	public String toString() {
		return "RecommVo [recomm_num=" + recomm_num + ", user_email=" + user_email + ", board_num=" + board_num + "]";
	}

}

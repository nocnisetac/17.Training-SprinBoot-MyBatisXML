package project.jdbc.domain;

import java.io.Serializable;

public class Account implements Serializable {
	private Long ID;
	private Long userID;
	private int state;
	public Account() {
		super();
	}
	public Account(Long iD, Long userID, int state) {
		super();
		ID = iD;
		this.userID = userID;
		this.state = state;
	}
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public Long getUserID() {
		return userID;
	}
	public void setUserID(Long userID) {
		this.userID = userID;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	
	
}

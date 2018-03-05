package model;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id;
	private String username;
	private String password;
	private boolean isExperienced;
	private int chapter;
	private int subchapter;
	private int unit;
	
	public User() {
	}

	public User(int id, String username, String password, boolean isExperienced) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.isExperienced = isExperienced;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getIsExperienced() {
		return isExperienced;
	}

	public void setIsExperienced(boolean isExperienced) {
		this.isExperienced = isExperienced;
	}
	
	public int getChapter() {
		return chapter;
	}
	
	public void setChapter(int chapter) {
		this.chapter = chapter;
	}
	
	public int getSubchapter() {
		return subchapter;
	}
	
	public void setSubchapter(int subchapter) {
		this.subchapter = subchapter;
	}
	
	public int getUnit() {
		return chapter;
	}
	
	public void setUnit(int unit) {
		this.unit = unit;
	}
	
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

}

package model;

import java.io.Serializable;

public class User implements Serializable{
	private String name;
	private String pass;

	public User() {} //引数のないコンストラクタ
	public User(String name, String pass) {
		this.name = name;
		this.name = pass;
	}
	public String getName() { return name; }
	public String getPass() { return pass;}
}

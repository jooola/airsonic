package org.airsonic.player.dto;

import java.io.Serializable;

public class LoginDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String username;
	private String password;

	public String getPassword() {
		return this.password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}

package org.airsonic.player.dto;

import java.io.Serializable;

public class TokenDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private String raw;

	public String getRaw() {
		return this.raw;
	}

	public void setRaw(String raw) {
		this.raw = raw;
	}

}

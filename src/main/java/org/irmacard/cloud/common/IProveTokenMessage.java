package org.irmacard.cloud.common;

public class IProveTokenMessage extends TokenMessage {
	private String ip;
	private String encryptedToken;

	public IProveTokenMessage() {
	}

	public IProveTokenMessage(String id, String ip, String encryptedToken) {
		super(id);
		this.ip = ip;
		this.encryptedToken = encryptedToken;
	}

	public String getEncryptedToken() {
		return encryptedToken;
	}

	public void setEncryptedToken(String encryptedToken) {
		this.encryptedToken = encryptedToken;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
}

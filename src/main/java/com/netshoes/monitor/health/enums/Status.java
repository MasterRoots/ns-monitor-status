package com.netshoes.monitor.health.enums;

public enum Status {

	UP("Up"), DOWN("Down"), ;

	private String status;

	private Status(final String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
}

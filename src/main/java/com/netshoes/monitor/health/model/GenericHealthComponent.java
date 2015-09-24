package com.netshoes.monitor.health.model;

import com.netshoes.monitor.health.HealthComponent;
import com.netshoes.monitor.health.enums.Status;

public class GenericHealthComponent implements HealthComponent {

	private static final long serialVersionUID = 1L;

	private Status status;

	private String errorCode;

	private String description;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "GenericHealthComponent [status=" + status + ", errorCode=" + errorCode + ", description=" + description
				+ "]";
	}

}

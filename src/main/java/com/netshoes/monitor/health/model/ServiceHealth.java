package com.netshoes.monitor.health.model;

public class ServiceHealth extends GenericHealthComponent {

	private static final long serialVersionUID = 1L;

	private String endpoint;

	private String statusCode;

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	@Override
	public String toString() {
		return "ServiceHealth [endpoint=" + endpoint + ", statusCode=" + statusCode + "]";
	}

}

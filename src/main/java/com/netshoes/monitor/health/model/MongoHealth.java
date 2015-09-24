package com.netshoes.monitor.health.model;

public class MongoHealth extends GenericHealthComponent {

	private static final long serialVersionUID = 1L;

	private long timeout;

	private long averageResults;

	public long getTimeout() {
		return timeout;
	}

	public void setTimeout(long timeout) {
		this.timeout = timeout;
	}

	public long getAverageResults() {
		return averageResults;
	}

	public void setAverageResults(long averageResults) {
		this.averageResults = averageResults;
	}

}

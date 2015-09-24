package com.netshoes.monitor.health.model;

public class RedisHealth extends GenericHealthComponent {

	private static final long serialVersionUID = 1L;
	
	private long maxKeys;
	
	private long minKeys;

	public long getMaxKeys() {
		return maxKeys;
	}

	public void setMaxKeys(long maxKeys) {
		this.maxKeys = maxKeys;
	}

	public long getMinKeys() {
		return minKeys;
	}

	public void setMinKeys(long minKeys) {
		this.minKeys = minKeys;
	}

	@Override
	public String toString() {
		return "RedisHealth [maxKeys=" + maxKeys + ", minKeys=" + minKeys + "]";
	}
	
	

}

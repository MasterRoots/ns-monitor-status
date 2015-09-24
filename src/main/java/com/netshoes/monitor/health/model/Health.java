package com.netshoes.monitor.health.model;

import java.util.Map;

import com.netshoes.monitor.health.HealthComponent;
import com.netshoes.monitor.health.enums.Status;

public class Health {

	private Status status;

	private Map<String, HealthComponent> map;

	public Health() {
		// empty
		
	}

	public Health(final Status status, final Map<String, HealthComponent> component) {
		this.status = status;
		map = component;
	}

	public Status getStatus() {
		return status;
	}

	public Map<String, HealthComponent> getMap() {
		return map;
	}

	@Override
	public String toString() {
		return "Health [status=" + status + ", map=" + map + "]";
	}

}

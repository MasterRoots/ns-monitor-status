package com.netshoes.monitor.health.builder;

import java.util.HashMap;
import java.util.Map;

import com.netshoes.monitor.health.HealthComponent;
import com.netshoes.monitor.health.enums.Status;
import com.netshoes.monitor.health.model.Health;

public class HealthBuilder {

	private Status status;

	private Map<String, HealthComponent> map = new HashMap<String, HealthComponent>();

	public HealthBuilder up() {

		this.status = Status.UP;
		return this;
	}

	public HealthBuilder down() {
		this.status = Status.DOWN;
		return this;
	}

	public HealthBuilder healthDetails(final String nameComponent, final HealthComponent component) {

		map.put(nameComponent, component);
		return this;
	}

	public Health build() {
		return new Health(this.status, this.map);
	}

}

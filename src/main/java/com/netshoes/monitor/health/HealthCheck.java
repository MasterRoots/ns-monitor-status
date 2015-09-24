package com.netshoes.monitor.health;

import com.netshoes.monitor.health.model.Health;

public interface HealthCheck {

	public Health health();

	public boolean check();

}

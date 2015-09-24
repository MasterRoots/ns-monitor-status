package com.netshoes.monitor.health.model;

public class DiskSpaceHealth extends GenericHealthComponent {

	private static final long serialVersionUID = 1L;

	private long freeSpace;

	private long freeMemory;

	public long getFreeSpace() {
		return freeSpace;
	}

	public void setFreeSpace(long freeSpace) {
		this.freeSpace = freeSpace;
	}

	public long getFreeMemory() {
		return freeMemory;
	}

	public void setFreeMemory(long freeMemory) {
		this.freeMemory = freeMemory;
	}

	@Override
	public String toString() {
		return "DiskSpaceHealth [freeSpace=" + freeSpace + ", freeMemory=" + freeMemory + "]";
	}

}

package com.zhb.test.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SystemLog implements Serializable {
	private static final long serialVersionUID = -654831265498L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, length = 20)
	private String timestamp;
	
	/*
	 * 1:Application Server Start
	 * 2:Application Server Shutdown
	 */
	@Column(nullable = true, length = 2)
	private String action;

	public SystemLog() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	@Override
	public String toString() {
		return "SystemLog [id=" + id + ", timestamp=" + timestamp + ", action=" + action + "]";
	}
	
}
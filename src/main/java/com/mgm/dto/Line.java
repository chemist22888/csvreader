package com.mgm.dto;

public class Line implements Comparable<Line>{
	String key;
	Long value;


	public Line(String key, Long value) {
		this.key = key;
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	@Override
	public int compareTo(Line o) {
		return o.getValue().compareTo(value);
	}
}

package com.ice.wangwang.page;

public class Page {

	private Integer begin;

	private Integer size;

	public Page(Integer begin, Integer size) {
		super();
		this.begin = begin;
		this.size = size;
	}

	public Integer getBegin() {
		return begin;
	}

	public void setBegin(Integer begin) {
		this.begin = begin;
	}

	public Integer getSize() {
		return size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}

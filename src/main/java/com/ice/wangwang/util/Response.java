package com.ice.wangwang.util;

public class Response {

	private int code;
	private String reason;
	private Object data;

	private Response(int i) {
		code = i;
	}

	public static Response failResponse(String reason) {
		return new Response(0).setReason(reason);
	}

	public static Response successResponse(Object data) {
		return new Response(1).setData(data);
	}

	public int getCode() {
		return code;
	}

	public Response setCode(int code) {
		this.code = code;
		return this;
	}

	public String getReason() {
		return reason;
	}

	public Response setReason(String reason) {
		this.reason = reason;
		return this;
	}

	public Object getData() {
		return data;
	}

	public Response setData(Object data) {
		this.data = data;
		return this;
	}

}

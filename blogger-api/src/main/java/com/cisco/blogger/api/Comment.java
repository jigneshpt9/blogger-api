package com.cisco.blogger.api;

public class Comment {
	
	private String text;
	

	protected Comment() {
		
	}

	public Comment(String text) {
		super();
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}


}

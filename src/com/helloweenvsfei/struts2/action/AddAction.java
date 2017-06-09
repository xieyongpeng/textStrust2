package com.helloweenvsfei.struts2.action;

import com.helloweenvsfei.struts2.bean.Book;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
	private static final long serialVersionUID = -38241432793476229L;
	private String title;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	private Book book;
	public String execute() {

		return Action.SUCCESS;
	}
}

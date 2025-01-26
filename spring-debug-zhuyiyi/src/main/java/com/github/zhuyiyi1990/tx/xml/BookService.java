package com.github.zhuyiyi1990.tx.xml;

import java.math.BigDecimal;

public class BookService {

	private BookDAO bookDAO;

	public BookDAO getBookDAO() {
		return bookDAO;
	}

	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	/**
	 * 结账：传入哪个用户买了哪本书，买了几本
	 */
	public void checkout(String username, int bookId, int num) {
		BigDecimal price = bookDAO.getPrice(bookId);
		bookDAO.updateBalance(username, price.multiply(BigDecimal.valueOf(num)));
		bookDAO.updateStock(bookId, num);
	}

}
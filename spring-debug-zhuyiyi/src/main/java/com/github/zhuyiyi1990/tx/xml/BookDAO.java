package com.github.zhuyiyi1990.tx.xml;

import org.springframework.jdbc.core.JdbcTemplate;

import java.math.BigDecimal;

public class BookDAO {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	/**
	 * 按照图书的id来获取图书的价格
	 */
	public BigDecimal getPrice(int bookId) {
		String sql = "select price from book where id = ?";
		return jdbcTemplate.queryForObject(sql, BigDecimal.class, bookId);
	}

	/**
	 * 减去某个用户的余额
	 */
	public int updateBalance(String username, BigDecimal price) {
		String sql = "update account set balance = balance - ? where username = ?";
		return jdbcTemplate.update(sql, price, username);
	}

	/**
	 * 减库存，减去某本书的库存
	 */
	public int updateStock(int bookId, int num) {
		String sql = "update book set stock = stock - ? where id = ?";
		return jdbcTemplate.update(sql, num, bookId);
	}

}
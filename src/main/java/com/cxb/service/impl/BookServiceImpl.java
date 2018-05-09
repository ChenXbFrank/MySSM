package com.cxb.service.impl;

import java.util.List;

import com.cxb.dao.BookDao;
import com.cxb.entity.Book;
import com.cxb.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookServiceImpl implements BookService {

	// 注入Service依赖
	@Autowired
	private BookDao bookDao;

	@Override
	public Book getById(long bookId) {
		return bookDao.queryById(bookId);
	}

	@Override
	public List<Book> getList() {
		return bookDao.queryAll(0, 1000);
	}

}

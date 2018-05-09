package com.cxb.web;

import java.util.List;

import com.cxb.entity.Book;
import com.cxb.service.BookService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/book") // url:/模块/资源/{id}/细分 /seckill/list
public class BookController {

	private final Logger log = Logger.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	//http://localhost:8080/book/list
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	//@ResponseBody   加上这句话只是返回的list这个字符串哦
	private String list(Model model) {
		List<Book> list = bookService.getList();
		log.info("访问book/list***>"+list);
		model.addAttribute("list", list);
		// list.jsp + model = ModelAndView
		return "list";// WEB-INF/jsp/"list".jsp
	}

	//http://localhost:8080/book/detail/1000    这里会自动将1000 赋值给bookId
	@RequestMapping(value = "/detail/{bookId}", method = RequestMethod.GET)
	private String detail(@PathVariable("bookId") Long bookId, Model model) {
		if (bookId == null) {
			return "redirect:/book/list";
		}
		Book book = bookService.getById(bookId);
		log.error("访问book/detail/1000***>"+book);
		if (book == null) {
			return "forward:/book/list";
		}
		model.addAttribute("book", book);
		return "detail";
	}
}

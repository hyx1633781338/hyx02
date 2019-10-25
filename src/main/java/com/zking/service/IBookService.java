package com.zking.service;

import com.zking.model.Book;
import com.zking.util.PageBean;
import com.zking.vo.BookVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {
     int add(Book book);
     @Transactional(readOnly = true)
     Book load(Book book);
     int del(Integer bookId);
     int update(Book book);
     @Transactional(readOnly = true)
     List<Book> list(BookVo bookVo,PageBean pageBean);
     int addSelective(Book book);
     int updateSelective(Book book);
     int delAll(BookVo bookVo);
}

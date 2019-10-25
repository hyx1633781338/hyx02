package com.zking.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zking.mapper.BookMapper;
import com.zking.model.Book;
import com.zking.service.IBookService;
import com.zking.util.PageBean;
import com.zking.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int add(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public Book load(Book book) {

        return bookMapper.selectByPrimaryKey(book.getBookId());
    }

    @Override
    public int del(Integer bookId) {
        return bookMapper.deleteByPrimaryKey(bookId);
    }

    @Override
    public int update(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public List<Book> list(BookVo bookVo, PageBean pageBean) {

        return bookMapper.list(bookVo);
    }

    @Override
    public int addSelective(Book book) {
        return bookMapper.insertSelective(book);
    }

    @Override
    public int updateSelective(Book book) {
        return bookMapper.updateByPrimaryKeySelective(book);
    }

    @Override
    public int delAll(BookVo bookVo) {
        return bookMapper.delAll(bookVo);
    }


}

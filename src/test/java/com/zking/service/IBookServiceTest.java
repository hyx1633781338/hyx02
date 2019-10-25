package com.zking.service;

import com.zking.mapper.BookMapper;
import com.zking.model.Book;
import com.zking.service.impl.BookServiceImpl;
import com.zking.util.MybatisSessionFactoryUtils;
import com.zking.util.PageBean;
import com.zking.vo.BookVo;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class IBookServiceTest extends BaseTestCase{
    @Autowired
    private IBookService iBookService;



    private Book book;

    @Before
    public void setUp() throws Exception {

        this.book=new Book();
    }



        @Test
        public void add() throws Exception {
            for (int i=0;i<100;i++){
            book=new Book();
            book.setBookId(null);
            book.setBookName("aa");
            book.setBookBrief("fsa");
            book.setBookPrice(2f);
            this.iBookService.add(book);

       }

    }

    @Test
    public void addSelective() throws Exception {
            book=new Book();
            book.setBookId(null);
            book.setBookName("xxj");
            book.setBookPrice(222f);
            this.iBookService.addSelective(book);
    }

    @Test
    public void load() throws Exception {
        book.setBookId(3);
        Book b=iBookService.load(book);
        System.out.print(b);
    }

    @Test
    public void del() throws Exception {
        book.setBookId(1);
        int rowCount=iBookService.del(book.getBookId());
        System.out.print(rowCount);
    }
    @Test
    public void list() throws Exception {
        BookVo bookVo=new BookVo();
        PageBean pageBean=new PageBean();
       /* bookVo.setBookName("hyx");2
        bookVo.setMax(222f);
        bookVo.setMin(120f);*/
        List<Book> bookList=iBookService.list(bookVo,pageBean);
        for (Book b:bookList) {
            System.out.print(b);
        }
            }
    @Test
    public void update() throws Exception {
        book.setBookId(3);
        book.setBookName("bbb");
        book.setBookBrief("aaaa");
        book.setBookPrice(12f);
        int rowCount=iBookService.update(book);
        System.out.print(rowCount);
    }

    @Test
    public void updateSelective() throws Exception {
        book.setBookId(3);
        book.setBookName("hyxhahfdhhihu");
        int rowCount=iBookService.updateSelective(book);

        System.out.print(rowCount);
    }
    @Test
    public void delAll() throws Exception {
        BookVo bookvo=new BookVo();
        bookvo.setBookIds(new Integer[]{10,11,12,13});
        int rowCount=iBookService.delAll(bookvo);
        System.out.print(rowCount);
    }



}
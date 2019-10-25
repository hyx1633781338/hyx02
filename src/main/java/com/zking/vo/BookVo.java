package com.zking.vo;

import com.zking.model.Book;

public class BookVo extends Book{
    private Integer[] bookIds;
    private Float max;
    private Float min;

    public Float getMax() {
        return max;
    }

    public Float getMin() {
        return min;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public void setBookIds(Integer[] bookIds) {
        this.bookIds = bookIds;
    }

    public Integer[] getBookIds() {
        return bookIds;
    }
    public BookVo() {
    }

    public BookVo(Integer[] bookIds) {
        this.bookIds = bookIds;
    }
}

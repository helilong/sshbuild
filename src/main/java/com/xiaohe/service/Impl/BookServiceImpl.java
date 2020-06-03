package com.xiaohe.service.Impl;

import com.xiaohe.dao.BookMapper;
import com.xiaohe.pojo.Books;
import com.xiaohe.service.BookService;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookMapper bookMapper;
    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookByid(int bookId) {
        return bookMapper.deleteBookByid(bookId);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookByid(int bookId) {
        return bookMapper.queryBookByid(bookId);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }
}

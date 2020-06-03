package com.xiaohe.dao;

import com.xiaohe.pojo.Books;
import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int deleteBookByid(int bookId);
    //修改一本书
    int updateBook(Books books);
    //查询一本书
    Books queryBookByid(int bookId);
    //查询所有书
    List<Books> queryAllBooks();
}



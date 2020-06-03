package com.xiaohe.controller;

import com.xiaohe.pojo.Books;
import com.xiaohe.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BookService bookService;


    @RequestMapping("/allBooks")
    public String allBooks(Model model){
        System.out.println("1111111111111111222222222222");
        System.out.println(bookService.queryAllBooks());
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);
        return "allBooks";
    }

    @RequestMapping("/del/{bookId}")
    public String updateBook(@PathVariable("bookId") int bookId){
        System.out.println(bookId);
        bookService.deleteBookByid(bookId);
        return "redirect:/allBooks";
    }
    @RequestMapping("/update/{bookId}")
    public String update(@PathVariable("bookId")int bookId,Model model){
        System.out.println(bookId);
         Books books = bookService.queryBookByid(bookId);
         model.addAttribute("book",books);
        return "updateBook";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Books books,Model model){
        System.out.println("1111111111111"+books);
        bookService.updateBook(books);
        return "redirect:/allBooks";
    }
    @RequestMapping("/addBook")
    public String addBook(Books books){
        bookService.addBook(books);
        System.out.println("+++"+books);
        return "redirect:/allBooks";
    }
}

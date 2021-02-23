package com.etc.library.controller;

import com.etc.library.entity.Admin;
import com.etc.library.entity.Borrower;
import com.etc.library.entity.Tborrow;
import com.etc.library.entity.Tborrow1;
import com.etc.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.print.Book;
import java.util.List;

@Controller
public class LibraryAction {
   //hss
    //页面跳转
    @RequestMapping("/go")
    public String go(String go) {
        return go;
    }

    @Autowired
    LibraryService lservice;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(String name, String password) {
        Admin admin = lservice.login(name, password);
        String result = "";
        if (admin == null) {
            result = "login.jsp";
        } else
            result = "home.jsp";
        return result;
    }

    @RequestMapping(value = "/getBorrower", method = RequestMethod.POST)
    public String getBorrower(String idcardnum, Model model) {
        List<Borrower> borrowerList = lservice.getBorrower(idcardnum);
        model.addAttribute("borrowers", borrowerList);
        return "yonghu/user.jsp";
    }

    @RequestMapping(value = "/getBook", method = RequestMethod.GET)
    public String getBook(String bookname, Model model) {
        List<Book> bookList = lservice.getBook(bookname);
        model.addAttribute("books", bookList);
        return "shuku/book.jsp";
    }

    @RequestMapping("/returnInfo")
    public String getOne(Integer booknum, Model model) {
        com.etc.library.entity.Book book = lservice.getOne(booknum);
        model.addAttribute("book", book);
        return "shuku/skxg.jsp";
    }
    @RequestMapping("/updateBook")
    public String updateBook(Integer bookNumber, String bookName, String author, String publisher, String bookType) {
        lservice.updateBook(bookNumber, bookName, author, publisher, bookType);
        return "shuku/book.jsp";
    }
    @RequestMapping(value = "/addBook",method = RequestMethod.GET)
    public String addBook(com.etc.library.entity.Book book){
        System.out.println(book.getBookNumber()+""+book.getBookName()+""+book.getAuthor()+""+book.getPublisher()+""+book.getBookType());
        lservice.addBook(book);
        return "shuku/add.jsp";
    }
    @RequestMapping("/delBook")
    public String delBook(Integer bookNumber){
        lservice.delBook(bookNumber);
        return "shuku/book.jsp";
    }
    @RequestMapping("delTborrow")
    public String delTborrow(int id){
        lservice.delTborrow(id);
        return "huanshu/back.jsp";
    }
    @RequestMapping("delTborrow1")
    public String delTborrow1(int id){
        lservice.delTborrow(id);
        return "jieshu/borrow.jsp";
    }
    @RequestMapping("/delBorrower")
    public String delBorrower(String idCardNum){
        lservice.delBorrower(idCardNum);
        return "yonghu/user.jsp";
    }
    //liuyi
    @RequestMapping("/getBorrow")
    public String getBorrow(int id,Model model){
        List<Tborrow>tborrowList = lservice.getBorrow(id);
        model.addAttribute("borrows",tborrowList);
        return "huanshu/back.jsp";
    }
    @RequestMapping("/getBorrow1")
    public String getBorrow1(int id, Model model){
        List<Tborrow1>tborrow1List = lservice.getBorrow1(id);
        model.addAttribute("jieshu",tborrow1List);
        return "jieshu/borrow.jsp";
    }
    @RequestMapping(value = "/addBorrow",method = RequestMethod.GET)
    public String addBorrow(Tborrow tborrow){
        lservice.addBorrow(tborrow);
        return "huanshu/hsadd.jsp";
    }
    @RequestMapping(value = "/addBorrow1",method = RequestMethod.GET)
    public String addBorrow1(Tborrow1 tborrow1){
        lservice.addBorrow1(tborrow1);
        return "jieshu/jsadd.jsp";
    }
    @RequestMapping(value = "/addBorrower",method = RequestMethod.GET)
    public String addBorrower(Borrower borrower){
        lservice.addBorrower(borrower);
        return "yonghu/dzadd.jsp";
    }
}
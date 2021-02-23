package com.etc.library.service;


import com.etc.library.entity.Admin;
import com.etc.library.entity.Borrower;
import com.etc.library.entity.Tborrow;
import com.etc.library.entity.Tborrow1;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public interface LibraryService {
    //hss
    public Admin login(String name , String pwd);
    public List<Borrower> getBorrower (String idcardnum);
    public List<Book> getBook (String bookname);
    public com.etc.library.entity.Book getOne(Integer booknum);
    public void updateBook(Integer bookNumber ,String bookName ,String author,String publisher,String bookType);
    public void addBook(com.etc.library.entity.Book book);
    public void delBook(Integer bookNumber) ;
    public void delTborrow(int id) ;
    public void delTborrow1(int id) ;
    public void delBorrower(String idCardNum) ;
    //liuyi
    List<Tborrow> getBorrow(int id);
    List<Tborrow1> getBorrow1(int id);
    void addBorrow(Tborrow tborrow);
    void addBorrow1(Tborrow1 tborrow1);
    void addBorrower(Borrower borrower);
}


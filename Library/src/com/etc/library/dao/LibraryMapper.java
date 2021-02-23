package com.etc.library.dao;

import com.etc.library.entity.Admin;
import com.etc.library.entity.Borrower;
import com.etc.library.entity.Tborrow;
import com.etc.library.entity.Tborrow1;

import java.awt.print.Book;
import java.util.List;

public interface LibraryMapper {
   //hss
    Admin login(String name, String pwd);

    List<Borrower> getBorrower(String idcardnum);

    List<Book> getBook(String bookname);

    com.etc.library.entity.Book getOne(Integer booknum);

    void updateBook(Integer bookNumber, String bookName, String author, String publisher, String bookType);

    void addBook(com.etc.library.entity.Book book);

    void delBook(Integer bookNumber);

    void delTborrow(int id);
//liuyi
    List<Tborrow> getBorrow(int id);

    List<Tborrow1> getBorrow1(int id);

    void addBorrow(Tborrow tborrow);

    void addBorrow1(Tborrow1 tborrow1);

    void addBorrower(Borrower borrower);

    void delTborrow1(int id);

    void delBorrower(String idCardNum);
}

package com.etc.library.serviceImpl;

import com.etc.library.dao.LibraryMapper;
import com.etc.library.entity.Admin;
import com.etc.library.entity.Borrower;
import com.etc.library.entity.Tborrow;
import com.etc.library.entity.Tborrow1;
import com.etc.library.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.List;
  //hss
@Service ("lservice")//此注解表示当前类为逻辑层的类
    @Transactional(readOnly = true)//当前类启动事务，此事务是声明式事务
public class LibraryServiceImpl implements LibraryService {
    //在此位置需要从spring容器中取出需要的mapper接口
    @Autowired//表示自动从容器中根据id名称找到接口
            LibraryMapper libraryMapper;

    @Override
    public Admin login(String name, String pwd) {
        return libraryMapper.login(name, pwd);
    }

    @Override
    public List<Borrower> getBorrower(String idcardnum) {
        return libraryMapper.getBorrower(idcardnum);
    }

    @Override
    public List<Book> getBook(String bookname) {
        return libraryMapper.getBook(bookname);
    }

    @Override
    public com.etc.library.entity.Book getOne(Integer booknum) {
        return libraryMapper.getOne(booknum);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void updateBook(Integer bookNumber, String bookName, String author, String publisher, String bookType) {
        libraryMapper.updateBook(bookNumber, bookName, author, publisher, bookType);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void addBook(com.etc.library.entity.Book book) {
        libraryMapper.addBook(book);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void delBook(Integer bookNumber) {
        libraryMapper.delBook(bookNumber);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void delTborrow(int id) {
        libraryMapper.delTborrow(id);
    }

    @Override
    public void delTborrow1(int id) {
        libraryMapper.delTborrow1(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void delBorrower(String idCardNum) {
        libraryMapper.delBorrower(idCardNum);
    }


    //liuyi
    @Override
    public List<Tborrow> getBorrow(int id) {
        return libraryMapper.getBorrow(id);
    }

    @Override
    public List<Tborrow1> getBorrow1(int id) {
        return libraryMapper.getBorrow1(id);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void addBorrow(Tborrow tborrow) {
        libraryMapper.addBorrow(tborrow);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void addBorrow1(Tborrow1 tborrow1) {
        libraryMapper.addBorrow1(tborrow1);
    }

    @Override
    @Transactional(rollbackFor = Throwable.class)
    public void addBorrower(Borrower borrower) {
        libraryMapper.addBorrower(borrower);
    }


}
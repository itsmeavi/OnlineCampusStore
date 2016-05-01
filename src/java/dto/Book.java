/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import dao.BookDao;

/**
 *
 * @author free_bird
 */
public class Book {
     private String bookId;
     private String bookName;
     private String author;
     private String publication;
     private String edition;
     private String isbnNo;
     private String status;
     private String subject; 

   
 
   
    
    /*public String addBook() {
        String forward = "failure";
        //String empName = String.valueOf(this.getEmployeeName());
        
        boolean result = BookDao.addBookInfo(this);
        if (result) {
          // list=BookDao.showBookInfo();
            forward = "success";
        }   
        return forward;
    } */  

    /**
     * @return the bookId
     */
    public String getBookId() {
        return bookId;
    }

    /**
     * @param bookId the bookId to set
     */
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    /**
     * @return the bookName
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * @param bookName the bookName to set
     */
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the publication
     */
    public String getPublication() {
        return publication;
    }

    /**
     * @param publication the publication to set
     */
    public void setPublication(String publication) {
        this.publication = publication;
    }

    /**
     * @return the edition
     */
    public String getEdition() {
        return edition;
    }

    /**
     * @param edition the edition to set
     */
    public void setEdition(String edition) {
        this.edition = edition;
    }

    /**
     * @return the isbnNo
     */
    public String getIsbnNo() {
        return isbnNo;
    }

    /**
     * @param isbnNo the isbnNo to set
     */
    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the subject
     */
    public String getSubject() {
        return subject;
    }

    /**
     * @param subject the subject to set
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
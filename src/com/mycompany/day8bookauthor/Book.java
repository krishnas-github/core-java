package com.mycompany.day8bookauthor;

public class Book {
    int bookId;
    String bookTitle;
    String bookDescription;
    double bookPrice;
    Author a;
//set------------------------------
    void setBookId(int b_id){
        bookId = b_id;
    }
    void setBookTitle(String b_title){
        bookTitle = b_title;
    }
    void setBookDescription(String b_desc){
        bookDescription = b_desc;
    }
    void setBookPrice(int b_price){
        bookPrice = b_price;
    }
    void setAuthor(Author b_author){
        a = b_author;
    }
//get--------------------------
    int getBookId(){
        return(bookId);
    }
    String getBookTitle(){
        return(bookTitle);
    }
    String getBookDescription(){
        return(bookDescription);
    }
    double getBookPrice(){
        return(bookPrice);
    }
    Author getAuthor(){
        return(a);
    }


   /* public void contains(String book_name) {
    KGG}*/
}

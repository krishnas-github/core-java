package com.mycompany.bookauthorproject;

public class Author {
    int authorId;
    String authorName;

   /* public Author (int authId, String authName) {
        authorId = authId;
        authorName = authName;
    }*/
      //set--------------------------------------
      //Set method to input the authorid
    void setAuthorId ( int authid){
        authorId = authid;
      }
      //Set method to input the author name
    void setAuthorName (String authname){
        authorName = authname;
      }
      //get--------------------------------
    int getAuthorId () {
        return authorId;
      }
    String getAuthorName () {
        return authorName;
      }

}

package com.mycompany.day8bookauthor;

public class Author {
    int authorId;
    String authorName;
//set--------------------------------------
   //Set method to input the authorid
    void setAuthorId(int authid){
        authorId = authid;
    }
   //Set method to input the author name
    void setAuthorName(String authname){
        authorName = authname;
    }
    //get--------------------------------
    int getAuthorId(){
        return authorId;
    }
    String getAuthorName(){
        return authorName;
    }

}

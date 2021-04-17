package com.mycompany.day8bookauthor;

import com.mycompany.looping.WhileLoopMain;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args){
        int input = 0;
        int noOfBook = 0;
        int noOfAuthor = 0;
        int j=0;
        int p=0;
        int a=0;
        Book arrayOfBook[] = new Book[noOfBook];
        Author arrayOfAuthor[] = new Author[noOfAuthor];

        Scanner scan = new Scanner(System.in);
        do{

            System.out.println("Choose the options from below menu");
            System.out.println("-----------------------------------");
            System.out.println("0: Enter the number of books and author");
            System.out.println("1: Add authors");
            System.out.println("2: Add books");
            System.out.println("3: Search a book by book name");
            System.out.println("4: Display a book details");
            System.out.println("5: Display an author details");
            System.out.println("6: Display all books");
            System.out.println("7: Display all authors");
            System.out.println("99: Exit program");

            input = scan.nextInt();
            scan.nextLine();

            System.out.println("You entered the option: " + (input));

            switch (input) {

                case 0:
                    System.out.println("Please enter the number of books");
                    noOfBook = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Please enter the number of authors");
                    noOfAuthor = scan.nextInt();
                    scan.nextLine();
                    System.out.println("The entered number of books and author are: " + (noOfBook) + " and " + (noOfAuthor) + " respectively");
                    break;
                case 1:
                    arrayOfAuthor = new Author[noOfAuthor];
                    for (int i = 0; i < arrayOfAuthor.length; i++) {
                        arrayOfAuthor[i] = new Author();
                        System.out.println("Enter the name of author no." + (i + 1));
                       // scan.next();
                        arrayOfAuthor[i].setAuthorName(scan.nextLine());
                        System.out.println("Enter the id of author no." + (i + 1));
                       // scan.next();
                        arrayOfAuthor[i].setAuthorId(scan.nextInt());
                        scan.nextLine();
                    }
                    for (int i = 0; i < arrayOfAuthor.length; i++) {
                        System.out.println("The name of author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorName());
                        System.out.println("The id of author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorId());
                    }
                    break;
                case 2:
                    arrayOfBook = new Book[noOfBook];
                    for (int i = 0; i <arrayOfBook.length ; i++) {
                        arrayOfBook[i] = new Book();
                        System.out.println("Enter the name of book no." + (i + 1));
                        arrayOfBook[i].setBookTitle(scan.nextLine());
                        System.out.println("Enter the id of book no." + (i + 1));
                        arrayOfBook[i].setBookId(scan.nextInt());
                        scan.nextLine();
                        System.out.println("Enter the description of book no." + (i + 1));
                        arrayOfBook[i].setBookDescription(scan.nextLine());
                        System.out.println("Enter the price of book no." + (i + 1));
                        arrayOfBook[i].setBookPrice(scan.nextInt());
                        scan.nextLine();
                        System.out.println("Enter the author id for this book from the below list");
                        for (int l = 0; l < arrayOfAuthor.length; l++) {
                            System.out.println("The name of author no." + (l + 1) + " is: " + arrayOfAuthor[l].getAuthorName());
                            System.out.println("The id of author no." + (l + 1) + " is: " + arrayOfAuthor[l].getAuthorId());
                            System.out.println("--------------------------------------------");
                        }
                        int auth_id = scan.nextInt();
                        scan.nextLine();
                        Author temp_auth = null;
                        //Author k =new Author[];
                        for (int m = 0; m < arrayOfAuthor.length; m++) {
                            if(arrayOfAuthor[m].getAuthorId() == auth_id){
                                arrayOfBook[m].a = arrayOfAuthor[m];
                                //line 92 and 94 are same. In 92 we assigning the value to object and in 94 we are assigning via set method
                                //arrayOfBook[m].setAuthor(arrayOfAuthor[m]);
                                temp_auth = arrayOfAuthor[m];
                                break;
                            }
                        }
                        if(temp_auth == null){
                            System.out.println("No matching string found");
                        }
                        else{
                            System.out.println("Your chosen author name is" +temp_auth.getAuthorName());
                        }
                    }

                    for (int i = 0; i <arrayOfBook.length; i++) {
                        System.out.println("The name of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookTitle());
                        System.out.println("The id of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookId());
                        System.out.println("The description of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookDescription());
                        System.out.println("The price of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookPrice());
                        System.out.println(arrayOfBook[i].getAuthor().getAuthorName());
                    }
                    break;
                case 3:
                    System.out.println("Enter the book name which you need to search");
                    String search = scan.nextLine();
                    String b[] = new String[noOfBook];

                   for (int i = 0; i < arrayOfBook.length; i++) {
                       //String name = arrayOfBook[i];
                      boolean value = arrayOfBook[i].getBookTitle().contains(search);
                      // System.out.println(value);
                       if(value == true) {
                          // b=new String[j];
                           b[j] = arrayOfBook[i].getBookTitle();
                           j++;
                       }
                       }
                    if(j==0) {
                        System.out.println("Your search did not return any result. Try with different pattern");
                    }
                    else{
                        System.out.println("Below is your search result for book with the letters: " +search);
                        System.out.println("-------------------------------------------");
                        for(int k=0;k<j;k++){
                            System.out.println(k+1 +":) " +b[k]);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Please enter the book name for which you need the details");
                    String book_Name = scan.nextLine();
                    p=0;
                    for (int i = 0; i <arrayOfBook.length; i++) {
                        if(arrayOfBook[i].getBookTitle().matches(book_Name)){
                            p++;
                            System.out.println("The name of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookTitle());
                            System.out.println("The id of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookId());
                            System.out.println("The description of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookDescription());
                            System.out.println("The price of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookPrice());
                        }
                    }
                    if(p==0){
                        System.out.println("There is no such book");
                    }

                    break;
                case 5:
                    System.out.println("Please enter the author name for which you need the details");
                    String author_Name = scan.nextLine();
                    a=0;
                    for (int i = 0; i <arrayOfAuthor.length; i++) {
                        if(arrayOfAuthor[i].getAuthorName().matches(author_Name)){
                            a++;
                            System.out.println("The name of Author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorName());
                            System.out.println("The id of Author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorId());
                        }
                    }
                    if(a==0){
                        System.out.println("There is no such Author");
                    }
                    break;
                case 6:
                    System.out.println("Below is the list of available books in the library ");
                    System.out.println("------------------------------------------------------");
                    for (int i = 0; i <arrayOfBook.length; i++) {
                        System.out.println("The name of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookTitle());
                        System.out.println("The id of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookId());
                        System.out.println("The description of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookDescription());
                        System.out.println("The price of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookPrice());
                        System.out.println("The author of book is "+arrayOfBook[i].getAuthor().getAuthorName());

                    }
                    break;
                case 7:
                    System.out.println("7: Display all authors");
                    System.out.println("------------------------------------------------------------");
                    for (int i = 0; i < arrayOfAuthor.length; i++) {
                        System.out.println("The name of author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorName());
                        System.out.println("The id of author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorId());
                    }
                    break;
            }

        }
        while (input!=99);
    }
}

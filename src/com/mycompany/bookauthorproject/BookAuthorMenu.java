package com.mycompany.bookauthorproject;

import java.util.Scanner;

public class BookAuthorMenu {
    static Scanner scan = new Scanner(System.in);
    static int choice;

    public static void menu(){
        System.out.println("0: Enter the number of books and author");
        System.out.println("1: Add books");
        System.out.println("2: Add authors");
        System.out.println("3: Search a book by book name");
        System.out.println("4: Display a book details");
        System.out.println("5: Display an author details");
        System.out.println("6: Display all authors");
        System.out.println("7: Display all book");
        System.out.println("99: Exit program");
        System.out.println("Enter your choice");
        choice = scan.nextInt();
        scan.nextLine();

    }
    public static void main(String[] args){
        Author authors[] = null;
        Book books[] = null;
        int noOfBooks = 0;
        int noOfAuthors = 0;
        Book arrayOfBook[] = new Book[noOfBooks];
        Author arrayOfAuthor[] = new Author[noOfAuthors];
        Author author = null;
        Book book = null;
        while (true){

            menu();
            switch (choice)
            {
                case 0:
                    System.out.println("0: Enter the number of books and author");
                    System.out.println("Enter the number of books");
                    noOfBooks = scan.nextInt();
                    scan.nextLine();
                    books = new Book[noOfBooks];
                    System.out.println("Enter the number of author");
                    noOfAuthors = scan.nextInt();
                    scan.nextLine();
                    authors = new Author[noOfAuthors];
                    break;
                case 1:
                    System.out.println("Add " +noOfBooks+ " book Details");
                    arrayOfBook = new Book[noOfBooks];
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

                    }
                    break;
                case 2:
                    arrayOfAuthor = new Author[noOfAuthors];
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
                    break;
                case 3:
                    System.out.println("Search a book by book name");
                    break;
                case 4:
                    System.out.println("Display a book detail");
                    break;
                case 5:
                    System.out.println("Display an author detail");
                    break;
                case 6:
                    System.out.println("Display all books");
                    for (int i = 0; i <arrayOfBook.length; i++) {
                        System.out.println("The name of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookTitle());
                        System.out.println("The id of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookId());
                        System.out.println("The description of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookDescription());
                        System.out.println("The price of book no." + (i + 1) + " is: " + arrayOfBook[i].getBookPrice());
                    }
                        System.out.println("------------------------------------------");

                    break;
                case 7:
                    System.out.println("Display all author");
                    System.out.println("------------------------------------------------------------");
                    for (int i = 0; i < arrayOfAuthor.length; i++) {
                        System.out.println("The name of author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorName());
                        System.out.println("The id of author no." + (i + 1) + " is: " + arrayOfAuthor[i].getAuthorId());
                    }
                    break;
                case 99:
                    System.out.println("Exit the programme");
                    System.exit(0);
                default:
                    System.out.println("Wrong input! Please enter the correct choice");

            }
        }
    }
}

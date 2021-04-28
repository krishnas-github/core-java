package com.mycompany.bookauthorproject;

import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;

public class BookAuthorMenu {
    static Scanner scan = new Scanner(System.in);
    static int choice;

    public static void menu(){
        System.out.println("0: Enter the number of books and author");
        System.out.println("1: Add authors");
        System.out.println("2: Add book");
        System.out.println("3: Search a book by book name");
        System.out.println("4: Display a book details");
        System.out.println("5: Display an author details");
        System.out.println("6: Display all books");
        System.out.println("7: Display all authors");
        System.out.println("8: Update the detail");
        System.out.println("9: delete a record");
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
        int input =0;
        int id = 0;
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
                    //arrayOfAuthor = new Author[noOfAuthors];
                    for (int i = 0; i < noOfAuthors; i++) {
                        //authors[i] = new Author();
                        author = new Author();
                       // arrayOfAuthor[i] = new Author();
                        System.out.println("Enter the name of author no." + (i + 1));
                        // scan.next();
                        String authorName = scan.nextLine();
                        //arrayOfAuthor[i].setAuthorName(scan.nextLine());
                        System.out.println("Enter the id of author no." + (i + 1));
                        // scan.next();
                        int authorId = scan.nextInt();
                        //arrayOfAuthor[i].setAuthorId(scan.nextInt());
                        scan.nextLine();
                        author.setAuthorName(authorName);
                        author.setAuthorId(authorId);
                        authors[i] = author;
                    }
                    break;
                case 2:
                    System.out.println("Add " +noOfBooks+ " book Details");
                    //arrayOfBook = new Book[noOfBooks];
                    //book = new Book();//null point why?
                    for (int i = 0; i <noOfBooks ; i++) {
                        //book = new Book();
                        //arrayOfBook[i] = new Book();
                        System.out.println("Enter the name of book no." + (i + 1));
                        String bookName = scan.nextLine();
                        //arrayOfBook[i].setBookTitle(scan.nextLine());
                        System.out.println("Enter the id of book no." + (i + 1));
                        int bookId = scan.nextInt();
                        //arrayOfBook[i].setBookId(scan.nextInt());
                        scan.nextLine();
                        System.out.println("Enter the description of book no." + (i + 1));
                        String bookDescription = scan.nextLine();
                        //arrayOfBook[i].setBookDescription(scan.nextLine());
                        System.out.println("Enter the price of book no." + (i + 1));
                        int bookPrice = scan.nextInt();
                        //arrayOfBook[i].setBookPrice(scan.nextInt());
                        scan.nextLine();
                        System.out.println("Enter the author id for this book from the below list");
                        for (int l = 0; l < noOfAuthors; l++) {
                            System.out.println("The name of author no." + (l + 1) + " is: " + authors[l].getAuthorName());
                            System.out.println("The id of author no." + (l + 1) + " is: " + authors[l].getAuthorId());
                            System.out.println("--------------------------------------------");
                        }
                        int auth_id = scan.nextInt();
                        scan.nextLine();
                        Author temp_auth = null;
                        //Author k =new Author[];
                        for (int m = 0; m < noOfAuthors; m++) {
                            if(authors[m].getAuthorId() == auth_id){
                                //arrayOfBook[m].a = arrayOfAuthor[m];
                                //above line and below line are same. In above we assigning the value to object and in below we are assigning via set method
                                //arrayOfBook[m].setAuthor(arrayOfAuthor[m]);
                                temp_auth =new Author();
                                temp_auth = authors[m];
                                break;
                            }
                        }
                        if(temp_auth == null){
                            System.out.println("No matching author found");
                        }
                        else{
                            System.out.println("Your chosen author name is" +temp_auth.getAuthorName());
                        }
                       // arrayOfBook[i].setAuthor(temp_auth);
                        book = new Book();
                        //books[i] =new Book();
                        book.setBookTitle(bookName);
                        book.setBookId(bookId);
                        book.setBookDescription(bookDescription);
                        book.setBookPrice(bookPrice);
                        book.setAuthor(temp_auth);
                        books[i] = book;
                        //System.out.println(books[i].getBookTitle());

                    }
                    /*for (int i = 0; i < noOfBooks; i++) {
                        //System.out.println(books[i].getBookTitle());
                        System.out.println(books[i].getAuthor());
                    }*/
                    break;

                case 3:
                    System.out.println("Enter the book name which you need to search");
                    int j = 0;
                    String search = scan.nextLine();
                    String b[] = new String[noOfBooks];
                    for (int i = 0; i < noOfBooks; i++) {
                        //books[i] = new Book();
                        //String name = arrayOfBook[i];
                        boolean value = books[i].getBookTitle().toLowerCase().contains(search.toLowerCase());
                        // System.out.println(value);
                        if(value) {
                            // b=new String[j];
                            b[j] = books[i].getBookTitle();
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
                    int p=0;
                    for (int i = 0; i <noOfBooks; i++) {
                        if(books[i].getBookTitle().matches(book_Name)){
                            //books = new Book();
                            p++;
                            System.out.println("The name of book no." + (i + 1) + " is: " + books[i].getBookTitle());
                            System.out.println("The id of book no." + (i + 1) + " is: " + books[i].getBookId());
                            System.out.println("The description of book no." + (i + 1) + " is: " + books[i].getBookDescription());
                            System.out.println("The price of book no." + (i + 1) + " is: " + books[i].getBookPrice());
                            System.out.println("The author of book no." + (i + 1) + " is: " + books[i].getAuthor().getAuthorName());
                        }
                    }
                    if(p==0){
                        System.out.println("There is no such book");
                    }
                    break;
                case 5:
                    System.out.println("Please enter the author name for which you need the details");
                    String author_Name = scan.nextLine();
                    int a=0;
                    for (int i = 0; i <noOfAuthors; i++) {
                        if(authors[i].getAuthorName().matches(author_Name)){
                            a++;
                            System.out.println("The name of Author no." + (i + 1) + " is: " + authors[i].getAuthorName());
                            System.out.println("The id of Author no." + (i + 1) + " is: " + authors[i].getAuthorId());
                        }
                    }
                    if(a==0){
                        System.out.println("There is no such Author");
                    }
                    break;
                case 6:
                    System.out.println("Display all books");
                    for (int i = 0; i <noOfBooks; i++) {
                        System.out.println("The name of book no." + (i + 1) + " is: " + books[i].getBookTitle());
                        System.out.println("The id of book no." + (i + 1) + " is: " + books[i].getBookId());
                        System.out.println("The description of book no." + (i + 1) + " is: " + books[i].getBookDescription());
                        System.out.println("The price of book no." + (i + 1) + " is: " + books[i].getBookPrice());
                        System.out.println("The author of book no: " +(i+1)+ " is " +books[i].getAuthor().getAuthorName());
                    }
                        System.out.println("------------------------------------------");
                    break;
                case 7:
                    System.out.println("Display all author");
                    System.out.println("------------------------------------------------------------");
                    for (int i = 0; i < noOfAuthors; i++) {
                        System.out.println("The name of author no." + (i + 1) + " is: " + authors[i].getAuthorName());
                        System.out.println("The id of author no." + (i + 1) + " is: " + authors[i].getAuthorId());
                    }
                    break;
                case 8:
                    System.out.println("8: Update the detail");
                    System.out.println("Enter the option from below which you need to update");
                    System.out.println("---------------------------");
                    System.out.println("1: Book");
                    System.out.println("2: Author");
                    input = scan.nextInt();
                    scan.nextLine();
                    switch (input)
                    {
                        case 1:
                            System.out.println("Inside book detail");
                            break;
                        case 2:
                            System.out.println("Inside Author details");
                            //System.out.println("Please choose from below what you need to update");
                            //System.out.println("1: Author ID");
                            //System.out.println("2: Author name");
                            //int option = scan.nextInt();
                            //scan.nextLine();
                            //int i = 0;
                            //if(option ==1){
                            System.out.println("Select the author id from the below list which you need to update");
                            for (int i = 0; i < noOfAuthors; i++) {
                                System.out.println( (i + 1) + ": " + authors[i].getAuthorId());
                                }
                            System.out.println("--------------------------------");
                            id = scan.nextInt();
                            scan.nextLine();
                            for(int i=0;i<noOfAuthors;i++){
                                if (authors[i].getAuthorId() == id){
                                    //authors[i] = new Author();
                                    System.out.println("Id found at index" +(i+1));
                                    System.out.println("Enter the new id which you want to update");
                                    int id_new = scan.nextInt();
                                    scan.nextLine();
                                    authors[i].setAuthorId(id_new);
                                    //author.setAuthorId(id_new);
                                    System.out.println("Do you want to update the author name also? press 1 for yes and 2 for No");
                                    int YN = scan.nextInt();
                                    scan.nextLine();
                                    if(YN == 1) {
                                    System.out.println("Enter the new name");
                                    String name = scan.nextLine();
                                    //author.setAuthorName(name);
                                    authors[i].setAuthorName(name);
                                    break;
                                        }
                                    else if(YN == 2){
                                        break;
                                            }
                                    else {
                                        System.out.println("Incorrect choice");
                                        break;
                                        }
                                    }
                                }
                            break;
                        default:
                            System.out.println("Wrong input! Please enter the correct choice");
                            //System.exit(0);
                            break;
                    }
                    break;
                case 9:
                    System.out.println("9: delete a record");
                    System.out.println("Enter the option from below which you need to delete");
                    System.out.println("---------------------------");
                    System.out.println("1: Book");
                    System.out.println("2: Author");
                    input = scan.nextInt();
                    scan.nextLine();
                    switch (input){
                        case 1:
                            System.out.println("Inside book detail");
                            break;
                        case 2:
                            System.out.println("Inside author detail");
                            System.out.println("Select from the below author id which you need to delete");
                            for (int i =0;i<noOfAuthors;i++){
                                System.out.println(i+1+ ": " +authors[i].getAuthorId());
                            }
                            System.out.println("----------------------------------------");
                            id = scan.nextInt();
                            scan.nextLine();
                            int k =0;
                            Author temp[] = new Author[noOfAuthors];
                            for(int i=0;i<noOfAuthors;i++){
                                temp[k] = authors[i];
                                k=k+1;
                                if(authors[i].getAuthorId() == id){
                                    System.out.println("Id found at index" +(i+1));
                                    if(i+1==noOfAuthors){//to check if its a last record
                                        break;
                                    }
                                    temp[i] = authors[i+1];
                                    i=i+1;
                                }
                            }
                            noOfAuthors = noOfAuthors -1;
                            for(int i=0;i<noOfAuthors;i++){
                                System.out.println(i+1+ ": " +temp[i].getAuthorId());
                                System.out.println(i+1+ ": " +temp[i].getAuthorName());
                            }
                            for(int i=0;i<noOfAuthors;i++){
                                authors[i]=temp[i];
                            }
                            break;
                        default:
                            System.out.println("Wrong input! Please enter the correct choice");
                            break;
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

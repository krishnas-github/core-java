package com.mycompany.serializationdemo;

import java.io.*;

public class SerializationMain {
    public static void main(String[] args)  {
        Product product = new Product(1,"Shampoo", 100.0);
        String filename = "product.txt";
        try{
            FileOutputStream file = new FileOutputStream(filename);//Saving the object(product) in the file
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(product);//Method for serialization of the object
            out.close();
            file.close();
            System.out.println("Product has been serialized");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException ie){
            ie.printStackTrace();

        }

    }
}

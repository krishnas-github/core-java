package com.mycompany.serializationdemo;

import com.mycompany.day17handson.Catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationMain {
    public static void main(String[] args) {
    Product product1 = null;
    String filename = "product.txt";
    //Deserialization
    try {
        //Reading teh object from the file
        FileInputStream file = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file);
        //Method for deserialization of teh object
        product1 =(Product)in.readObject();//readobject creats am object of Object type,
        // so it is typecasted to product type by using(product)
        in.close();
        file.close();
        System.out.println("Object has been deserialized");
        System.out.println("productId = "+product1.getProductId());
        System.out.println("ProductName= "+product1.getProductName());
        System.out.println("ProductPrice = "+product1.getProductPrice());

    }
    catch (FileNotFoundException | ClassNotFoundException e) {
        e.printStackTrace();
    }
    catch (IOException e) {
        e.printStackTrace();
    }

    }

}

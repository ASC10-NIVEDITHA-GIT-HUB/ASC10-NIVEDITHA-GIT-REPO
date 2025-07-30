package com.ecz.repository;

import com.ecz.model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.ecz.repository.DbConnectionSingleton.connection;
import static com.ecz.repository.DbConnectionSingleton.getConnection;


public class ProductRepositoryDbImpl implements ProductRepository{
    @Override
    public boolean addProductToCart(Product product){
        try {
            Connection connection = getConnection();
            System.out.println("Driver Loaded!");
            Statement statement = connection.createStatement();
            System.out.println("Statement created");

            String insertQuery = "INSERT INTO product (id,name,price,quantity) VALUES ('" + product.getId()+"','"+product.getName()+"',"+product.getPrice()+","+product.getQuantity()+");";
            int noOfRowsAffected= statement.executeUpdate(insertQuery);
            System.out.println("No of rows affected: "+ noOfRowsAffected);
            return noOfRowsAffected >0;
        }catch(SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        return false;
    }
    private static Connection getConnection(){
        return DbConnectionSingleton.getInstance();
    }

    @Override
    public List<Product> getAllProducts(){
        List<Product> products= new ArrayList<>();
        try{
            Connection connection=getConnection();
            Statement statement=connection.createStatement();
            ResultSet resultSet= statement.executeQuery("SELECT * FROM product");
            while (resultSet.next()){
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
            }
        }
    }

}
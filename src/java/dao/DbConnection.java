/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bibek
 */
public class DbConnection {
    
    String url = "jdbc:mysql://localhost:3306/ecom?autoReconnect=true&useSSL=false";
    String username = "root";
    String password = "root";
    String sql = "select * from users where name = ? and password = ?";
    
    public int check(String uname, String pass) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                int isAdmin = rs.getInt(5);
                return isAdmin;
            }
            
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;        
    }
    
    public boolean register(String name, String email, String userPassword, String address, int contact) {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();            
            
            String getId = "SELECT MAX(id) FROM users";
            ResultSet rs = st.executeQuery(getId);
            if(rs.next()) {
                int id = rs.getInt(1);                
                String sql = "insert into users values ('"+(++id)+"', '"+name+"', '"+email+"', '"+userPassword+"', 0, '"+address+"', '"+contact+"')";
                st.executeUpdate(sql);

                return true;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return false;
    }
    
    
    public ArrayList<Product> getProduct() {
        ArrayList<Product> productList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();            
            
            String sql = "SELECT * FROM products";
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String price = rs.getString(3);
                String details = rs.getString(4);
                
                Product product = new Product(id, name, price, details);
                productList.add(product);
                

                return productList;
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }
    
}

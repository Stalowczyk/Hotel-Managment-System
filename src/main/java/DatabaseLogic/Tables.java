/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DatabaseLogic;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author pawel
 */
public class Tables {
    public static void main(String[] args)
    {
        Connection con = null;
        Statement st = null;
        try
        {
            con=ConnectionProvider.getCon();
            st=con.createStatement();
            st.executeUpdate("create table users(name varchar(200),password varchar(50),email varchar(200),address varchar(200),securityQuestion varchar(500),answer varchar(200),status varchar(20))");
            st.executeUpdate("create table room(roomNumber varchar(10),roomType varchar(200),bed varchar(200),price int,status varchar(20))");
            st.executeUpdate("create table customer(id int,name varchar(200),surname varchar(250),mobileNumber varchar(15),gender varchar(50),email varchar(200),idProof varchar(200),address varchar(500),checkInDate varchar(50),roomNumber varchar(10),bed varchar(200),roomType varchar(200),pricePerDay int(10),daysStayed int(10),totalPrice varchar(200),checkOut varchar(50))");
            JOptionPane.showMessageDialog(null,"Table created successfully");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        finally
        {
            try
            {
                con.close();
                st.close();
            }
            catch(Exception e)
            {
            }
        }
            
    }
    
}

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

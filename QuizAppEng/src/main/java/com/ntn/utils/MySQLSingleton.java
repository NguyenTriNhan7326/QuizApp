/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ntn.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class MySQLSingleton {
    private static MySQLSingleton instance;
    private Connection conn;
    static
    {
        try {
            //B1 -> Nap driver
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MySQLSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    private MySQLSingleton(){
        try {
            //B2 -> Mo ket noi
            conn = DriverManager.getConnection("jdbc:mysql://localhost/quizapp", "root", "root");
        } catch (SQLException ex) {
            Logger.getLogger(MySQLSingleton.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static MySQLSingleton getInstances(){
        if(instance == null){
            instance = new MySQLSingleton();
        }
        
        return instance;
    }
    public Connection connect(){
        return this.conn;
    }
    public void close(){
        if(this.conn != null){
            try {
                this.conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(MySQLSingleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

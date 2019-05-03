/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blac.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author BlackScorpion
 */
public class CPerfilController {
    Connection conectar = null;

    public CPerfilController() {
        try{
        Class.forName("org.postgresql.Driver");
        conectar = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres", "postgres", "postgresql");
        }catch(Exception e){
            System.out.println("x");
        }
    }
    
    public Connection getConnection(){
    return conectar;
    }
    
    public void desconectar(){
    conectar = null;
    }

    PreparedStatement PreparedStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pontodelivery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

   public class ConexaoBD {
       private Connection conexao;

       public Connection abrirConexao() throws SQLException {
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               String url = "jdbc:mysql://localhost:3306/pontodelivery";
               String usuario = "root";
               String senha = "Yudi02br@";
               conexao = DriverManager.getConnection(url, usuario, senha);
           } catch (ClassNotFoundException | SQLException e) {
               JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco: " + e.getMessage());
           }
           return conexao;
       }

       public void fecharConexao() {
           if (conexao != null) {
               try {
                   conexao.close();
               } catch (SQLException e) {
                   e.printStackTrace();
               }
           }
       }
   }
   
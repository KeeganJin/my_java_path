package com.jin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Jin
 * @Description
 * @date 9/16/2023 6:33 PM
 */
public class JDBCDemo03 {


    public static void main(String[] args) throws  Exception{

        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:3306/learnjdbc?useSSL=false";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url, username,password);


        String sql = "update learnjdbc.students set score = 12 where grade = 1;";

        Statement stmt = conn.createStatement();

        int count = stmt.executeUpdate(sql);


        System.out.println(count);

        stmt.close();
        conn.close();
    }
}

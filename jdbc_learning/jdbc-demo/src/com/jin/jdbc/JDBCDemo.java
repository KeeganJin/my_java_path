package com.jin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * @author Jin
 * @Description
 * @date 9/16/2023 4:28 PM
 */
public class JDBCDemo {

    public static void main(String[] args) throws  Exception{

        //1. register the driver
        Class.forName("com.mysql.jdbc.Driver");

        //2. get connection
        String url = "jdbc:mysql://127.0.0.1:3306/learnjdbc?useSSL=false";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url, username,password);

        //3. define sql
        String sql = "update learnjdbc.students set score = 12 where grade = 1;";

        //4. get sql object Statement
        Statement stmt = conn.createStatement();
//
//        5. execute sql
        int count = stmt.executeUpdate(sql);

        //6. process the resutl
        System.out.println(count);
//
//        //7. release resources
        stmt.close();
        conn.close();
    }
}

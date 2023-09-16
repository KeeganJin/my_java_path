package com.jin.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Jin
 * @Description
 * @date 9/16/2023 4:28 PM
 */
public class JDBCDemo02 {

    public static void main(String[] args) throws  Exception{

        //1. register the driver
        Class.forName("com.mysql.jdbc.Driver");

        //2. get connection
        String url = "jdbc:mysql://127.0.0.1:3306/learnjdbc?useSSL=false";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url, username,password);



        //3. define sql
        String sql1 = "update learnjdbc.students set score = 12 where grade = 1;";
        String sql2 = "update learnjdbc.students set score = 888 where grade = 2;";
        //4. get sql object Statement
        Statement stmt = conn.createStatement();



        try {
//        5. execute sql
            //start a transaction
            conn.setAutoCommit(false);
            int count1 = stmt.executeUpdate(sql1);
            int count2 = stmt.executeUpdate(sql2);
            //6. process the resutl
            System.out.println(count1);
            System.out.println(count2);
            conn.commit();
        } catch (Exception throwables) {
            conn.rollback();
            throwables.printStackTrace();
        }

//
//        //7. release resources
        stmt.close();
        conn.close();
    }
}

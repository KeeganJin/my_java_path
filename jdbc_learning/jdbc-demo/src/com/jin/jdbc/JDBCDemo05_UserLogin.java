package com.jin.jdbc;

import com.jin.pojo.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jin
 * @Description
 * @date 9/16/2023 6:33 PM
 */
public class JDBCDemo05_UserLogin {

    
    public static void main(String[] args) throws  Exception{

        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:3306/learnjdbc?useSSL=false";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url, username,password);

//        get username and password from frontend
        String name = "abc";
        String pwd = "666";



        String sql = "select * from learnjdbc.tb_user where username = '" + name + "'and password='" + pwd+"'" ;

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);


        if(rs.next()){
            System.out.println("cool");
        }else{
            System.out.println("noooo");
        }



//        rs.close();
//        stmt.close();
//        conn.close();
    }
}


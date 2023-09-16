package com.jin.jdbc;

import java.sql.*;

/**
 * @author Jin
 * @Description
 * @date 9/16/2023 6:33 PM
 */
public class JDBCDemo05_PreparedStatement {

    
    public static void main(String[] args) throws  Exception{

        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:3306/learnjdbc?useSSL=false";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url, username,password);

//        get username and password from frontend
        String name = "abc";
        String pwd = "666";



        String sql = "select * from learnjdbc.tb_user where username = ? and password=?";

        PreparedStatement pstmt = conn.prepareStatement(sql);

        //set the value for ?
        pstmt.setString(1,name);
        pstmt.setString(2,pwd);

        ResultSet rs = pstmt.executeQuery();


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


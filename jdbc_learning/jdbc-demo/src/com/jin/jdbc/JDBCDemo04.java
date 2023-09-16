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
public class JDBCDemo04 {

    
    public static void main(String[] args) throws  Exception{

        Class.forName("com.mysql.jdbc.Driver");


        String url = "jdbc:mysql://127.0.0.1:3306/learnjdbc?useSSL=false";
        String username = "root";
        String password = "mysql";
        Connection conn = DriverManager.getConnection(url, username,password);


        String sql = "select * from learnjdbc.students";

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        //create a list
        List<Student> list = new ArrayList<>();


        while(rs.next()){

            Student student = new Student();


            int id = rs.getInt("id");
            String name = rs.getString("name");
            int gender = rs.getInt("gender");

            student.setId(id);
            student.setName(name);
            student.setGender(gender);

            list.add(student);
            System.out.println(student.toString());
            System.out.println("--------------");
        }
        System.out.println(list);

        rs.close();
        stmt.close();
        conn.close();
    }
}


package com.mphasis.main.cui;

import jdk.nashorn.internal.codegen.CompilerConstants;
import sun.dc.pr.PRError;

import java.sql.*;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        Connection connection=null;
        //PreparedStatement preparedStatement=null;
        CallableStatement callableStatement=null;
        ResultSet resultSet=null;
        try {
            //register driver
            DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            //establish connection
             connection = DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-Q1QGOQF:1521:orcl","HR","renuka123");
            System.out.println("connected...");
            //connection.setAutoCommit(false);
            callableStatement = connection.prepareCall("{call USER_INSERT_PROC(?,?,?,?)}");
            callableStatement.registerOutParameter(1,Types.INTEGER);

            //query database
           // callableStatement.setInt(1,24);
            callableStatement.setString(2,"nelson");
            callableStatement.setString(3,"smith");
            callableStatement.setInt(4,53);
            resultSet=callableStatement.executeQuery();

//            if(resultSet.next()){
//                System.out.println(resultSet.getString(1));
//            }
            callableStatement.execute();

            //System.out.println(callableStatement.getString(1));
            //connection.commit();
            //preparedStatement=connection.prepareStatement("SELECT FIRST_NAME,LAST_NAME FROM EMPLOYEES WHERE DEPARTMENT_ID=50");
            //preparedStatement=connection.prepareStatement("INSERT INTO USERS VALUES(?,?,?,?) ");
            //preparedStatement=connection.prepareStatement("UPDATE USERS SET ID= ? WHERE FIRST_NAME=? ");

            //preparedStatement.setInt(1,77);
            //preparedStatement.setString(2,"abcd");
            //preparedStatement.setString(3,"fghj");
            //preparedStatement.setInt(4,36);

            //int rowsEffected = preparedStatement.executeUpdate();
            //System.out.println(rowsEffected);
            //resultSet =preparedStatement.executeQuery();

//            while (resultSet.next()){
//                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2));
//            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            try {
                if(resultSet!=null && !resultSet.isClosed()){
                    resultSet.close();
                }
//                if(preparedStatement!=null && !preparedStatement.isClosed()){
//                    preparedStatement.close();
//                }
                if(callableStatement !=null && !callableStatement.isClosed()){
                    callableStatement.close();
                }
                if(connection!=null && !connection.isClosed()){
                    connection.close();
                }
            }
            catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }
}

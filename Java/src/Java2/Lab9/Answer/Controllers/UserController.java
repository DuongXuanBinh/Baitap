package Java2.Lab9.Answer.Controllers;

import java.sql.*;
import java.util.*;
import java.util.Scanner;

import Java2.Lab9.Answer.Models.*;

public class UserController {
    List<User> userlist = new ArrayList<>();
    String url = "jdbc:mysql://localhost:3306/ebookstore";
    String username = "root";
    String password = "";

    public List<User> loading() {
        try (
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
        ) {
            String select = "Select * from users";
            ResultSet rset = stmt.executeQuery(select);
            while (rset.next()) {
                User obj = new User();
                obj.setId(rset.getInt("id"));
                obj.setUsername(rset.getString("name"));
                obj.setPassword(rset.getString("password"));
                obj.setRole(rset.getInt("role"));
                obj.setCreate(rset.getString("createddate"));
                obj.setUpdate(rset.getString("updateddate"));
                userlist.add(obj);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return userlist;
    }


    public User signIn() {
        User obj = new User();
        try (
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
        ) {
            Scanner input = new Scanner(System.in);
            System.out.println("(SignIn)Enter your username: ");
            String name = input.nextLine();
            System.out.println("(SignIn)Enter your password: ");
            String pass = input.nextLine();
            String select = "Select * from users where name ='" + name + "' AND password ='" + pass + "'";
            ResultSet rset = stmt.executeQuery(select);
            int row =0;
            while (rset.next()) {
                int id = rset.getInt("id");
                String username = rset.getString("name");
                String password=rset.getString("password");
                int role=rset.getInt("role");
                String create = rset.getString("createddate");
                String update=rset.getString("updateddate");
                obj = new User(id,username,password,role,create,update);
                ++row;
            }
            if (row == 0){
                System.out.println("Wrong username or password");
                return null;
            }else {
                System.out.println("Sign in successfully");
                return obj;
            }
        }catch(SQLException ex){
            ex.printStackTrace();
            return null;
        }
    }
    public void displayUser(){
        try (
                Connection conn = DriverManager.getConnection(url,username,password);
                Statement stmt = conn.createStatement();
        ) {
            String stt = "Select * from users";
            ResultSet rset = stmt.executeQuery(stt);
            ResultSetMetaData rsetMD = rset.getMetaData();
            int numColums = rsetMD.getColumnCount();
            for (int i = 1; i <= numColums; i++) {
                System.out.printf("%-30s", rsetMD.getColumnName(i));
            }
            loading();
            for(int i=0;i<userlist.size();i++){
                System.out.println(userlist.get(i).toString());
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    public int checkAccount(String name){
        try (
                Connection conn = DriverManager.getConnection(url, username, password);
                Statement stmt = conn.createStatement();
        ) {
            ResultSet rset = stmt.executeQuery("Select * from users where name ='"+name+"'");
            int row = 0;
            while(rset.next()){
                ++row;
            }
            if(row==0){
                System.out.println("You can use this account name");
                return 0;
            }
            else{
                System.out.println("Enter another account name");
                return 1;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }return -1;
    }
}


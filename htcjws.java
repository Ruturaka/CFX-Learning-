package com.codewithrutu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class htcjws {

    private final String url = "jdbc:postgresql://localhost/dvdrental";
    private final String user = "postgres";
    private final String password = "RPostgre17";
    public Connection connect(){
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(url,user,password);
            System.out.println("Finally connected to the PostgreSQL server successfully");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
    public void getFilms(String pattern, int releasrYear){

        String SQL="SELECT * FROM get_film (?,?)";
        try(Connection conn=this.connect();
            PreparedStatement pstmt=conn.prepareStatement(SQL)){

            pstmt.setString(1,pattern);
            pstmt.setInt(2,releaseYear);
            ResultSet rs=pstmt.executeQuery();

            while(rs.next()){
                System.out.println(String.format("%s %d",
                        rs.getString("film_title"),rs.getInt("film_release_year")));

            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
    public static void main(String[] args)
    {
        htcjws obj=new htcjws();
        obj.getFilms("%er",2006);
    }
}

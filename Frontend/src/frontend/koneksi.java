/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi {
    private static Connection cobajf;
    public static Connection GetConnection()throws SQLException{
        if (cobajf==null){
            Driver driver = new Driver();
            cobajf = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_manag","root","");
        }
        return cobajf;
    }
}

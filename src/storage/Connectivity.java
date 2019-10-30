package storage;

/*
 * Restaurant Booking System: example code to accompany
 *
 * "Practical Object-oriented Design with UML"
 * Mark Priestley
 * McGraw-Hill (2004)
 */

import java.io.* ;
import java.sql.* ;
import java.util.* ;

public class Connectivity
{
  /**
   * getConnection() takes the name of a property file and returns
   * a connection.  A null return indicates failure to make a connection.
   * Any exceptions raised are printed, for ease of tracing.
   *
   * We assume the property file contains:
   *
   *   jdbc.driver: the name of the driver to be used
   *   jdbc.url:    the URL of the database to connect to
   */
  
  public static Connection getConnection(/*String propFile*/)
  {
	  
	  Connection con = null;
      PreparedStatement pstmt = null;   
      ResultSet rs = null;

      try {
    	  	String dbURL = "jdbc:mariadb://127.0.0.1:3306/booksysweb";
			String dbID = "root";
			String dbPassword = "smdtlr";
			Class.forName("org.mariadb.jdbc.Driver");
			
			con = DriverManager.getConnection(dbURL, dbID , dbPassword);
			
          //pstmt = con.prepareStatement("select * from booksys.table");
          
          //System.out.println(pstmt);
          
          //rs = pstmt.executeQuery();
          
         // while(rs.next()) {
              //.
         //}
      } catch(Exception e) {
          e.printStackTrace();
      } 
      
      return con;
  }
}

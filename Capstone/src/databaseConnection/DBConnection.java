package databaseConnection;
/**
* Java Course 4 Capstone
*
* @author John Russel Sauli
* @Description:  A simple Automobile Insurance Policy and 
* 				Claims Administration system (PAS) will be created
* 			    to manage customer automobile insurance policies 
* 				and as well as accident claims for an insurance company. 
* 
* Created Date: 6/25/2022
* Modified Date:6/25/2022
* @Modified By: John Russel Sauli
*
*/

import java.sql.Connection;
import java.sql.DriverManager;

/*
 *  A class that set connection to the database
*/
public class DBConnection {

	private Connection dbConnection;

	public Connection setConnection() {

		try {

			dbConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/course4", "root", "1234"); // configuration of database

		} catch (Exception e) {
			System.out.println(e);
		}

		return dbConnection; // return the set connection
	}
}
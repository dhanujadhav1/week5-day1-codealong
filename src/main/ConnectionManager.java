package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
public Connection getConnection() throws ClassNotFoundException, SQLException {
	//Registering the driver class
	Class.forName("oracle.jdbc.OracleDriver");
	//create connection object
	Connection con=null;
	con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
	
	if(con !=null)
		System.out.println("Established");
	return con;
}
}

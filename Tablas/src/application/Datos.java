package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

public class Datos {

	
	public LinkedList<Vuelo> getDatos() {
		Vuelo a = null;
		LinkedList<Vuelo> data = new LinkedList<>();
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin;@localhost","aerolinea","aerolinea");
			
			Statement st = conn.createStatement();
			
			String query = "select * from vuelo";
			
			ResultSet result =  st.executeQuery(query);
			
			while(result.next()) {
				a = new Vuelo(result.getString(2), result.getString(3), result.getString(4), result.getString(5));
				data.add(a);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return data;
				
	}
}

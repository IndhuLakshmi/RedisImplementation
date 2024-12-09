package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.ConfigurationManager;

public class JdbcDataRecord {
	
//	private static final String URL = "jdbc:mysql://20.235.243.83:3306/opentaps?useSSL=false";
//	private static final String user = "sandbox";
//	private static final String password = "Leaf9823DT23132";
	
	
	
//	public static String[] getRandomLeadDB() {
		
		public static LeadInfo getRandomLeadDB() {
			
		LeadInfo leadInfo = new LeadInfo();
		String query = "SELECT  PARTY_ID, FIRST_NAME, LAST_NAME from opentaps.PERSON Order By RAND() LIMIT 1";
//		String[] leadInfo = new String[3];
		try {
			
			
//			Connection connection = DriverManager.getConnection(URL, user, password);
//			Statement statement = connection.createStatement();
			
			Connection connection = DriverManager.getConnection(ConfigurationManager.configuration().dbUrl(), 
	        ConfigurationManager.configuration().dbUser(), ConfigurationManager.configuration().dbPassword());
	        Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery(query);
			
			while(rs.next()) {
//				leadInfo[0] = rs.getString(1);
//				leadInfo[1] = rs.getString(2);
//				leadInfo[2] = rs.getString(3);
//				System.out.println("Lead Id "+leadInfo[0]);
				
				leadInfo.setPartyId(rs.getString(1));
				leadInfo.setFirstName(rs.getString(2));
				leadInfo.setLastName(rs.getString(3));
			}
			 
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		return leadInfo;
		return leadInfo;
	}
	

}

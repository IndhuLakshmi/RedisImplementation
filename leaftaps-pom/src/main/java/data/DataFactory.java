package data;

public class DataFactory {
	
	
	
	public static LeadInfo getData(DataSource dataSource)
	{
		LeadInfo leadInfo = new LeadInfo();

		switch(dataSource)
		{
		case DB:			
			leadInfo = JdbcDataRecord.getRandomLeadDB();
			return leadInfo;
			
		case Faker:
			leadInfo = FakerDataEngine.getLeadInfo();
			return leadInfo;
		default:
			throw new IllegalArgumentException("Unsupported Datasource type");	
		}
		
	}

}

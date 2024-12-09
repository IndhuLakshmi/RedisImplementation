package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.DataFactory;
import data.DataSource;
import data.JdbcDataRecord;
import pages.BasePage;
import pages.FindLeadPage;
import pages.LeadsPage;

public class TC004_DeleteLead extends BasePage {
	

	@Test()
	public void runDeleteLead() throws InterruptedException {
		
		
//		String[] leadDB = JdbcDataRecord.getRandomLeadDB();

				new LeadsPage()
				.clickFindLeadsLink()
				.enterLeadID(DataFactory.getData(DataSource.DB).getPartyId())
				.clickFindLeadButton()
				.clickFirstLead()
				.clickDeleteButton()
				.clickFindLeadsLink()
				.clickLeadIDTab()
				.enterLeadID(DataFactory.getData(DataSource.DB).getPartyId())
				.clickFindLeadButton()
				.verifyDeletedLeadID();

	}
}

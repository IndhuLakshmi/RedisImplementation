package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.FakerDataEngine;
import data.JdbcDataRecord;
import data.LeadInfo;
import pages.BasePage;
import pages.LeadsPage;

public class TC002_EditLead extends BasePage {

	
	@Test()
	public void runEditLead() throws InterruptedException {

		// leadID >> 
		// companyName >> 
		
//		String[] leadDB = JdbcDataRecord.getRandomLeadDB();
//		LeadInfo leadFaker = FakerDataEngine.getLeadInfo();
//		
//		new LeadsPage()
//		.clickFindLeadsLink()
//		.enterLeadID(leadDB[0])
//		.clickFindLeadButton()
//		.clickFirstLead()
//		.clickEditButton()
//		.updateCompanyName(leadFaker.getCompanyName())
//		.clickUpdate()
//		.verifyCompanyName(leadFaker.getCompanyName());
	}
}

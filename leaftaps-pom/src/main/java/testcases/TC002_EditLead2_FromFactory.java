package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.DataFactory;
import data.DataSource;
import data.FakerDataEngine;
import data.JdbcDataRecord;
import data.LeadInfo;
import pages.BasePage;
import pages.LeadsPage;

public class TC002_EditLead2_FromFactory extends BasePage {

	
	@Test()
	public void runEditLead() throws InterruptedException {

		// leadID >> 
		// companyName >> 
		
		System.out.println("Indhu" + DataFactory.getData(DataSource.DB).getPartyId());
		
		new LeadsPage()
		.clickFindLeadsLink()
		.enterLeadID(DataFactory.getData(DataSource.DB).getPartyId())
		.clickFindLeadButton()
		.clickFirstLead()
		.clickEditButton()
		.updateCompanyName(DataFactory.getData(DataSource.Faker).getCompanyName())
		.clickUpdate()
		.verifyCompanyName(DataFactory.getData(DataSource.Faker).getCompanyName());
	}
}

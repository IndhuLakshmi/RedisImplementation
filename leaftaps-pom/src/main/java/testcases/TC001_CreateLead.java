package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import data.FakerDataEngine;
import data.LeadInfo;
import pages.BasePage;
import pages.LeadsPage;

public class TC001_CreateLead extends BasePage {

   
    @Test(invocationCount = 2)
    public void runCreateLead() {
        
    	LeadInfo leadInfo = FakerDataEngine.getLeadInfo();
    	
    		new LeadsPage()
            .clickCreateLeadLink()
            .enterCompanyName(leadInfo.getCompanyName())
            .enterFirstName(leadInfo.getFirstName())
            .enterLastName(leadInfo.getLastName())
            .enterPhno(leadInfo.getPhoneNumber())
            .clickSubmit();
    }
}

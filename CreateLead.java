package week6.day1;


import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class CreateLead extends BaseClass{
	@Test(dataProvider="fetchValues")
	public void runCreateLead(String cName,String fName,String lName,String phNo) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
	}


@DataProvider(name="fetchValues")
public String[][] testData() {
	String[][] values= new String[2][4];
	
	values[0][0]= "TestLeaf";
	values[0][1]="Hari";
	values[0][2]="L";
	values[0][3]="987";
	
	values[1][0]= "TestLeaf";
	values[1][1]="Mani";
	values[1][2]="K";
	values[1][3]="698";
	return values;
	
}

}
	





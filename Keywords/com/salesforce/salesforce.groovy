package com.salesforce

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.server.DriverFactory

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class salesforce {
	
	
	@Keyword
	def From_date() {
		WebDriver driver = DriverFactory.getWebDriver()
		TestObject F_month_year = findTestObject('null')

		String cmonth = WebUI.getText(F_month_year)


		String date1 = "10-April 2024";

		String edate = date1.split("-")[0]

		String emonth = date1.split("-")[1]


		while((!cmonth.equals(emonth))) {
			TestObject btn_next = findTestObject("//button[@type='button'])[153]")

			WebUI.click(btn_next)

			cmonth = WebUI.getText(F_month_year)
		}
		List<WebElement> el = driver.findElements(By.xpath("//p[@class='MuiTypography-root MuiTypography-body2 MuiTypography-colorInherit']"))

		for(WebElement e :el) {
			//			System.out.println(e.getText()+"******")
			if(e.getText().equals(edate)) {
				e.click()
				break;
			}
		}
	}
	
}

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys



if (WebUI.waitForElementPresent(abc,10)) {


	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Click On Quota Refinement'),
			null, FailureHandling.STOP_ON_FAILURE)

	System.println("You are entered in the Quota Refinement")

	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Click On New Quota Refinement'),
			null, FailureHandling.STOP_ON_FAILURE)

	System.println("You are entered in the Add New Quota Refinement")

	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Form/Fill the form first turn'),
			null, FailureHandling.STOP_ON_FAILURE)

	System.println("You are Filled out the Form")

} else if (WebUI.waitForElementPresent(more, 20)) {


	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Click on More option'),
			null, FailureHandling.CONTINUE_ON_FAILURE)

	System.println("You are entered in the Dropdown Menu")

	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Click On Quota Refinement'),
			null, FailureHandling.CONTINUE_ON_FAILURE)

	System.println("You are entered in the Quota Refinement")

	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Click On New Quota Refinement'),
			null, FailureHandling.CONTINUE_ON_FAILURE)

	System.println("You are entered in the Add New Quota Refinement")

	WebUI.callTestCase(findTestCase('Test Cases/TC-01/LookUps/Form/Fill the form first turn'),
			null, FailureHandling.CONTINUE_ON_FAILURE)

	System.println("You are Filled out the Form")
}


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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String Name_f = 'Object Repository/Home Page/Add New Quota Form/Select Roster'

WebUI.click(findTestObject(Name_f), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.click(findTestObject(Name_f))

String Name_ff = 'Object Repository/Home Page/Add New Quota Form/search roster'

WebUI.click(findTestObject(Name_ff), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

WebUI.sendKeys(findTestObject(Name_ff), Name, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject(Name_ff), Keys.chord(Keys.ENTER))

String Name_fff = 'Object Repository/Home Page/Add New Quota Form/Clicked on search item roster'

WebUI.click(findTestObject(Name_fff), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

String Name_ffff = 'Object Repository/Home Page/Add New Quota Form/click on save after selecting roster'

WebUI.click(findTestObject(Name_ffff), FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()
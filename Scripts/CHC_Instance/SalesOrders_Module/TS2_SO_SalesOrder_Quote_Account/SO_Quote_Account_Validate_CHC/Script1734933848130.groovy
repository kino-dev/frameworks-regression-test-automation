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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo2/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo)/input_User ID_userid'), 
    'manaki')

WebUI.setEncryptedText(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo)/input_Password_password'), 
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/div_Login'))

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/img'))

WebUI.setText(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/input_Customer No_CustId'), 
    '518451')

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/td_Find'))

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/div_Invoices, Orders, Quotes, Projects  Jobs'))

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/td_Find Invoices'))

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/td_Kino Rafael Manalo (manaki)'))

WebUI.click(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo2)/div_Logout'))


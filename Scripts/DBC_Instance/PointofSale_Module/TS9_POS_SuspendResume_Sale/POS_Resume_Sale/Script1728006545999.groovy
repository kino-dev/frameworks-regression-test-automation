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
//additional imports
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.Integer as Integer

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(1)

Cell cell = row.getCell(1)

invoiceNum = cell.getStringCellValue()

println(invoiceNum)

sourceFile.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_CHC/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_CHC/Page_Frameworks (Demo)/td_Point Of Sale'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/div_ResumeSale'))

WebUI.setText(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/input_FromNumber'), 
    invoiceNum)

WebUI.setText(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/input_ToNumber'), 
    invoiceNum)

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/img_Calendar_icon'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/td_Today'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/td_Find'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/first_invoiceNumber_link'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/div_FinishSale (S)'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/img_Please Select_isc_W4'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/div_Cash'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/div_Pay'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS9_POS_Suspend_Resume_Sale_DBC/Page_Frameworks (Demo)/div_Logout'))



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

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
docketNumber = cell.getStringCellValue()

println(docketNumber)

//Get the demo environment URL from test data container
FileInputStream sourceTestData_FwksEnv = new FileInputStream(Source_Env)

XSSFWorkbook sourceTestDataContainer_workbook = new XSSFWorkbook(sourceTestData_FwksEnv)

XSSFSheet sourceTestData_sheet = sourceTestDataContainer_workbook.getSheet('Sheet1')

// cell B1
Row currentSheet_row = sourceTestData_sheet.getRow(1)

Cell currentSheet_cell = currentSheet_row.getCell(1)

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
DBC_Demo = currentSheet_cell.getStringCellValue()

println(DBC_Demo)

sourceTestData_FwksEnv.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(DBC_Demo)

WebUI.setText(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/burger_Menu'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/td_Credit Notes'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_New'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

transaction_Number = WebUI.getText(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/transaction_Number'))

println(transaction_Number)

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/table_Select a Value'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_Overcharge'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/table_Reason'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_M - Incorrect Pricing (c'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), 
    docketNumber)

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/img_Branch_selector'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_228 - DEMONSTRATION BRANCH 228'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_Load Details'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_UnitCredit'))

WebUI.sendKeys(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/input_EA_unitSellBrowse'), 
    '2')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/img_Pay_selection'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_EFTPOS_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_Refund'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/img_EFTPOSTransact'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS8_POS_CashRefund_Overcharge/Page_Frameworks (Demo)/div_Logout'))


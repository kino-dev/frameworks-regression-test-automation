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

sourceFile.close()

//Get the demo environment URL from test data container
FileInputStream sourceTestData_FwksEnv = new FileInputStream(Source_Env)

XSSFWorkbook sourceTestDataContainer_workbook = new XSSFWorkbook(sourceTestData_FwksEnv)

XSSFSheet sourceTestData_sheet = sourceTestDataContainer_workbook.getSheet('Sheet1')

// cell B1
Row currentSheet_row = sourceTestData_sheet.getRow(2)

Cell currentSheet_cell = currentSheet_row.getCell(1)

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
CHC_Demo = currentSheet_cell.getStringCellValue()

println(CHC_Demo)

sourceTestData_FwksEnv.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(CHC_Demo)

WebUI.setText(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/input_Password_password'), 'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/td_Credit Notes'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_New'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

transaction_Number = WebUI.getText(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/transaction_Number'))

println(transaction_Number)

WebUI.setText(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'Lee Pearce (518451)')

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_Lee Pearce (518451)'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/table_Select a Value'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_Stock Return'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/table_Reason_isc_YX'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_1 - Stock Return'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), docketNumber)

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_BranchDropdown'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_501 - DEMONSTRATION BRANCH 501'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_Load Details'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS5_POS_CashRefund_Full_CHC/Page_Frameworks (Demo)/div_CreditQty_Row1'))

WebUI.sendKeys(findTestObject('Object Repository/TS5_POS_CashRefund_Full_CHC/Page_Frameworks (Demo)/input_CreditQty_row1'),
	'1')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_CHC/Page_Frameworks (Demo)/div_Refund'))

FileInputStream updatesourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook updateWorkbook = new XSSFWorkbook(updatesourceFile)

XSSFSheet updateSheet = updateWorkbook.getSheet('Sheet1')

// cell B1
Row updateRow = updateSheet.getRow(0)

Cell updateCell = updateRow.getCell(1)

updateRow = updateSheet.createRow(2)

updateCell = updateRow.createCell(0)

updateCell.setCellValue('TransactionNumber')

updateCell = updateRow.createCell(1)

updateCell.setCellValue(transaction_Number)

FileOutputStream fos = new FileOutputStream(ExcelFile)

updateWorkbook.write(fos)

fos.close()

updatesourceFile.close()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Accountdropd'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Logout'))


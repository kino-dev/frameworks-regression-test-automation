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

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Password_password'), 
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_Point Of Sale'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

invoiceNum = WebUI.getText(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_invoiceNum'))

//WebUI.setText(findTestObject('Object Repository/Pick_Release_SO_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
//    '2237')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Pick_Release_SO_CHC/Page_Frameworks (Demo)/input_PIN_pin'), 'uzzxF8+Oh1A=')
//
//WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_OK'))

WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_P_prodId'), '5006866')

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'), 
    '2')

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_FinishSale (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_50 Cash'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_SaveClose (S)'))

//WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId_1'), 
//    '2237')
//
//WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_PIN_pin_1'), '2237')
//
//WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_OK_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(0)

Cell cell = row.getCell(1)

row = sheet.createRow(1)

cell = row.createCell(0)

cell.setCellValue('Invoice Number')

cell = row.createCell(1)

cell.setCellValue(invoiceNum)

FileOutputStream fos = new FileOutputStream(ExcelFile)

workbook.write(fos)

fos.close()

sourceFile.close()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Accountdropd'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Logout'))


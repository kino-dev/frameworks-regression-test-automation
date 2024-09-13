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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/td_Point Of Sale'))

transactionNum = WebUI.getText(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_invoiceNum'))

println(transactionNum)

transactionNum = transactionNum.toInteger() + 1

println(transactionNum)

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/div_PayAccount'))

WebUI.setText(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'Joe Chila (3379)')

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/div_JOE CHILA (3379)'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/td_Payment Number_isc_QH'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/input_Payment Amount_valuePayment'))

WebUI.sendKeys(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/input_Payment Amount_valuePayment'), 
    '5')

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/td_Tendering'))

WebUI.click(findTestObject('Object Repository/TS7_POS_AccountPayment/Page_Frameworks (Demo)/div_5 Cash'))

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(0)

Cell cell = row.getCell(1)

row = sheet.createRow(1)

cell = row.createCell(0)

cell.setCellValue('TransactionNumber')

cell = row.createCell(1)

cell.setCellValue(transaction_Number)

FileOutputStream fos = new FileOutputStream(ExcelFile)

workbook.write(fos)

fos.close()

sourceFile.close()

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))

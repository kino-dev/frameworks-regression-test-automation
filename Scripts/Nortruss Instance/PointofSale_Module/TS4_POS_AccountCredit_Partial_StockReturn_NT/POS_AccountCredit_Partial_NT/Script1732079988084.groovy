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

sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

//cell B1
Row row = sheet.getRow(1)

Cell cell = row.getCell(1)

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
docketNumber = cell.getStringCellValue()

println(docketNumber)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.nt.nortruss.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_User ID_userid'), 
    username)

WebUI.setEncryptedText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Password_password'), 
    'C5+8mNJ15mA=')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/img_FW'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_Credit Notes'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_New'))

WebUI.setEncryptedText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
    'uzzxF8+Oh1A=')

WebUI.setEncryptedText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_PIN_pin'), 
    'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_OK'))

transaction_Number = WebUI.getText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/transaction_Number'))

println(transaction_Number)

WebUI.doubleClick(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Customer_idCustX'))

WebUI.setText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    '17179')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Tiffany Brown (17179) (1)'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/img_Select a Value_isc_FP'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Stock Return'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/img_Reason_isc_FU'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_01 - Stock Returned_1'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Original Docket_originalDocket'))

WebUI.sendKeys(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), 
    docketNumber)

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_No line items loaded'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/span'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Load Details'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Tally'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_2'))

WebUI.setText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_LM_tallyQuantity'), 
    '1')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_2.000'))

WebUI.sendKeys(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_LM_tallyLength'), 
    '2')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_OK'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/img_Despatch Method_isc_QR'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_PICKU - Pick up From Store'))

WebUI.setText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Address_deliverToAddress1'), 
    'PO Box 1094')

//WebUI.sendKeys(findTestObject('Object Repository/POS_AccountCredit_Full_NT/Page_Frameworks (Demo)/input_SuburbCity_deliverToAddress2'),'Sanderson')
//WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_State_deliverToAddress3'), 'NT 0813')
//WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_State'))
//WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Post Code_postCodeShip'), '0813')
WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Refund_1'))

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

//WebUI.click(findTestObject('Object Repository/TS05_Cash_refund_Full/Page_Frameworks (Demo)/img_dropdownLogout'))
//WebUI.click(findTestObject('Object Repository/TS05_Cash_refund_Full/Page_Frameworks (Demo)/td_Logout'))
WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/img_dropdownLogout'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_Logout'))


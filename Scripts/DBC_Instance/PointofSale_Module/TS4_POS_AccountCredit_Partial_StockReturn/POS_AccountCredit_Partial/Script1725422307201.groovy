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

docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))

println(docketNumber)

sourceFile.close()

invoiceNumber = String.valueOf(((cell.getNumericCellValue()) as int))

println(invoiceNumber)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/burger_Menu'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_Credit Notes'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_New'))

transaction_Number = WebUI.getText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/transaction_Number'))

println(transaction_Number)

WebUI.setText(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'JOE CHILA (3379)')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_JOE CHILA (3379)'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/table_Select a Value'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Stock Return'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/table_Reason_isc_YX'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_E - Inv to wrong Custome'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_Original Docket_originalDocket'), 
    docketNumber)

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_BranchDropdown'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_228 - DEMONSTRATION BRANCH 228'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Load Details'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_CreditQty_Row1'))

WebUI.sendKeys(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/input_CreditQty_row1'), 
    '1')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_DBC/Page_Frameworks (Demo)/td_OK'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_DBC/Page_Frameworks (Demo)/table_Despatch Method_isc_OV'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_DBC/Page_Frameworks (Demo)/div_PickU - Pick up'))

WebUI.setText(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_DBC/Page_Frameworks (Demo)/input_Address_deliverToAddress1'), 
    '10 chila road')

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/td_State_isc_QJ'))

WebUI.click(findTestObject('Object Repository/TS4_POS_AccountCredit_Partial_DBC/Page_Frameworks (Demo)/div_VIC - Victoria (1)'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_DBC/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.click(findTestObject('Object Repository/TS3_POS_AccountCredit_Full_DBC/Page_Frameworks (Demo)/div_Refund'))


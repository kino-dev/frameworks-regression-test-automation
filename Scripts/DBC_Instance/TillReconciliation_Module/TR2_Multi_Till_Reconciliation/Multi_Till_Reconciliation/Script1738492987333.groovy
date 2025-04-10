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
import java.lang.Integer as Integers

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

//WebUI.navigateToUrl(DBC_Demo)
WebUI.navigateToUrl(env)

WebUI.setText(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo)/b_Till Reconciliation  Banking'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo)/td_Till Reconciliation'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_Find'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_SessionDate'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_SessionDate'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/a_Session_TransactionNumber'))

expectedValue = WebUI.getText(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/div_AmountExpectedValue'))

println(expectedValue)

expectedValue = expectedValue.replace('$', '')

println(expectedValue)

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/div_EftposTransactAmount'))

WebUI.sendKeys(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/input_EftposTransactAmount'), 
    expectedValue)

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_Complete'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/div_Complete'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_Deposit List'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/div_Print Deposit List_isc_L3'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_Bank'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/Page_Frameworks (Demo2)/img_AccountDropdown_icon'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/Page_Frameworks (Demo2)/div_Logout'))
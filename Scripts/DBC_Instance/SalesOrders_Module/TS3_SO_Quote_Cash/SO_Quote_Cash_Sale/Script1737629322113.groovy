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

WebUI.setText(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_New'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/img_Order_isc_GC'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Quote'))

WebUI.setText(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'joe chila')

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_JOE CHILA (3379)'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Desp. Method_isc_IN'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_PickU - Pick up'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/img_Follow-up Date_isc_IW'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_calendarDate'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.setText(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_P_idProd'), '594')

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_Quantity_qtyTran'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/img_addProduct'))

WebUI.setText(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_P_idProd'), 'PH2B9035')

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_Quantity_qtyTran'))

WebUI.setText(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/input_Tally_tallyText'), '1/3')

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/img_addProduct'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Accept Quote'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Accept This Date_isc_19C'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Save (S)_1'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Make Payment'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Please Select_isc_1IH'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_EFTPOS'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Pay'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/img_eftposPay'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Picker_isc_1SQ'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_228 Celestine Z'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Pick All'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Save (S)_1_2'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Check Picking'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_SaveClose (S)_1'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Release Order'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_29L'))

WebUI.click(findTestObject('Object Repository/TS3_SO_Quote_Cash/Page_Frameworks (Demo)/td_Release (S)'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/td_Kino Rafael Manalo (manaki)_toolsMenuButton'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout_1'))


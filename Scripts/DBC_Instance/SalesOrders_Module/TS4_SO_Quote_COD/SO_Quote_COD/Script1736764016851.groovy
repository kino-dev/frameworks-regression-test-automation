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

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_New'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_Order_isc_GC'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Quote'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_addCustomer'))

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Name_custName'), 'John Smith')

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Postal Address_postalAddress1'), 
    '123 DBC Street')

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Suburb_postalAddress2'), 'DBC')

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_State'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_VIC - Victoria'))

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Contact Name_custContact'), 
    'John')

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Phone (M)_phoneMobile'), '123 456 789')

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Save (S)'))

CustomerID = WebUI.getAttribute(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'value')

println(CustomerID)

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_Order Branch_isc_I2'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_228 - DEMONSTRATION BRANCH 228'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_Desp. Method_isc_II'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_PickU - Pick up'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_Follow-up Date_isc_IP'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_dateNum'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Save (S)_1'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_P_isc_1BE'))

WebUI.setText(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_S_searchText'), 'lm20')

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Find (F)'))

WebUI.sendKeys(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/input_CPLIZ104_qty'), '1')

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Add To Selections (A)'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Use Selections (S)'))

//
//
//println(salesorder_Number)
//
//salesorder_Number = salesorder_Number.replace('SO ', '')
//
//salesorder_Number = salesorder_Number.replace('/0', '')
//
//println(salesorder_Number)
//
//FileInputStream sourceFile = new FileInputStream(ExcelFile)
//
//XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)
//
//XSSFSheet sheet = workbook.getSheet('Sheet1')
//
//// cell B1
//Row row = sheet.getRow(0)
//
//Cell cell = row.getCell(1)
//
//row = sheet.createRow(1)
//
//cell = row.createCell(0)
//
//cell.setCellValue('SalesOrderNumber')
//
//cell = row.createCell(1)
//
//cell.setCellValue(salesorder_Number)
//
//FileOutputStream fos = new FileOutputStream(ExcelFile)
//
//workbook.write(fos)
//
//fos.close()
//
//sourceFile.close()
WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Logout'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Accept Quote'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Accept This Date_isc_1Y4'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Save (S)_1_2'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Make Payment'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Please Select_paymentmethod_dropdown'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_EFTPOS'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Pay'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/img_Check_EftposTransact'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Picker_dropdown'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_228 Celestine Z'))

WebUI.scrollToElement(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Pick All'), 0)

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Pick All'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Save (S)_1_2_3'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Check Picking'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_SaveClose (S)_CheckPicking'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Release Order'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_30D'))

WebUI.click(findTestObject('Object Repository/TS4_SO_Quote_COD/Page_Frameworks (Demo)/td_Release (S)'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))

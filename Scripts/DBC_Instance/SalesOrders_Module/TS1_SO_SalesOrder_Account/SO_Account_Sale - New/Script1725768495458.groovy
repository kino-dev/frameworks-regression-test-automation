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

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_New'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'JOE CHILA (3379)')

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_JOE CHILA (3379)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_Desp. Method_isc_IE'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Deliv - Delivery Ex Store'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/img_Date Required_isc_IN'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_setDate'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Address'), '10 chila road')

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_SuburbCity'), 'chilaville')

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/img_State'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_VIC - Victoria'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Post Code'), '3875')

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Agreed Price_agreedValueEx'))

WebUI.sendKeys(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Agreed Price_agreedValueEx'), 
    '65')

WebUI.scrollToElement(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/img_Delivery Area_search'), 
    2)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/img_Delivery Area_search'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/a_DLV0'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_Save (S)'))

//WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_Yes - Perform Save'))
salesorder_Number = WebUI.getText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/span_SOnumber'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_P_idProd'), 'PH2B9035')

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Quantity_qtyTran'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/input_Tally_tallyText'), 
    '1/3.0')

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Picker_isc_1HW'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_228 Celestine Z'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Pick All'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Check Picking'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Release Order'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_1YT'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/New_Interface/Page_Frameworks (Demo)/td_Release (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

println(salesorder_Number)

salesorder_Number = salesorder_Number.replace('SO ', '')

salesorder_Number = salesorder_Number.replace('/0', '')

println(salesorder_Number)

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(0)

Cell cell = row.getCell(1)

row = sheet.createRow(1)

cell = row.createCell(0)

cell.setCellValue('SalesOrderNumber')

cell = row.createCell(1)

cell.setCellValue(salesorder_Number)

FileOutputStream fos = new FileOutputStream(ExcelFile)

workbook.write(fos)

fos.close()

sourceFile.close()

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))


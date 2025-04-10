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

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo2/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_Password_password'), 
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/div_New'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/div_Order'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/div_Quote'))

//WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId'),
//    '2237')
//
//WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_PIN_pin'), '2237')
//
//WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_OK'))
WebUI.setText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_Customer_idCustX'), 
    'rocco tatti')

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Rocco Tatti (518432)'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_Cust Order_custOrderRef'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/td_Close (O)'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_501 - DEMONSTRATION BRANCH 501'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_510 - DEMONSTRATION BRANCH 510'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Desp. Method_isc_IH'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_PICK - Customer to Pick up'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/img_Follow-up Date_isc_IL'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Today'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Save (S)'))

WebUI.delay(8)

salesorder_Number = WebUI.getText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/span_SOnumber'))

WebUI.setText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_P_idProd'), '5155103')

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_Quantity_qtyTran'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo)/input_Tally_tallyText'), 
    '1/3')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/img_1'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Actions'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Mark as Entry Complete'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Save (S)_1_2_3'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Actions'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Accept Quote'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Confirm Date_1_2'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Today  7 Days_1_2'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Apply (S)_1_2'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Accept This Date_isc_1XE'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Save (S)_1_2_3_4_5_6'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_OK'))

WebUI.setText(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/input_Contact Phone_contactPhone'), 
    '000000000000')

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Save (S)_1_2_3_4'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Actions'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Mark as Entry Complete_1'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Confirm Date'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Today  7 Days'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Apply (S)'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Save (S)_1'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Actions'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Make Payment'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Please Select'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_EFTPOS'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Pay'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/img'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Actions'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Pick  Release'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Pick All'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Complete Picking'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Release Order'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Print Delivery Docket_isc_2SE'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Release (S)'))

//WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Confirm Date_1'))
//WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Today  7 Days_1'))
//WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Apply (S)_1'))
//WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Reason for Backorder_isc_30G'))
//WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Stock - Insufficient Stock'))
//WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/img_Y_isc_37Ticon'))
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

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/td_Kino Rafael Manalo (manaki)'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Sale_Cash/Page_Frameworks (Demo2)/div_Logout'))


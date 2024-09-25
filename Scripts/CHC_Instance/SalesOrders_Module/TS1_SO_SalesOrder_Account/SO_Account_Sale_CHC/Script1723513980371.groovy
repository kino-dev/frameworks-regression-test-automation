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

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Page_Frameworks (Demo)/input_Password_password'), 'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_New'))

//WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
//    '2237')
//
//WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_PIN_pin'), '2237')
//
//WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_OK'))
WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Customer_idCustX'), 'Lee Pearce')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Lee Pearce (518451)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Cust Order_custOrderRef'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Close (O)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Page_Frameworks (Demo)/img_Order Branch'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Page_Frameworks (Demo)/div_510 - DEMONSTRATION BRANCH 510'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Desp. Method_isc_12H'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_SUPP - Supplier Direct Delivery'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Date Required_isc_12O'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_setDate'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Address_deliverToAddress2'), 
    '154 Scott Street')

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_SuburbCity_deliverToAddress3'), 
    'Cairns')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_State_isc_14Q'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_QLD - Queensland'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Post Code_postCodeShip'), 
    '4870')

WebUI.scrollToElement(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Delivery Area_isc_18U'), 
    2)

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Delivery Area_isc_18U'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/a_Expo'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.delay(8)

salesorder_Number = WebUI.getText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/span_SOnumber'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_P_idProd'), '5155103')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Quantity_qtyTran'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Tally_tallyText'), '1/3')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_add'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Save Order'))

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Mark as Entry Complete'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Save_icon'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Pick All'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Release Order'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_2P4'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Release (S)'))

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


WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Accountdropd'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Logout'))


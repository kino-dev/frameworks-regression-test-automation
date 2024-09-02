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

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Password_password'), 
    '6hUhntXdJknVTuE5fOO5WA==')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/Transaction Processing'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/Purchase Orders_level3'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_New'))

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
    '2237')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_PIN_pin'), 
    'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_OK'))

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Supplier No_idSupp'), 
    'CHC511')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_BRANCH TFR CNS PAINT 511 (CHC511)'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Calendaricon'))

//update date element
WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Date'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_SUPP - Supplier Direct Delivery_isc_Q4'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_SUPP - Supplier Direct Delivery'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Order From_isc_VB'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/a_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/td_Save (S)'))

PurchaseOrder = WebUI.getText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/purchaseOrderNo'))

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_P_idProd'), '5006866')

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Quantity_qtyTran'), 
    '1')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_check'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Finalise Transfer'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Print Picking Slip_isc_19R'))

WebUI.delay(3)

println('first delay done, check print delivery docket for 15 secs, 15 secs starts now...')

WebUI.delay(3)

println('by this time it should be unticked already, proceeding to save in 15 secs... press cancel if not unticked')

WebUI.takeFullPageScreenshot()

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Despatch Method_isc_19B'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_SUPP - Supplier Direct Delivery'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_SaveIcon'))

SalesOrder = WebUI.getText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/a_Tfer SO'))

println(SalesOrder)

println(PurchaseOrder)

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(0)

Cell cell = row.getCell(1)

row = sheet.createRow(1)

cell = row.createCell(0)

cell.setCellValue('Purchase Order')

cell = row.createCell(1)

cell.setCellValue(PurchaseOrder)

row = sheet.createRow(2)

cell = row.createCell(0)

cell.setCellValue('Sales Order')

cell = row.createCell(1)

cell.setCellValue(SalesOrder)

FileOutputStream fos = new FileOutputStream(ExcelFile)

workbook.write(fos)

fos.close()

sourceFile.close()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Accountdropd'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Logout'))


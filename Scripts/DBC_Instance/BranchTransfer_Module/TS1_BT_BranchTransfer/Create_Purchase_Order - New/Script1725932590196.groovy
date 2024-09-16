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

//WebUI.switchToWindowTitle('Frameworks (Demo)')
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/Transaction Processing'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/td_Purchase_Orders_level3'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_New'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Supplier No_idSupp'), 
    'dbc202')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_DAHLSENS TRANSFERS BAIRNSDALE (DBC202)'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/img_Calendaricon'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_date'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/img_Shipping Basis_isc_GH'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_DLV - Supplier Delivery'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/img_Order From_isc_LB'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/a_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

PurchaseOrder = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/purchaseOrderNo'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_P_idProd'), 
    'cm20')

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Quantity_qtyTran'), 
    '1')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/img_add'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_P_idProd'), 
    'lm20')

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Quantity_qtyTran'), 
    '2')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Finalise Transfer'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Print Picking Slip'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/td_Save (S)_BT_SO_Details'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

SalesOrder = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Create_PurchaseOrder/Page_Frameworks (Demo)/a_Tfer SO'))

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

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))

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

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Object_Repo/img_FWs_Icon'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Object_Repo/Purchasing_Receipting_level1'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Object_Repo/Transaction_Processing_level2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Object_Repo/Purchase_Orders_level3'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Object_Repo/div_New_button'))

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_SupplierNo'), 'DBC223')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_DAHLSENS TRANSFERS ALBURY (DBC223)'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/img_Calendaricon'))

//update date element
WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_date'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/img_Shipping Basis_isc_G2'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_DLV - Supplier Delivery'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/img_Order From_isc_KW'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/a_1'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/td_Save (S)'))

PurchaseOrder = WebUI.getText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/purchaseOrderNo'))

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_P_idProd'), 'cm20')

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Quantity_qtyTran'), '1')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/img_check'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_P_idProd'), 'lm20')

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/input_Quantity_qtyTran'), '2')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/img_check'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Finalise Transfer'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/div_Print Picking Slip_isc_19X'))

WebUI.delay(5)

println('first delay done, check print delivery docket for 15 secs, 15 secs starts now...')

WebUI.delay(15)

println('by this time it should be unticked already, proceeding to save in 15 secs... press cancel if not unticked')

WebUI.takeFullPageScreenshot()

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/SaveButton2/Page_Frameworks (Demo)/td_Save (S)2'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

SalesOrder = WebUI.getText(findTestObject('Object Repository/Create_PurchaseOrder/Page_Frameworks (Demo)/a_Tfer SO'))

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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/AccountDropdown'))

WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/div_Logout'))


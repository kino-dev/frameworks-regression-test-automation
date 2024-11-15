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
Row row = sheet.getRow(2)

Cell cell = row.getCell(1)

SalesOrder = cell.getStringCellValue()

SalesOrder = SalesOrder.replace('Tfer SO: ', '')

println(SalesOrder)

row = sheet.getRow(1)

cell = row.getCell(1)

PurchaseOrder = cell.getStringCellValue()

PurchaseOrder = PurchaseOrder.replace('PO ', '')

println(PurchaseOrder)

sourceFile.close()

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

WebUI.navigateToUrl(DBC_Demo)

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/b_Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/td_Stock Receipting'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_Order_orderNo'), 
    PurchaseOrder)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/div_Find'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/a_PurchaseOrder_link'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_Docket Number_refSuppDocket'), 
    SalesOrder)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/div_Receipt Goods'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/img_ProductDashboard'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_Product_ProdId'), 
    'CM20')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/td_Find'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/div_Stock Movements'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyTextPresent(PurchaseOrder, false)

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_Product_prodId_1'), 
    'LM20')

WebUI.click(findTestObject('TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/td_Find_stockmovements'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyTextPresent(PurchaseOrder, false)

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/img_Branch_isc_1R7'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/div_202 - DEMONSTRATION BRANCH 202'))

WebUI.click(findTestObject('TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/td_Find_stockmovements'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyTextPresent(SalesOrder, false)

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/input_Product_prodId_1'), 
    'CM20')

WebUI.click(findTestObject('TS1_BT_BranchTransfer_DBC/New_Interface/Stock_Receipt/Page_Frameworks (Demo)/td_Find_stockmovements'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.verifyTextPresent(SalesOrder, false)

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))


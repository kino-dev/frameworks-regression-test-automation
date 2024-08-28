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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/img_FWs_icon'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/b_Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Stock Receipting'))

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Order_orderNo'), PurchaseOrder)

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/div_Find'))
WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/a_PurchaseOrder_link'))

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Docket Number_refSuppDocket'), 
    SalesOrder)

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/div_Receipt Goods'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/img_ProductDashboard'))

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Product_ProdId'), 'cm20')

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Find'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Stock Movements'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Product_prodId (1)'), 'LM20')

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Find_stockmovements'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/img_Branch_dropdown'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/div_223 - DEMONSTRATION BRANCH 223'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Find_stockmovements'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Product_prodId (1)'), 'CM20')

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Find_stockmovements'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/AccountDropdown'))

WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/div_Logout'))
WebUI.delay(3)
WebUI.takeFullPageScreenshot()


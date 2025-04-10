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

// cell B4 - DBC Demo 2 - remove comment to select which environment
Row currentSheet_row = sourceTestData_sheet.getRow(4)

// cell B1 - DBC Demo - remove comment to select which environment
//Row currentSheet_row = sourceTestData_sheet.getRow(1)
Cell currentSheet_cell = currentSheet_row.getCell(1)

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
DBC_Demo = currentSheet_cell.getStringCellValue()

println(DBC_Demo)

sourceTestData_FwksEnv.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

DBC_Demo = 'http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard'

WebUI.navigateToUrl(DBC_Demo)

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/td_Point Of Sale'))

invoiceNum = WebUI.getText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_invoiceNum'))

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_P_prodId'), 
    '594')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_P_prodId'), 
    'pfr7035')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/td_Tally Maintenance'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Quantity_Col'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_LM_tallyQuantity'), 
    '1')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Length_Col'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_LM_tallyLength'), 
    '3')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/td_Add'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_LM_tallyQuantity_1_2'), 
    '1')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Length_Col_Row2'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/input_LM_tallyLength_1_2'), 
    '2')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_FinishSale (S)'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/div_100 Cash'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/New_Interface/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))

FileInputStream sourceTestData_FwksEnv = new FileInputStream(Source_Env)

XSSFWorkbook sourceTestDataContainer_workbook = new XSSFWorkbook(sourceTestData_FwksEnv)

XSSFSheet sourceTestData_sheet = sourceTestDataContainer_workbook.getSheet('Sheet1')

// cell B4 - DBC Demo 2 - remove comment to select which environment
Row currentSheet_row = sourceTestData_sheet.getRow(4)

// cell B1 - DBC Demo - remove comment to select which environment
//Row currentSheet_row = sourceTestData_sheet.getRow(1)
Cell currentSheet_cell = currentSheet_row.getCell(1)

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
DBC_Demo = currentSheet_cell.getStringCellValue()

println(DBC_Demo)

sourceTestData_FwksEnv.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

DBC_Demo = 'http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard'

WebUI.navigateToUrl(DBC_Demo)

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/img_MenuIcon'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/td_Point Of Sale'))

invoiceNum = WebUI.getText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_invoiceNum'))

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_P_prodId'), '594')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_P_prodId'), 'pfr7035')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/td_Tally Maintenance'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_Quantity_Col'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_LM_tallyQuantity'), '1')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_Length_Col'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_LM_tallyLength'), '3')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/td_Add'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_LM_tallyQuantity_1_2'), 
    '1')

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_Length_Col_Row2'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/input_LM_tallyLength_1_2'), 
    '2')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_FinishSale (S)'))

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/div_100 Cash'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_POS_CashSale_DBC/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Page_Frameworks (Demo)/img_AccountDropdown'))

WebUI.click(findTestObject('Page_Frameworks (Demo)/div_Logout'))


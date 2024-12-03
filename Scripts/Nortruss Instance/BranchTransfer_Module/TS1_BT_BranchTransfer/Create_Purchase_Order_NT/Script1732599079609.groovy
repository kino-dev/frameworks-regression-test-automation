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

WebUI.navigateToUrl('http://frameworks.nt.nortruss.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_User ID_userid'), 
    'manaki')

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Password_password'), 
    'C5+8mNJ15mA=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_FW'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/b_Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Purchase Orders'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_New'))

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
    'uzzxF8+Oh1A=')

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_PIN_pin'), 
    'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_OK'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Supplier No_idSupp'), 
    'Branch1')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Nortruss Branch Transfer (Branch1)'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_1 - DEMONSTRATION BRANCH 001'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_2 - DEMONSTRATION BRANCH 002'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_Date Required_isc_FZ'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Today'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_Shipping Basis_isc_GD'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_PU - PICK UP FROM SUPP'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Pickup Method_isc_GY'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_PICKU - Pick up From Store'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Address_addressSupp1'), 
    'Kimberley')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Save (S)'))

//PurchaseOrder = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/purchaseOrderNo'))
PurchaseOrder = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/purchaseOrderNo'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_P_idProd'), '2014086')

WebUI.doubleClick(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Quantity_qtyTran_1'))

WebUI.sendKeys(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Quantity_qtyTran_1'), 
    '2')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_1'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Finalise Transfer'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Despatch Method_isc_17A'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_PICKU - Pick up From Store_1'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Save (S)_1_2'))

//SalesOrder = WebUI.getText(findTestObject('Page_Frameworks (Demo)/a_Tfer SO'))
SalesOrder = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/a_Tfer SO'))

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

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_dropdownLogout'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Logout'))


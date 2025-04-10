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

//WebUI.navigateToUrl(DBC_Demo)
WebUI.navigateToUrl(env)

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/img_Fwks_icon'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/b_Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/td_Purchase Orders'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_New'))

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_Supplier No_idSupp'), 
    'DBC223')

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_DAHLSENS TRANSFERS ALBURY (DBC223)'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/img_Date Required_isc_GA'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_31'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/td_Shipping Basis_isc_GM'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_PickU - Pickup from Supplier'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/td_Pickup Method'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/div_PickU - Pick up'))

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_Order From_nameShip'), 
    'joe chila')

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_Address_addressSupp1'), 
    'DBC 223')

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_P_idProd'), 'cm20')

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_Quantity_qtyTran'), '1')

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/img_AddProduct'))

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_P_idProd'), 'lm20')

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/input_Quantity_qtyTran'), '2')

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/img_AddProduct'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo)/div_Print Order'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/td_OutputType'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/div_E-mail'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/td_To_dropdown'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/div_Current User'))

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/input_Current User_emailRecipient'),
	'adil.karbhari@dahlsens.com.au')

WebUI.setText(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/textarea_Message_emailBodyText'),
	'Purchase Order - Automated test execution')

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/td_Go'))

WebUI.click(findTestObject('Object Repository/TS1_PO_PurchaseOrder/Page_Frameworks (Demo2)/td_Close (O)'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/td_Kino Rafael Manalo (manaki)_toolsMenuButton'))

WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout_1'))


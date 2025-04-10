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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo2/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/SO_Quote_COD_CHC/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/SO_Quote_COD_CHC/Page_Frameworks (Demo)/input_Password_password'), 
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/SO_Quote_COD_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/SO_Quote_COD_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/b_Purchasing  Receipting'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/span_Purchasing  Receipting_isc_78icon_10'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/td_Purchase Orders'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_New'))

WebUI.setText(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/input_Supplier No_idSupp'), 
    'Recochem')

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_Recochem Inc (RECOCHEM)'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_501 - DEMONSTRATION BRANCH 501'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_510 - DEMONSTRATION BRANCH 510'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/img_Date Required_isc_G6'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_7'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/td_Save (S)'))

WebUI.setText(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/input_P_idProd'), '5006866 ')

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/input_Quantity_qtyTran'), 
    '12')

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/img'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_Actions'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_Print Order'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/img_Print_isc_168'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_E-mail'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/td_Go'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/td_Kino Rafael Manalo (manaki)'))

WebUI.click(findTestObject('Object Repository/PO_Stock_PurchaseOrder_CHC/Page_Frameworks (Demo2)/div_Logout'))


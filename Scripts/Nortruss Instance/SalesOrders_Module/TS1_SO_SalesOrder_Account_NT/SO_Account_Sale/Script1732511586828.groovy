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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.nt.nortruss.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_User ID_userid'), 'manaki')

WebUI.setEncryptedText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_Password_password'), 
    'C5+8mNJ15mA=')

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/img_FW'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_New'))

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_Operator No_operatorId'), '2237')

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_PIN_pin'), '2237')

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_OK'))

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_Customer_idCustX'), '17179')

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Tiffany Brown (17179)'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/span'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/td_Close (O)_StaffChargeAccount'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/img_ALL - ALL DESPATCH TYPES_isc_IE'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Supp - Direct From Supplier'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/img_Date Required_isc_IL'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/td_Today'))

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_Address_deliverToAddress2'), 
    'PO Box 1094')

WebUI.scrollToElement(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_Post Code_postCodeShip'), 
    30)

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_Post Code_postCodeShip'), '0813')

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/td_Y_buttonPositiveActionFocusedOver'))

WebUI.setText(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/input_P_idProd'), '2014086')

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/img_1'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Pick All'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Release Order'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_1J3'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/td_Release (S)'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/img_dropdownLogout'))

WebUI.click(findTestObject('Object Repository/SalesOrder_NT/Page_Frameworks (Demo)/td_Logout'))


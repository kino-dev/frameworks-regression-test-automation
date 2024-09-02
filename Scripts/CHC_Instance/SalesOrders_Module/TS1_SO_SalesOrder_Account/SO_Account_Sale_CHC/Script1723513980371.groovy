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

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Password_password'), 
    '6hUhntXdJknVTuE5fOO5WA==')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_New'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
    '2237')

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_PIN_pin'), '2237')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_OK'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Customer_idCustX'), 'Lee Pearce')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Lee Pearce (518451)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Desp. Method_isc_12H'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Close (O)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_SUPP - Supplier Direct Delivery'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Date Required_isc_12O'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_setDate'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Address_deliverToAddress2'), 
    '154 Scott Street')

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_SuburbCity_deliverToAddress3'), 
    'Cairns')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_State_isc_14Q'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_QLD - Queensland'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Post Code_postCodeShip'), 
    '4870')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Delivery Area_isc_18U'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/a_Expo'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_P_idProd'), '5155103')

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Quantity_qtyTran'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/input_Tally_tallyText'), '1/3')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_add'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Save Order'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Mark as Entry Complete'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/img_Save_icon'))

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Actions'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Pick All'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Release Order'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_2P4'))

WebUI.delay(3)

println('first delay done, check print delivery docket for 15 secs, 15 secs starts now...')

WebUI.delay(3)

println('by this time it should be unticked already, proceeding to save in 15 secs... press cancel if not unticked')

WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sales_Orders_CHC/Page_Frameworks (Demo)/td_Release (S)'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Accountdropd'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Logout'))



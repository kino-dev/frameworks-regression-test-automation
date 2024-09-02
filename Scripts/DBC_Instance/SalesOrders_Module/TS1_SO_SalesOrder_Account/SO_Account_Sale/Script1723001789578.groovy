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

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Object_Repo/img_FWs_Icon'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_New (1)'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Customer_idCustX_1 (1)'), 'JOE CHILA (3379)')

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_JOE CHILA (3379) (1)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/img_Desp. Method_dropdown (1)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Deliv - Delivery Ex Store'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/img_Calendar_icon'))

WebUI.click(findTestObject('Sales_Orders/Page_Frameworks (Demo)/div_setDate'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Address'), '10 chila road')

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_SuburbCity'), 'chilaville')

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/img_State_dropdown'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_VIC - Victoria'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Post Code'), '3875')

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/img_Delivery Area_search'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/a_DLV0'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Contact Name_contactName'), 'test manaki')

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Contact Phone_contactPhone'), 
    '0476985205')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/td_Save (S)'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_P_idProd'), 'PH2B9035')

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Quantity_qtyTran'))

WebUI.setText(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/input_Tally_tallyText_1'), '1/3.0')

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/img_add'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Actions'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Pick  Release'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Picker_isc_1GH'))

WebUI.click(findTestObject('Object Repository/Stock_Receipt/Page_Frameworks (Demo)/div_228 Celestine Z'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Pick All'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/td_Save (S)_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Complete Picking'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Check Picking'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Release Order'))

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_1WC'))

WebUI.delay(3)

println('first delay done, check print delivery docket for 15 secs, 15 secs starts now...')

WebUI.delay(3)

println('by this time it should be unticked already, proceeding to save in 15 secs... press cancel if not unticked')

WebUI.takeFullPageScreenshot()

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Sales_Orders/Page_Frameworks (Demo)/td_Release (S)'))

WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/AccountDropdown'))

WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/div_Logout'))


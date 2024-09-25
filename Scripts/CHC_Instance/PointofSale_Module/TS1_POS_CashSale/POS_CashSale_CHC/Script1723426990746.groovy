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
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_Point Of Sale'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

//WebUI.setText(findTestObject('Object Repository/Pick_Release_SO_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
//    '2237')
//
//WebUI.setEncryptedText(findTestObject('Object Repository/Pick_Release_SO_CHC/Page_Frameworks (Demo)/input_PIN_pin'), 'uzzxF8+Oh1A=')
//
//WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_OK'))

WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_P_prodId'), '5006866')

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_P_prodId'), '5155103')

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_Quantity_quantityOrdered'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_Tally Maintenance'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_Quantity_Col'))

WebUI.sendKeys(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_LM_tallyQuantity'), '1')

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_Length_Col'))

WebUI.sendKeys(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_LM_tallyLength'), '3')

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_Add'))

WebUI.sendKeys(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_LM_tallyQuantity_1'), '1')

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_Length_Col_Row2'))

WebUI.sendKeys(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_LM_tallyLength_1'), '2')

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/img_add'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_FinishSale (S)'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_50 Cash'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/td_SaveClose (S)'))

//WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_Operator No_operatorId_1'), 
//    '2237')
//
//WebUI.setText(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/input_PIN_pin_1'), '2237')
//
//WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/div_OK_1'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/img_Accountdropd'))

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Logout'))


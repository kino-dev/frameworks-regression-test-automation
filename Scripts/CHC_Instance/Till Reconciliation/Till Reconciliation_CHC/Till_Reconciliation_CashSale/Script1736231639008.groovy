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

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo2/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_User ID_userid'), 
    'BvRmjN+0xFM=')

WebUI.setEncryptedText(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/input_Password_password'), 
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/Create_PurchaseOrder_CHC/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/POS_CashSale_CHC/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/b_Till Reconciliation  Banking'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Till Reconciliation'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/div_Locked_isc_9D'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/div_Reconciled_isc_9J'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Find'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/td_Lock'))

WebUI.click(findTestObject('Object Repository/TR1_Till_Reconciliation/Page_Frameworks (Demo2)/div_Lock'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/div_Locked_isc_9D_1'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Find_1'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/div_0.00'))

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/input_amountActual'), 
    '7.95')

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Complete'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/div_Complete'))

//WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Deposit List'))
//WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/div_Print Deposit List_isc_L2'))
//WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Bank'))
WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Kino Rafael Manalo (manaki)'))

WebUI.click(findTestObject('Object Repository/TR_TillReconciliation_CashSale/Page_Frameworks (Demo2)/td_Logout'))


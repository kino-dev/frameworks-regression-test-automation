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

sourceFile.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.dahlsens.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/input_Password_password'), 'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Object_Repo/img_FWs_Icon'))

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/Sales_TransactionProcessing'))

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.delay(3)
WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/input_Order_orderNo'), SalesOrder)

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Find'))

WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/SalesOrderLink'))

WebUI.delay(5)
WebUI.takeFullPageScreenshot()

SalesOrderValidate = WebUI.getText(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/SO_Value_Tab'))

SalesOrderValidate = SalesOrderValidate.replace('SO ', '')

SalesOrderValidate = SalesOrderValidate.replace('/0', '')

if (SalesOrder == SalesOrderValidate) {
    println('yes it is same' + SalesOrder)

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Actions'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Pick  Release'))
	
	WebUI.delay(3)
	WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/td_OK'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/img_Delivery Area_searchIcon'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/a_DLV0'))

    WebUI.setText(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/input_Contact Name_contactName'), contactName)

    WebUI.click(findTestObject('FW_PR_SO/Page_Frameworks (Demo)/input_Contact Phone_contactPhone'))

    WebUI.setText(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/input_Contact Phone_contactPhone'), contactPhone)
	
	WebUI.delay(3)
	WebUI.takeFullPageScreenshot()
	
    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Actions'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Pick  Release'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/img_Picker_dropdown'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_223 Bob'))

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/PickQty_cm20'))

    WebUI.sendKeys(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/Page_Frameworks (Demo)/input_pickedQty'), 
        '1')

    WebUI.delay(3)

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/PickQty_lm20'))

    WebUI.sendKeys(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/Page_Frameworks (Demo)/input_pickedQty'), 
        '2')
	
	WebUI.delay(3)
	WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/td_Save (S)'))

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Complete Picking'))

    WebUI.delay(2)
	WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Check Picking'))

    WebUI.delay(2)
	WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/td_SaveClose (S)'))

    WebUI.delay(2)
	WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Release Order'))

    WebUI.delay(2)
	WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/div_Print Delivery Docket'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.delay(5)

    println('first delay done, check print delivery docket for 15 secs, 15 secs starts now...')

    WebUI.delay(15)
	
	println('by this time it should be unticked already, proceeding to save in 15 secs... press cancel if not unticked')
	
	WebUI.takeFullPageScreenshot()
	
	WebUI.delay(15)

    WebUI.click(findTestObject('Object Repository/FW_PR_SO/Page_Frameworks (Demo)/td_Release (S)'))
	
    WebUI.delay(5)
	
	WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/AccountDropdown'))
	WebUI.delay(3)
	
	WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/div_Logout'))
	WebUI.delay(3)
	WebUI.takeFullPageScreenshot()
} else {
    println('No it is not same.')

    println(SalesOrder)

    println(SalesOrderValidate)

    WebUI.takeFullPageScreenshot('')
	
	
	WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/AccountDropdown'))
	
	WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/div_Logout'))
	WebUI.delay(3)
	WebUI.takeFullPageScreenshot()
}


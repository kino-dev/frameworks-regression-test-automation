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

//Get the demo environment URL from test data container
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

WebUI.navigateToUrl(DBC_Demo)

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/input_User ID_userid'), 
    userName)

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/input_Password_password'), 
    'FHoXGFMjtD0=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/Fws_Menu'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/input_Order_orderNo'), 
    SalesOrder)

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Find'))

WebUI.delay(2)

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/SalesOrderLink'))

WebUI.delay(3)

WebUI.takeFullPageScreenshot()

SalesOrderValidate = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/SO_Value_Tab'))

SalesOrderValidate = SalesOrderValidate.replace('SO ', '')

SalesOrderValidate = SalesOrderValidate.replace('/0', '')

if (SalesOrder == SalesOrderValidate) {
    println('yes it is same' + SalesOrder)

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Actions'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Pick  Release'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/td_OK'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/img_Delivery Area_isc_XX'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/a_DLV0'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Actions'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Pick  Release'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/img_Picker_dropdown'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_202 Bairnsdale Trade'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/PickQty_cm20'))

    WebUI.sendKeys(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/input_pickedQty'), 
        '1')

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/PickQty_lm20'))

    WebUI.sendKeys(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/input_pickedQty'), 
        '2')

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/td_Save (S) - Order Details'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Complete Picking'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Check Picking'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/td_SaveClose (S) - Check Picking'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Release Order'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_1R0'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_DBC/New_Interface/Pick_Release_SO/Page_Frameworks (Demo)/td_Release (S)'))

    WebUI.delay(2)

    WebUI.takeFullPageScreenshot()

    WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/img_AccountDropdown'))

    WebUI.click(findTestObject('Object Repository/TS2_POS_AccountSale_DBC/New_Interface/Page_Frameworks (Demo)/div_Logout'))
} else {
    println('No it is not same.')

    println(SalesOrder)

    println(SalesOrderValidate)

    WebUI.takeFullPageScreenshot('')

    WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/AccountDropdown'))

    WebUI.click(findTestObject('Object Repository/Logout_Objects/Object_Repo/div_Logout'))
}


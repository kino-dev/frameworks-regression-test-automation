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

WebUI.navigateToUrl('http://frameworks.nt.nortruss.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_User ID_userid'), 
    'manaki')

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Password_password'), 
    'C5+8mNJ15mA=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_FW'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Sales Orders'))

WebUI.setText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/Sales_Td'), SalesOrder)

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Find'))

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/a_00401492'))

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_Operator No_operatorId'), 
    'uzzxF8+Oh1A=')

WebUI.setEncryptedText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/input_PIN_pin'), 
    'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_OK'))

SalesOrderValidate = WebUI.getText(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/span_SO 4014940'))

SalesOrderValidate = SalesOrderValidate.replace('SO ', '')

SalesOrderValidate = SalesOrderValidate.replace('/0', '')

if (SalesOrder == SalesOrderValidate) {
    println('yes it is same' + SalesOrder)

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Actions'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Pick  Release'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Pick All'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Complete Picking'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Release Order'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/div_Print Delivery Docket_isc_1IB'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Release (S)'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/img_dropdownLogout'))

    WebUI.click(findTestObject('Object Repository/TS1_BT_BranchTransfer_NT/Page_Frameworks (Demo)/td_Logout'))
}


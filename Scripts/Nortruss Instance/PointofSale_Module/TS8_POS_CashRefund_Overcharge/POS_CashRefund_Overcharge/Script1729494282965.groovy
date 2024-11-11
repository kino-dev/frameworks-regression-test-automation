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
//additional imports
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.Integer as Integer
//additional imports
FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(1)

Cell cell = row.getCell(1)

//docketNumber = String.valueOf(((cell.getNumericCellValue()) as int))
docketNumber = cell.getStringCellValue()

println(docketNumber)

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.nt.nortruss.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_User ID_userid'), userName)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Password_password'), 'C5+8mNJ15mA=')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_FW'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_Credit Notes'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_New'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Operator No_operatorId'), 'uzzxF8+Oh1A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_PIN_pin'), 'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_OK'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_Select a Value_isc_FP'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Overcharge'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_Reason_isc_FX'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_02 - Overcharged'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Original Docket_originalDocket'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Original Docket_originalDocket'),  docketNumber)

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_No line items loaded'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Load Details'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_0.0000'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Frameworks (Demo)/input_EA_unitSellBrowse'), '5.09')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_2014086CEMENT GP 20KG NORTHERN CEMENT40_a57d0d'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Finish (S)'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_Cash_isc_R4'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_EFTPOS'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Refund_1'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_dropdownLogout'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_Logout'))


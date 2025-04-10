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
//additional imports
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import org.apache.poi.xssf.usermodel.XSSFSheet as XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.lang.Integer as Integer

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(1)

Cell cell = row.getCell(1)

//CustomerID = String.valueOf(((cell.getNumericCellValue()) as int))
CustomerID = cell.getStringCellValue()

println(CustomerID)

sourceFile.close()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.cairnshardware.com.au:8080/FWDemo2/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.delay(3)

WebUI.sendKeys(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo)/input_User ID_userid'), 
    'manaki')

WebUI.setEncryptedText(findTestObject('Object Repository/Validate_SO_Quote_Account/Page_Frameworks (Demo)/input_Password_password'), 
    'BvRmjN+0xFM=')

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/div_Login'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/img'))

WebUI.setText(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/input_Customer No_CustId'), 
    CustomerID)

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/td_Find'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/div_Invoices, Orders, Quotes, Projects  Jobs'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/td_Find Invoices'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/td_Kino Rafael Manalo (manaki)'))

WebUI.click(findTestObject('Object Repository/SO_Quote_Cash_Validate/Page_Frameworks (Demo2)/div_Logout'))


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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://frameworks.nt.nortruss.com.au:8080/FWDemo/Fluid.html#homeDashboard,dash,Frameworks.Activity.Menu.HomeDashBoard')

WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_User ID_userid'), 'manaki')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Password_password'), 'C5+8mNJ15mA=')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Login'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_FW'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/b_Transaction Processing'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_Point Of Sale'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Operator No_operatorId'), 'uzzxF8+Oh1A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_PIN_pin'), 'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_OK'))

invoiceNum = WebUI.getText(findTestObject('Object Repository/Page_Frameworks (Demo)/div_invoiceNum'))

println(invoiceNum)

WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_m_customerIdX'), '17179')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Tiffany Brown (17179)'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/input_P_prodId'))

WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_P_prodId'), '2023191')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_1'))

WebUI.setText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_LM_tallyQuantity_1'), '2')

WebUI.doubleClick(findTestObject('Object Repository/Page_Frameworks (Demo)/div_0.000'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Frameworks (Demo)/input_LM_tallyLength'), '2')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/td_SaveClose (S)'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_1'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_FinishSale (S)'))

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_Pay'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_Operator No_operatorId_1'), 'uzzxF8+Oh1A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Frameworks (Demo)/input_PIN_pin_1'), 'uzzxF8+Oh1A=')

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/div_OK_1'))

FileInputStream sourceFile = new FileInputStream(ExcelFile)

XSSFWorkbook workbook = new XSSFWorkbook(sourceFile)

XSSFSheet sheet = workbook.getSheet('Sheet1')

// cell B1
Row row = sheet.getRow(0)

Cell cell = row.getCell(1)

row = sheet.createRow(1)

cell = row.createCell(0)

cell.setCellValue('Invoice Number')

cell = row.createCell(1)

cell.setCellValue(invoiceNum)

FileOutputStream fos = new FileOutputStream(ExcelFile)

workbook.write(fos)

fos.close()

sourceFile.close()

WebUI.click(findTestObject('Object Repository/Page_Frameworks (Demo)/img_dropdownLogout'))

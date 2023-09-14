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

WebUI.openBrowser('https://invoice.stg.mauju.com/login')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/div_Invoices'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_Invoices'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/span_0000022'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_Edit Invoice'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/svg_Save_MuiSvgIcon-root MuiSvgIcon-fontSiz_b59e22'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_29'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_Add A Line'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/div_Hl PhoneAkuRp 56.000'))

WebUI.click(findTestObject('APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_X'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/dropdown_terms'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/li_On specific date'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/span_Request of a deposit of payment in advanced'))

WebUI.setText(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/input_Flat Amount_r1f'), '20')

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/path'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/svg_March 2023_MuiSvgIcon-root MuiSvgIcon-f_567d1a'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/INVOICE/Edit Invoice/Page_Mauju/button_29'))


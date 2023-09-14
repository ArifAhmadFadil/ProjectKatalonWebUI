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

WebUI.navigateToUrl('https://invoice.stg.mauju.com/login')

WebUI.setText(findTestObject('APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('APP INVOICE/USER/Login/button_Sign In'))

WebUI.click(findTestObject('APP INVOICE/USER/Login/owner'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Tax/Page_Mauju/div_Items  Services'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/New Tax/Page_Mauju/button_New Item'))

WebUI.click(findTestObject('APP INVOICE/ITEMSERVICE/New Tax/Page_Mauju/p_Add Tax'))

WebUI.setText(findTestObject('APP INVOICE/ITEMSERVICE/New Tax/txt_name_tax'), 'OOP')

WebUI.setText(findTestObject('APP INVOICE/ITEMSERVICE/New Tax/txt_rate_tax'), '15')

WebUI.setText(findTestObject('APP INVOICE/ITEMSERVICE/New Tax/txt_number_tax'), '12')

WebUI.click(findTestObject('APP INVOICE/ITEMSERVICE/New Tax/btn_save_tax'))

Mobile.delay(15)

WebUI.closeBrowser()


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

//Link Website
WebUI.navigateToUrl('https://invoice.stg.mauju.com/login')

//Login
WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/button_Sign In'))

Mobile.delay(3)

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/div_Settings'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/div_Company Profile'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/button_Change'))

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_Company Name_company_name'), 'R')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_Street Address_street_address'), 'Manahan')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_City_city'), 'Solo')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_State_state'), 'Kalasan')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_Zip Code_zip_code'), '45254')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_Bussines Phone_bussines_phone'), '072152515')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input__mobile_phone'), '81356585425')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input__whatsapp_phone'), '25654851884')

WebUI.setText(findTestObject('Object Repository/APP INVOICE/SETTINGS/Company Profile/Page_Mauju/input_Terms_terms'), 'OKELAH')

WebUI.click(findTestObject('APP INVOICE/SETTINGS/Company Profile/Page_Mauju/button_Save'))

Mobile.delay(10)

WebUI.closeBrowser()


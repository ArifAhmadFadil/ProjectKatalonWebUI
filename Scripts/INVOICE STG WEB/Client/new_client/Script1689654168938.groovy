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

//Login
WebUI.setText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__email'), 'nav54867@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/USER/Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/APP INVOICE/USER/Login/owner'))

//Client
WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/btn_span_clients'))

WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/btn_new_client'))

WebUI.delay(5)

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_frist_name'), 'Ibrahim')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_last_name'), 'Musa')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_company_name'), 'PT HAILUHIDUA')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_email'), 'arfafadil76@gmail.com')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_phone_number'), '081367242096')

WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/btn_add_another_phone'))

WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/txt_select_country'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/li_indonesia'))

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_mobile_number_phone'), '85161475865')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_business_phone_number'), '085452366525')

WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/btn_add_address'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_city'), 'MADINAH')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_state'), 'JADAHH')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_street1'), 'OWL')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_street2'), 'OLIPOL')

WebUI.setText(findTestObject('APP INVOICE/CLIENT/New Client/txt_zip_code'), '5865585')

WebUI.click(findTestObject('APP INVOICE/CLIENT/New Client/btn_Save_Client'))


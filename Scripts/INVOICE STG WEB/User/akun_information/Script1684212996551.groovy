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

//Link Web
WebUI.navigateToUrl('https://invoice.stg.mauju.com/login')

//Login
WebUI.setText(findTestObject('APP INVOICE/USER/Login/input__email'), 'fsama03@gmail.com')

WebUI.setEncryptedText(findTestObject('APP INVOICE/USER/Login/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/APP INVOICE/USER/Akun_Invormations/Page_Mauju/button_Sign In'))

//Add Information Akun
WebUI.setText(findTestObject('APP INVOICE/USER/Akun_Invormations/txt_first_name'), 'Juli')

WebUI.setText(findTestObject('APP INVOICE/USER/Akun_Invormations/txt_last_name'), 'Ah')

WebUI.setText(findTestObject('APP INVOICE/USER/Akun_Invormations/txt_company_name'), 'PT.KANAMAN')

WebUI.setText(findTestObject('APP INVOICE/USER/Akun_Invormations/txt_zip_code'), '2255')

WebUI.click(findTestObject('APP INVOICE/USER/Akun_Invormations/txt_select_country'))

WebUI.click(findTestObject('APP INVOICE/USER/Akun_Invormations/li_indonesia'))

WebUI.click(findTestObject('APP INVOICE/USER/Akun_Invormations/btn_selesai'))

WebUI.click(findTestObject('APP INVOICE/USER/Akun_Invormations/btn_cancle_confirm_user_wizard'))


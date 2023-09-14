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

WebUI.click(findTestObject('Object Repository/APP INVOICE/ITEMSERVICE/Sdr Item Service/SDR__Client/Page_Mauju/div_Clients'))

WebUI.setText(findTestObject('APP INVOICE/CLIENT/Sdr Client/txt_serach_client'), '')

WebUI.click(findTestObject('APP INVOICE/CLIENT/Sdr Client/multiple_delete'))

WebUI.click(findTestObject('APP INVOICE/CLIENT/Sdr Client/dropdown_batch_actions'))

WebUI.click(findTestObject('APP INVOICE/CLIENT/Sdr Client/brn_dlte'))

WebUI.click(findTestObject('APP INVOICE/ITEMSERVICE/Sdr Item Service/btn_confirm_ok'))

WebUI.click(findTestObject('APP INVOICE/CLIENT/Sdr Client/btn_span_restore'))

WebUI.click(findTestObject('APP INVOICE/CLIENT/Sdr Client/btn_action_restore'))

